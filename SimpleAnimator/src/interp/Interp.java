/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package interp;

import parser.*;
import Asl.*;

import java.util.Random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.io.*;
import interp.SVGParser;

/** Class that implements the interpreter of the language. */

public class Interp {

    /** Memory of the virtual machine. */
    private Stack Stack;

    /**
     * Map between function names (keys) and ASTs (values).
     * Each entry of the map stores the root of the AST
     * correponding to the function.
     */
    private HashMap<String,AslTree> FuncName2Tree;

    /** Standard input of the interpreter (System.in). */
    private Scanner stdin;

    /**
     * Stores the line number of the current statement.
     * The line number is used to report runtime errors.
     */
    private int linenumber = -1;

    /** File to write the trace of function calls. */
    private PrintWriter trace = null;

    /** Nested levels of function calls. */
    private int function_nesting = -1;
    
    class TimeAnnotation {
        double begin;
        double duration;   
    }

    private TimeAnnotation currentTimeAnnotation = null;

    private int newId = 0;

    private SVGParser svgParser;

    /**
     * Constructor of the interpreter. It prepares the main
     * data structures for the execution of the main program.
     */
    public Interp(AslTree T, String tracefile, String filename) {
        assert T != null;

        // Add the definitions to the SVG file
        if (filename == null) svgParser = new SVGParser();
        else svgParser = new SVGParser(filename); 

        if (T.getChild(1).getType() == AslLexer.DEFINES) {
            svgParser.addDefinitions(T.getChild(1));
        } 

        T = T.getChild(2);
        MapFunctions(T);  // Creates the table to map function names into AST nodes
        PreProcessAST(T); // Some internal pre-processing ot the AST
        Stack = new Stack(); // Creates the memory of the virtual machine
        // Initializes the standard input of the program
        stdin = new Scanner (new BufferedReader(new InputStreamReader(System.in)));
        if (tracefile != null) {
            try {
                trace = new PrintWriter(new FileWriter(tracefile));
            } catch (IOException e) {
                System.err.println(e);
                System.exit(1);
            }
        }
        function_nesting = -1;
    }

    /** Runs the program by calling the main function without parameters. */
    public void Run() {

        executeFunction ("main", null);
        svgParser.writeSVGFile();
    }

    /** Returns the contents of the stack trace */
    public String getStackTrace() {
        return Stack.getStackTrace(lineNumber());
    }

    /** Returns a summarized contents of the stack trace */
    public String getStackTrace(int nitems) {
        return Stack.getStackTrace(lineNumber(), nitems);
    }
    
    /**
     * Gathers information from the AST and creates the map from
     * function names to the corresponding AST nodes.
     */
    private void MapFunctions(AslTree T) {
        assert T != null && T.getType() == AslLexer.LIST_FUNCTIONS;
        FuncName2Tree = new HashMap<String,AslTree> ();
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) {
            AslTree f = T.getChild(i);
            assert f.getType() == AslLexer.FUNC;
            String fname = f.getChild(0).getText();
            if (FuncName2Tree.containsKey(fname)) {
                throw new RuntimeException("Multiple definitions of function " + fname);
            }
            FuncName2Tree.put(fname, f);
        } 
    }

    /**
     * Performs some pre-processing on the AST. Basically, it
     * calculates the value of the literals and stores a simpler
     * representation. See AslTree.java for details.
     */
    private void PreProcessAST(AslTree T) {
        if (T == null) return;
        switch(T.getType()) {
            case AslLexer.INT: T.setIntValue(); break;
            case AslLexer.STRING: T.setStringValue(); break;
            case AslLexer.BOOLEAN: T.setBooleanValue(); break;
            default: break;
        }
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) PreProcessAST(T.getChild(i));
    }

    /**
     * Gets the current line number. In case of a runtime error,
     * it returns the line number of the statement causing the
     * error.
     */
    public int lineNumber() { return linenumber; }

    /** Defines the current line number associated to an AST node. */
    private void setLineNumber(AslTree t) { linenumber = t.getLine();}

    /** Defines the current line number with a specific value */
    private void setLineNumber(int l) { linenumber = l;}
    
    /**
     * Executes a function.
     * @param funcname The name of the function.
     * @param args The AST node representing the list of arguments of the caller.
     * @return The data returned by the function.
     */
    private Data executeFunction (String funcname, AslTree args) {

        svgParser.enterFunction();

        // Get the AST of the function
        AslTree f = FuncName2Tree.get(funcname);
        if (f == null) throw new RuntimeException(" function " + funcname + " not declared");

        if (funcname.equals("main")) {
            AslTree par = f.getChild(1);
            args = new AslTree(par.token);
            int n = (int) par.getChildCount()/2;
            for (int i = 0 ; i < n; i++) {
                args.addChild(par.getChild(n));
                par.deleteChild(n);
            }
        }

        // Gather the list of arguments of the caller. This function
        // performs all the checks required for the compatibility of
        // parameters.
        ArrayList<Data> Arg_values = listArguments(f, args);

        // Dumps trace information (function call and arguments)
        if (trace != null) traceFunctionCall(f, Arg_values);
        
        // List of parameters of the callee
        AslTree p = f.getChild(1);
        int nparam = p.getChildCount(); // Number of parameters

        // Create the activation record in memory
        Stack.pushActivationRecord(funcname, lineNumber());

        // Track line number
        setLineNumber(f);
         
        // Copy the parameters to the current activation record
        for (int i = 0; i < nparam; ++i) {
            String param_name = p.getChild(i).getText();
            Stack.defineVariable(param_name, Arg_values.get(i));
        }

        // Execute the instructions
        Data result = executeListInstructions (f.getChild(2));

        // If the result is null, then the function returns void
        if (result == null) result = new Data();
        
        // Dumps trace information
        if (trace != null) traceReturn(f, result, Arg_values);
        
        // Destroy the activation record
        Stack.popActivationRecord();

        svgParser.exitFunction();

        return result;
    }

    /**
     * Executes a block of instructions. The block is terminated
     * as soon as an instruction returns a non-null result.
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the block of instructions.
     * @return The data returned by the instructions (null if no return
     * statement has been executed).
     */
    private Data executeListInstructions (AslTree t) {
        assert t != null;
        Data result = null;
        int ninstr = t.getChildCount();
        for (int i = 0; i < ninstr; ++i) {
            result = executeInstruction (t.getChild(i));
                        
            if (result != null) {
                return result;
            }
        }
        return null;
    }
    
    /**
     * Executes an instruction. 
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the instruction.
     * @return The data returned by the instruction. The data will be
     * non-null only if a return statement is executed or a block
     * of instructions executing a return.
     */
    private Data executeInstruction (AslTree t) {
        assert t != null;
        
        setLineNumber(t);
        Data value; // The returned value

        if ((t.getType() != AslLexer.ANIMATION && (t.getChild(1) != null && t.getChild(1).getType() != AslLexer.ANIMATION ) )  && currentTimeAnnotation != null) {
            throw new RuntimeException("Bad placement of Time Annotation: not followed by an animation instruction (Move, Tranlate, Rotate, Modify or Destroy)");
        }
                
        // A big switch for all type of instructions
        switch (t.getType()) {

            case AslLexer.CREATE:
                Data newObject = createObject(t);
                Stack.defineVariable("newObject"+newId, newObject);
                svgParser.createSVGObject("newObject"+newId, newObject);
                newId++;
                return null;
            case AslLexer.DESTROY:
                value = createAnimation(t);
                svgParser.addSVGAnimation(value.getAnimationIdObject(),"newAnimation"+newId, value);
                newId++;
                return null;
            case AslLexer.GROUP:
                return null;
            case AslLexer.TIMEANNOTATION:
                currentTimeAnnotation = new TimeAnnotation();
                Data aux = evaluateExpression(t.getChild(0));
                currentTimeAnnotation.begin = (double) aux.getDoubleValue();
                if (t.getChild(1) != null) {
                    if (t.getChild(1).getType() == AslLexer.END) {
                        aux = evaluateExpression(t.getChild(1).getChild(0));
                        double end = (double) aux.getDoubleValue();
                        currentTimeAnnotation.duration = end - currentTimeAnnotation.begin;
                    } else {
                        aux = evaluateExpression(t.getChild(1).getChild(0));
                        currentTimeAnnotation.duration = (double) aux.getDoubleValue();
                    }
                } else currentTimeAnnotation.duration = 0;
                return null;
            case AslLexer.ANIMATION:

                if (currentTimeAnnotation == null) throw new RuntimeException("Animation instruction doesn't have a proper previous Time Annotation");

                Data newAnimation = createAnimation(t);
                Stack.defineVariable ("newAnimation"+newId, newAnimation);
                svgParser.addSVGAnimation(newAnimation.getAnimationIdObject(),"newAnimation"+newId, newAnimation);

                newId++;
                currentTimeAnnotation = null;
                return null;
            // Assignment
            case AslLexer.ASSIGN:
                value = null;
                if (Stack.isObject(t.getChild(0).getText())){
                    svgParser.eliminaObject(t.getChild(0).getText());
                }
                if (t.getChild(1).getType() == AslLexer.CREATE) {
                    value = createObject(t.getChild(1));
                    svgParser.createSVGObject(t.getChild(0).getText(), value);
                } else if (t.getChild(1).getType() == AslLexer.GROUP) {
                    List<String> idObjects = new ArrayList<String>();
                    for (int i = 0; i < t.getChild(1).getChildCount(); ++i) {
                        idObjects.add(t.getChild(1).getChild(i).getText());
                    }
                    svgParser.createSVGGroup(t.getChild(0).getText(), idObjects);
                    value = new Data("Group",0,0,0,0,"",0,"",0,0,0,"");

                } else if (t.getChild(1).getType() == AslLexer.ANIMATION) {
                    if (currentTimeAnnotation == null) throw new RuntimeException("Animation instruction doesn't have a proper previous Time Annotation");
                    value = createAnimation(t.getChild(1));
                    svgParser.addSVGAnimation(value.getAnimationIdObject(), t.getChild(0).getText(), value);
                    currentTimeAnnotation = null;
                } else if (t.getChild(1).getType() == AslLexer.ID) {
                    value = new Data(Stack.getVariable(t.getChild(1).getText()));
                    svgParser.createSVGObject(t.getChild(0).getText(), value);
                }
                else
                    value = evaluateExpression(t.getChild(1));
                Stack.defineVariable (t.getChild(0).getText(), value);
                return null;

            // If-then-else
            case AslLexer.IF:
                value = evaluateExpression(t.getChild(0));
                checkBoolean(value);
                if (value.getBooleanValue()) 
                    return executeListInstructions(t.getChild(1));
                // Is there else statement ?
                for (int i = 2; i < t.getChildCount(); ++i){
                    if (t.getChild(i).getType() == AslLexer.ELSEIF){
                        value = evaluateExpression(t.getChild(i).getChild(0));
                        checkBoolean(value);
                        if (value.getBooleanValue()) return executeListInstructions(t.getChild(i).getChild(1));
                    }
                    else if (t.getChild(i).getType() == AslLexer.ELSE) {
                        return executeListInstructions(t.getChild(i).getChild(0));
                    }
                }
                return null;

            // While
            case AslLexer.WHILE:
                while (true) {
                    value = evaluateExpression(t.getChild(0));
                    checkBoolean(value);
                    if (!value.getBooleanValue()) return null;
                    Data r = executeListInstructions(t.getChild(1));
                    if (r != null) return r;
                }

            // For
            case AslLexer.FOR:
                Data value2;
                if (t.getChild(0).getChildCount() > 0) {
                    value = evaluateExpression(t.getChild(0).getChild(1));
                    Stack.defineVariable(t.getChild(0).getChild(0).getText(), value);
                    while(true){
                        value2 = evaluateExpression(t.getChild(1));
                        checkBoolean(value2);
                        if (!value2.getBooleanValue()) return null;
                        Data r = executeListInstructions(t.getChild(3));
                        value = evaluateExpression(t.getChild(2).getChild(1));
                        Stack.defineVariable(t.getChild(2).getChild(0).getText(), value);
                        if (r != null) return r;
                    }
                }
                else {
                    value = evaluateExpression(t.getChild(1));
                    Data finish = evaluateExpression(t.getChild(2));
                    checkInteger(value);
                    Stack.defineVariable(t.getChild(0).getText(), value);
                    while(value.getIntegerValue() <= finish.getIntegerValue()){
                        Data r = executeListInstructions(t.getChild(3));
                        if (r != null) return r;
                        value.setValue(value.getIntegerValue()+1);
                        Stack.defineVariable(t.getChild(0).getText(), value);
                    }
                }

                return null;

            // Return
            case AslLexer.RETURN:
                if (t.getChildCount() != 0) {
                    if (t.getChild(0).getType() == AslLexer.ID) svgParser.setReturnVariable(t.getChild(0).getText());

                    return evaluateExpression(t.getChild(0));
                }
                return new Data(); // No expression: returns void data
            case AslLexer.SOURCE:
                String file = t.getChild(0).getText();
                if (file.contains("\"")) file = file.split("\"")[1];
                AslTree tree = Asl.getFileTree("examples/"+file);
                if (tree.getChild(0).getType() == AslLexer.MODULE) {
                    throw new RuntimeException("A module file cannot be sourced. Use its functions by importing it.");
                } else {
                    List<AslTree> params = t.getChildren();
                    params.remove(0);
                    for (int i = 0; i < tree.getChild(2).getChildCount(); i++) {
                        if (tree.getChild(2).getChild(i).getChild(0).getText().equals("main")) {
                            int params2 = tree.getChild(2).getChild(i).getChild(1).getChildCount();
                            if (params.size() != params2)
                                throw new RuntimeException("Main function of sourced file has a different number of parameters than the ones on the source instruction");
                            //tree.getChild(2).getChild(i).getChild(1).replaceChildren(0,1,params);
                            
                            //for (int j = 0; j < params2; j++) tree.getChild(2).getChild(i).getChild(1).deleteChild(0);

                            tree.getChild(2).getChild(i).getChild(1).addChildren(params);                               
                        }
                    }
                    Asl.executeTree(tree);
                    svgParser.addExistingSVGFileContents();

                }
                return null;
            // Function call
            case AslLexer.FUNCALL:
                if (!t.getChild(0).getText().equals("rand")) executeFunction(t.getChild(0).getText(), t.getChild(1));
                return null;

            default: assert false; // Should never happen
        }

        // All possible instructions should have been treated.
        assert false;
        return null;
    }
    

    private Random rand = new Random(); 
        
    /** Executes random function */
    private Data executeRandom(AslTree t) {
        Data result;
        Data r0 = evaluateExpression(t.getChild(0));
        Data r1 = evaluateExpression(t.getChild(1));
        if (r0.isDouble() || r1.isDouble()) { 
            double d0 = r0.getDoubleValue();
            double d1 = r1.getDoubleValue();
            
            if (d0 >= d1) return new Data(d0);
            result = new Data(d0 + (d1-d0)*rand.nextDouble());
        } else {
            int i0 = r0.getIntegerValue();
            int i1 = r1.getIntegerValue();
            
            if (i0 >= i1) return new Data(i0);
            result = new Data(i0+rand.nextInt(i1-i0));
        }
        return result; 
    }

    private Data createObject(AslTree t) {
      int child = 1;

      String tipus = t.getChild(0).getText();
      int x = 0;
      int y = 0;
      int width = 0;
      int height = 0;
      String color = "black";
      int rotation = 0;
      String stroke = "";
      int strokeWidth = 0;
      int rx = 0;
      int ry = 0;
      String text = null;
      Data data;
      if (t.getChildCount() > 1){
	if (t.getChild(1).getType() != AslLexer.ATTRIBUTES) 
	{
	    if (t.getChild(1).getType() != AslLexer.ID) {
            data = evaluateExpression(t.getChild(1));
            checkInteger(data);
            x = data.getIntegerValue();

        }
        else {
            data = Stack.getVariable(t.getChild(1).getText());
            x = data.getIntegerValue();
        }
	    ++child;
        if (t.getChild(2).getType() != AslLexer.ID) {
            data = evaluateExpression(t.getChild(2));
            checkInteger(data);
            y = data.getIntegerValue();
        }
        else {
            data = Stack.getVariable(t.getChild(2).getText());
            y = data.getIntegerValue();
        }
	    ++child;
	}

	if (t.getChildCount() > child && t.getChild(child).getType() != AslLexer.ATTRIBUTES)
	{
	    if (t.getChild(child).getType() != AslLexer.ID) {
            data = evaluateExpression(t.getChild(child));
            checkInteger(data);
            rx = data.getIntegerValue();
        }
        else {
            data = Stack.getVariable(t.getChild(child).getText());
            rx = data.getIntegerValue();
        }
	    ++child;
    }
	
    if (t.getChildCount() > child && t.getChild(child).getType() != AslLexer.ATTRIBUTES)
    {
        if (t.getChild(child).getType() != AslLexer.ID) {
            data = evaluateExpression(t.getChild(child));
            checkInteger(data);
            ry = data.getIntegerValue();
        }
        else {
            data = Stack.getVariable(t.getChild(child).getText());
            ry = data.getIntegerValue();
        }
        ++child;
    }
	if (t.getChildCount() > child && t.getChild(child).getType() == AslLexer.ATTRIBUTES)
	{
	  for (int i = 0; i < t.getChild(child).getChildCount(); ++i){
	    switch(t.getChild(child).getChild(i).getText())  {
	      
          case "width":
          if (t.getChild(child).getChild(i).getChild(0).getType() != AslLexer.ID) {
            data = evaluateExpression(t.getChild(child).getChild(i).getChild(0));
            checkInteger(data);
	        width = data.getIntegerValue();
          }
          else {
            data = Stack.getVariable(t.getChild(child).getChild(i).getChild(0).getText());
            width = data.getIntegerValue();
          }
	      break;

	      case "height":
          if (t.getChild(child).getChild(i).getChild(0).getType() != AslLexer.ID) {
            data = evaluateExpression(t.getChild(child).getChild(i).getChild(0));
            checkInteger(data);
            height = data.getIntegerValue();
          }
          else {
            data = Stack.getVariable(t.getChild(child).getChild(i).getChild(0).getText());
            height = data.getIntegerValue();
          }
	      break;

	      case "color":
          data = evaluateExpression(t.getChild(child).getChild(i).getChild(0));
          
          color = data.getStringValue();
          if (color.contains("\"")) color = color.split("\"")[1];
	      break;
	      
          case "txt":
          data = evaluateExpression(t.getChild(child).getChild(i).getChild(0));

          text = data.getStringValue();
          if (text.contains("\"")) text = text.split("\"")[1];
          break;

          case "stroke":
          stroke = t.getChild(child).getChild(i).getChild(0).getText();
          if (stroke.contains("\"")) stroke = stroke.split("\"")[1];
          break;

          case "stroke-width":
          if (t.getChild(child).getChild(i).getChild(0).getType() != AslLexer.ID) {
            data = evaluateExpression(t.getChild(child).getChild(i).getChild(0));
            checkInteger(data);
            strokeWidth = data.getIntegerValue();
          }
          else {
            data = Stack.getVariable(t.getChild(child).getChild(i).getChild(0).getText());
            strokeWidth = data.getIntegerValue();
          }
          break;

	      case "style":
          String s = t.getChild(child).getChild(i).getChild(0).getText();
	      String[] parts = s.split(";");
	      String[] st;
	      for(int j = 0; j < parts.length; ++j) {
          if (parts[j].contains("stroke-width")){
              st = parts[j].split(":");
              st[1].replaceAll("\"\"", "");
              strokeWidth = Integer.parseInt(st[1]);
          }
          else if (parts[j].contains("stroke")){
              st = parts[j].split(":");
              st[1].replaceAll("\"\"", "");
              stroke = st[1];
          }
          else if (parts[j].contains("width")){
		      st = parts[j].split(":");
		      st[1].replaceAll("\"\"", "");
		      width = Integer.parseInt(st[1]);
		  }

		  else if (parts[j].contains("height")){
		      st = parts[j].split(":");
		      st[1].replaceAll("\"\"", "");
		      height = Integer.parseInt(st[1]);
		  }

		  else if (parts[j].contains("color")){
		      st = parts[j].split(":");
		      color = st[1];
		  }
		}
	      }
	    }
	  }
	}

      return new Data(tipus, x, y, width, height, color, rotation, stroke, strokeWidth, rx, ry, text);
    }

    private Data createAnimation(AslTree t) 
    {
        String tipus = t.getChild(0).getText();
        String idObject = ""; 
        double begin = currentTimeAnnotation.begin; 
        double end = currentTimeAnnotation.begin+currentTimeAnnotation.duration; 
        int x = 0; 
        int y = 0;
        int rotation =0;
        String attribute = null;
        String from = null;
        String to = null;
        String fill = "freeze";
        Data object;
        Data data;

        switch(tipus){
            
            case "Destroy":
            idObject = t.getChild(1).getText();
            break;

            case "Move":
            idObject = t.getChild(1).getText();
            object = Stack.getVariable(idObject);
            if (t.getChild(2).getType() != AslLexer.ID) {
                data = evaluateExpression(t.getChild(2));
                checkInteger(data);
                x = data.getIntegerValue();
            }
            else {
                data = Stack.getVariable(t.getChild(2).getText());
                x = data.getIntegerValue();
            }
            if (t.getChild(3).getType() != AslLexer.ID) {
                data = evaluateExpression(t.getChild(3));
                checkInteger(data);
                y = data.getIntegerValue();
            }
            else {
                data = Stack.getVariable(t.getChild(3).getText());
                y = data.getIntegerValue();
            }
            //object.setCoordX(x);
            //object.setCoordY(y);
            break;

            case "Translate":
            idObject = t.getChild(1).getText();
            object = Stack.getVariable(idObject);
            if (t.getChild(2).getType() != AslLexer.ID) {
                data = evaluateExpression(t.getChild(2));
                checkInteger(data);
                x = data.getIntegerValue();
            }
            else {
                data = Stack.getVariable(t.getChild(2).getText());
                x = data.getIntegerValue();
            }
            if (t.getChild(3).getType() != AslLexer.ID) {
                data = evaluateExpression(t.getChild(3));
                checkInteger(data);
                y = data.getIntegerValue();
            }
            else {
                data = Stack.getVariable(t.getChild(3).getText());
                y = data.getIntegerValue();
            }
            //object.setCoordX(x);
            //object.setCoordY(y);
            break;

            case "Scale":
            idObject = t.getChild(1).getText();
            object = Stack.getVariable(idObject);
            if (t.getChild(2).getType() != AslLexer.ID) {
                data = evaluateExpression(t.getChild(2));
                checkDouble(data);
                to = data.getDoubleValue() + "";
            }
            else {
                data = Stack.getVariable(t.getChild(2).getText());
                to = data.getIntegerValue() + "";
            }
            break;

            case "Rotate":
            idObject = t.getChild(1).getText();
            object = Stack.getVariable(idObject);
            data = evaluateExpression(t.getChild(2));
            checkInteger(data);
            rotation = data.getIntegerValue();
            //object.setRotation(rotation);
            if (t.getChildCount() > 3) {
                to = t.getChild(3).getText() + " " + t.getChild(4).getText();
            }
            break;

            case "Modify":
            idObject = t.getChild(1).getText();
            object = Stack.getVariable(idObject);
            attribute = t.getChild(2).getText();
            switch(attribute){

                case "stroke":
                //from = object.getObjectStroke();
                to = t.getChild(2).getChild(0).getText();
                if (to.contains("\"")) to = to.split("\"")[1];

                //object.setStroke(to);
                break;

                case "stroke-width":
                //from = Integer.toString(object.getObjectStrokeWidth());
                to = t.getChild(2).getChild(0).getText();
                //object.setStrokeWidth(Integer.parseInt(to));
                break;
                
                case "width":
                //from = Integer.toString(object.getObjectCoordX());
                to = t.getChild(2).getChild(0).getText();
                //object.setWidth(Integer.parseInt(to));
                break;

                case "height":
                //from = Integer.toString(object.getObjectCoordY());
                to = t.getChild(2).getChild(0).getText();
                //object.setHeight(Integer.parseInt(to));
                break;

                case "color":
                //from = object.getObjectColor();
                to = t.getChild(2).getChild(0).getText();
                if (to.contains("\"")) to = to.split("\"")[1];

                //object.setColor(to);
                break;

            }
            //if(object != null) Stack.defineVariable(idObject, object);
            if (t.getChildCount() > 3){
                novaAnimacio(t,idObject,3,t.getChildCount(), tipus, begin, end);
            }


        }

        return new Data(tipus, idObject, begin, end, x, y, rotation, attribute, from, to , fill);
    }

    private void novaAnimacio(AslTree t, String id, int child, int totalChild, String tip, double b, double e){
        if (child < totalChild){
	    String from = null;
	    String to = null;
            String attribute = t.getChild(child).getText();
            Data object = Stack.getVariable(id);
            switch(attribute){
                
                case "width":
                from = Integer.toString(object.getObjectCoordX());
                to = t.getChild(child).getChild(0).getText();
                break;

                case "height":
                from = Integer.toString(object.getObjectCoordY());
                to = t.getChild(child).getChild(0).getText();
                break;

                case "color":
                from = object.getObjectColor();
                to = t.getChild(child).getChild(0).getText();
                break;
            }
            Data anim = new Data(tip,  id,  b,  e, 0, 0, 0, attribute, from, to,"freeze");
            svgParser.addSVGAnimation(id,"newAnimation"+newId, anim);
            ++newId;
            novaAnimacio(t, id, child+1, totalChild, tip, b, e);
        }
    }

    /**
     * Evaluates the expression represented in the AST t.
     * @param t The AST of the expression
     * @return The value of the expression.
     */
     
    private Data evaluateExpression(AslTree t) {
        assert t != null;

        int previous_line = lineNumber();
        setLineNumber(t);
        int type = t.getType();
        Data value = null;
        // Atoms
        switch (type) {
            // A variable
            case AslLexer.ID:
                value = Stack.getVariable(t.getText());
                break;
            // An integer literal
            case AslLexer.INT:
                value = new Data(t.getIntValue());
                break;
            // A string literal
            case AslLexer.STRING:
                value = new Data(t.getText());
                break;
            // A double literal
            case AslLexer.DOUBLE:
                value = new Data(Double.parseDouble(t.getText()));
                break;
            // A Boolean literal
            case AslLexer.BOOLEAN:
                value = new Data(t.getBooleanValue());
                break;
            // A function call. Checks that the function returns a result.
            case AslLexer.FUNCALL:

                if (t.getChild(0).getText().equals("rand")) {
                    value = executeRandom(t.getChild(1));
                } else {
                    value = executeFunction(t.getChild(0).getText(), t.getChild(1));
                    assert value != null;
                    if (value.isVoid()) {
                        throw new RuntimeException ("function expected to return a value");
                    }
                }
                break;
            case AslLexer.ACCESATTRIBUTE:
                Data d = Stack.getVariable(t.getChild(0).getText());

                String s = t.getChild(1).getText();
                if (d.isObject()){
                    switch(s){
                        case "width":
                        value = new Data(d.getObjectWidth());
                        break;
                        case "height":
                        value = new Data(d.getObjectHeight());
                        break;
                        case "coordX":
                        value = new Data(d.getObjectCoordX());
                        break;
                        case "coordY":
                        value = new Data(d.getObjectCoordY());
                        break;
                        case "stroke-width":
                        value = new Data(d.getObjectStrokeWidth());
                        break;
                        case "stroke":
                        value = new Data(d.getObjectStroke());
                        break;
                        case "rotation":
                        value = new Data(d.getObjectRotation());
                        break;
                        case "radiX":
                        value = new Data(d.getObjectRadiX());
                        break;
                        case "radiY":
                        value = new Data(d.getObjectRadiY());
                        break;
                        case "tipus":
                        value = new Data(d.getTipusObject());
                        break;
                    }
                }
                else if (d.isAnimation()){
                    switch(s){
                        case "begin":
                        value = new Data(d.getAnimationBegin());
                        break;
                        case "end":
                        value = new Data(d.getAnimationEnd());
                        break;
                        case "duration":
                        value = new Data(d.getAnimationEnd()-d.getAnimationBegin());
                        break;
                    }
                }

                break;
        }

        // Retrieve the original line and return
        if (value != null) {
            setLineNumber(previous_line);
            return value;
        }
        
        // Unary operators
        value = evaluateExpression(t.getChild(0));
        if (t.getChildCount() == 1) {
            switch (type) {
                case AslLexer.PLUS:
                    checkInteger(value);
                    break;
                case AslLexer.MINUS:
                    checkInteger(value);
                    value.setValue(-value.getIntegerValue());
                    break;
                case AslLexer.NOT:
                    checkBoolean(value);
                    value.setValue(!value.getBooleanValue());
                    break;
                default: assert false; // Should never happen
            }
            setLineNumber(previous_line);
            return value;
        }

        // Two operands
        Data value2;
        switch (type) {
            // Relational operators
            case AslLexer.COND_EQUAL:
            case AslLexer.NOT_EQUAL:
            case AslLexer.LT:
            case AslLexer.LE:
            case AslLexer.GT:
            case AslLexer.GE:
                value2 = evaluateExpression(t.getChild(1));
                if (value.getType() != value2.getType()) {
                  throw new RuntimeException ("Incompatible types in relational expression");
                }
                value = value.evaluateRelational(type, value2);
                break;

            // Arithmetic operators
            case AslLexer.PLUS:
            case AslLexer.MINUS:
            case AslLexer.MUL:
            case AslLexer.DIV:
            case AslLexer.MOD:

                value2 = evaluateExpression(t.getChild(1));
                checkInteger(value); checkInteger(value2);
                value = value.evaluateArithmetic(type, value2);

                break;

            // Boolean operators
            case AslLexer.AND:
            case AslLexer.OR:
                // The first operand is evaluated, but the second
                // is deferred (lazy, short-circuit evaluation).
                checkBoolean(value);
                value = evaluateBoolean(type, value, t.getChild(1));
                break;

            default: assert false; // Should never happen
        }
        
        setLineNumber(previous_line);
        return value;
    }
    
    /**
     * Evaluation of Boolean expressions. This function implements
     * a short-circuit evaluation. The second operand is still a tree
     * and is only evaluated if the value of the expression cannot be
     * determined by the first operand.
     * @param type Type of operator (token).
     * @param v First operand.
     * @param t AST node of the second operand.
     * @return An Boolean data with the value of the expression.
     */
    private Data evaluateBoolean (int type, Data v, AslTree t) {
        // Boolean evaluation with short-circuit

        switch (type) {
            case AslLexer.AND:
                // Short circuit if v is false
                if (!v.getBooleanValue()) return v;
                break;
        
            case AslLexer.OR:
                // Short circuit if v is true
                if (v.getBooleanValue()) return v;
                break;
                
            default: assert false;
        }

        // Return the value of the second expression
        v = evaluateExpression(t);
        checkBoolean(v);
        return v;
    }

    /** Checks that the data is Boolean and raises an exception if it is not. */
    private void checkBoolean (Data b) {
        if (!b.isBoolean()) {
            throw new RuntimeException ("Expecting Boolean expression");
        }
    }
    
    /** Checks that the data is integer and raises an exception if it is not. */
    private void checkInteger (Data b) {
        if (!b.isInteger()) {
            throw new RuntimeException ("Expecting integer numerical expression");
        }
    }

    /** Checks that the data is integer and raises an exception if it is not. */
    private void checkDouble (Data b) {
        if (!b.isDouble() && !b.isInteger()) {
            throw new RuntimeException ("Expecting numerical expression");
        }
    }

    /**
     * Gathers the list of arguments of a function call. It also checks
     * that the arguments are compatible with the parameters. In particular,
     * it checks that the number of parameters is the same and that no
     * expressions are passed as parametres by reference.
     * @param AstF The AST of the callee.
     * @param args The AST of the list of arguments passed by the caller.
     * @return The list of evaluated arguments.
     */
     
    private ArrayList<Data> listArguments (AslTree AstF, AslTree args) {
        if (args != null) setLineNumber(args);
        AslTree pars = AstF.getChild(1);   // Parameters of the function
        
        // Create the list of parameters
        ArrayList<Data> Params = new ArrayList<Data> ();
        int n = pars.getChildCount();

        // Check that the number of parameters is the same
        int nargs = (args == null) ? 0 : args.getChildCount();
        if (n != nargs) {
            throw new RuntimeException ("Incorrect number of parameters calling function " +
                                        AstF.getChild(0).getText());
        }

        // Checks the compatibility of the parameters passed by
        // reference and calculates the values and references of
        // the parameters.
        for (int i = 0; i < n; ++i) {
            AslTree p = pars.getChild(i); // Parameters of the callee
            AslTree a = args.getChild(i); // Arguments passed by the caller
            setLineNumber(a);
            if (a.getType() != AslLexer.ID) {
                Data value = evaluateExpression(a);
                Params.add(i,value);
            } else {
                // Find the variable and pass the reference
                Data v = Stack.getVariable(a.getText());
                Params.add(i,v);
            }
        }
        return Params;
    }

    /**
     * Writes trace information of a function call in the trace file.
     * The information is the name of the function, the value of the
     * parameters and the line number where the function call is produced.
     * @param f AST of the function
     * @param arg_values Values of the parameters passed to the function
     */
    private void traceFunctionCall(AslTree f, ArrayList<Data> arg_values) {
        function_nesting++;
        AslTree params = f.getChild(1);
        int nargs = params.getChildCount();
        
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");

        // Print function name and parameters
        trace.print(f.getChild(0) + "(");
        for (int i = 0; i < nargs; ++i) {
            if (i > 0) trace.print(", ");
            AslTree p = params.getChild(i);
            if (p.getType() == AslLexer.PREF) trace.print("&");
            trace.print(p.getText() + "=" + arg_values.get(i));
        }
        trace.print(") ");
        
        if (function_nesting == 0) trace.println("<entry point>");
        else trace.println("<line " + lineNumber() + ">");
    }

    /**
     * Writes the trace information about the return of a function.
     * The information is the value of the returned value and of the
     * variables passed by reference. It also reports the line number
     * of the return.
     * @param f AST of the function
     * @param result The value of the result
     * @param arg_values The value of the parameters passed to the function
     */
    private void traceReturn(AslTree f, Data result, ArrayList<Data> arg_values) {
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");
        function_nesting--;
        trace.print("return");
        if (!result.isVoid()) trace.print(" " + result);
        
        // Print the value of arguments passed by reference
        AslTree params = f.getChild(1);
        int nargs = params.getChildCount();
        for (int i = 0; i < nargs; ++i) {
            AslTree p = params.getChild(i);
            // if (p.getType() == AslLexer.PVALUE) continue;
            trace.print(", &" + p.getText() + "=" + arg_values.get(i));
        }
        
        trace.println(" <line " + lineNumber() + ">");
        if (function_nesting < 0) trace.close();
    }
}
