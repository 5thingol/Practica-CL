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

package Asl;

// Imports for ANTLR
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

// Imports from Java
import org.apache.commons.cli.*; // Command Language Interface
import java.io.*;
import java.util.List;

// Parser and Interpreter
import parser.*;
import interp.*;

/**
 * The class <code>Asl</code> implement the main function of the
 * interpreter. It accepts a set of options to generate the AST in
 * dot format and avoid the execution of the program. To know about
 * the accepted options, run the command Asl -help.
 */

public class Asl{

    /** The file name of the program. */
    private static String infile = null;
    /** Name of the file representing the AST. */
    private static String astfile = null;
    /** Flag indicating that the AST must be written in dot format. */
    private static boolean dotformat = false;
    /** Name of the file storing the trace of the program. */
    private static String tracefile = null;
    /** Flag to indicate whether the program must be executed after parsing. */
    private static boolean execute = true;
    /** Name of the output SVG file */
    private static String filename = null;
      
    /** Main program that invokes the parser and the interpreter. */
    
    public static void main(String[] args) throws Exception {
        // Parser for command line options
        if (!readOptions (args)) System.exit(1);

        // Parsing of the input file
        
        CharStream input = null;
        try {
            input = new ANTLRFileStream(infile);
        } catch (IOException e) {
            System.err.println ("Error: file " + infile + " could not be opened.");
            System.exit(1);
        }

        // Creates the lexer
        AslLexer lex = new AslLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);

        // Creates and runs the parser. As a result, an AST is created
        AslParser parser = new AslParser(tokens);
        AslTreeAdaptor adaptor = new AslTreeAdaptor();
        parser.setTreeAdaptor(adaptor);
        AslParser.prog_return result = null;
        try {
            result = parser.prog();
        } catch (Exception e) {} // Just catch the exception (nothing to do)
        
        // Check for parsing errors
        int nerrors = parser.getNumberOfSyntaxErrors();
        if (nerrors > 0) {
            System.err.println (nerrors + " errors detected. " +
                                "The program has not been executed.");
            System.exit(1);
        }

        // Get the AST
        AslTree t = (AslTree)result.getTree();

        // Generate a file for the AST (option -ast file)
        if (astfile != null) {
            File ast = new File(astfile);
            BufferedWriter output = new BufferedWriter(new FileWriter(ast));
            if (dotformat) {
                DOTTreeGenerator gen = new DOTTreeGenerator();
                output.write(gen.toDOT(t).toString());
            } else {
                output.write(t.toStringTree());
            }
            output.close();
        }
                // Start interpretation (only if execution required)
        if (execute) {
            t = importModules(t);
            executeTree(t);
        } 

    }

    public static void executeTree(AslTree t) {
        // Creates and prepares the interpreter
        Interp I = null;
        int linenumber = -1;
        try {
            I = new Interp(t, tracefile, filename); // prepares the interpreter
            I.Run();                  // Executes the code
        } catch (RuntimeException e) {
            if (I != null) linenumber = I.lineNumber();
            System.err.print ("Runtime error");
            if (linenumber < 0) System.err.print (": ");
            else System.err.print (" (" + infile + ", line " + linenumber + "): ");
            System.err.println (e.getMessage() + ".");
            if (I != null) System.err.format (I.getStackTrace());
        } catch (StackOverflowError e) {
            if (I != null) linenumber = I.lineNumber();
            System.err.print("Stack overflow error");
            if (linenumber < 0) System.err.print (".");
            else System.err.println (" (" + infile + ", line " + linenumber + ").");
            if (I != null) System.err.format (I.getStackTrace(5));
        }
    }

    /** Takes the tree and substitutes the import(s) (if present) for all its functions and includes */
    private static AslTree importModules(AslTree t) {
        int importsIndex = 0;
        if (t.getChild(0).getType() == AslLexer.MODULE) importsIndex++; // It's a module definition: import all the imports and return the list_func tree
        if (t.getChild(importsIndex).getChildCount() == 0) return t;
        
        if (t.getChild(importsIndex).getType() == AslLexer.IMPORTS) {
            AslTree importedT = t.getChild(importsIndex);
            for (int i = 0; i < importedT.getChildCount(); ++i) {
                String moduleFile = importedT.getChild(i).getText();
                if (moduleFile.contains("\"")) moduleFile = moduleFile.split("\"")[1];
                
                AslTree moduleTree = getFileTree("modules/"+moduleFile);

                List<AslTree> defs = moduleTree.getChild(2).getChildren();
                if (defs != null) t.getChild(importsIndex+1).addChildren(defs);
                List<AslTree> funcs = moduleTree.getChild(3).getChildren();
                if (funcs != null) t.getChild(importsIndex+2).addChildren(funcs);
            }
        }
        return t;
    }

    /** Open the module file and import its contents */
    public static AslTree getFileTree(String fileName) {
        CharStream input = null;
        try {
            input = new ANTLRFileStream(fileName);
        } catch (IOException e) {
            System.err.println ("Error: file " + fileName + " could not be opened.");
            System.exit(1);
        }

        // Creates the lexer
        AslLexer lex = new AslLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);

        // Creates and runs the parser. As a result, an AST is created
        AslParser parser = new AslParser(tokens);
        AslTreeAdaptor adaptor = new AslTreeAdaptor();
        parser.setTreeAdaptor(adaptor);
        AslParser.prog_return result = null;
        try {
            result = parser.prog();
        } catch (Exception e) {} // Just catch the exception (nothing to do)

        // Check for parsing errors
        int nerrors = parser.getNumberOfSyntaxErrors();
        if (nerrors > 0) {
            System.err.println (nerrors + " errors detected in the file " + fileName + ". " +
                                "The program has not been executed.");
            System.exit(1);
        }

        // Get the AST
        AslTree t = (AslTree)result.getTree();

        t = importModules(t);
        return t;

    }

    /**
     * Function to parse the command line. It defines some of
     * the attributes of the class. It returns true if the parsing
     * hass been successful, and false otherwise.
     */

    private static boolean readOptions(String[] args) {
        // Define the options
        Option help = new Option("help", "print this message");
        Option noexec = new Option("noexec", "do not execute the program");
        Option dot = new Option("dot", "dump the AST in dot format");
        Option ast = OptionBuilder
                        .withArgName ("file")
                        .hasArg()
                        .withDescription ("write the AST")
                        .create ("ast");
        Option o = OptionBuilder
                        .withArgName ("file")
                        .hasArg()
                        .withDescription ("specify the SVG output file")
                        .create ("o");
        Option trace = OptionBuilder
                        .withArgName ("file")
                        .hasArg()
                        .withDescription ("write a trace of function calls during the execution of the program")
                        .create ("trace");
                                       
        Options options = new Options();
        options.addOption(help);
        options.addOption(dot);
        options.addOption(ast);
        options.addOption(trace);
        options.addOption(o);
        options.addOption(noexec);
        CommandLineParser clp = new GnuParser();
        CommandLine line = null;

        String cmdline = "Asl [options] file";
        
        
        // Parse the options
        try {
            line = clp.parse (options, args);
        }
        catch (ParseException exp) {
            System.err.println ("Incorrect command line: " + exp.getMessage());
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp (cmdline, options);
            return false;
        }

        // Option -help
        if (line.hasOption ("help")) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp (cmdline, options);
            return false;
        }
        
        // Option -dot
        if (line.hasOption ("dot")) dotformat = true;

        // Option -ast dotfile
        if (line.hasOption ("ast")) astfile = line.getOptionValue ("ast");

        // Option -o output svg image
        if (line.hasOption ("o")) filename = line.getOptionValue ("o");
        
        // Option -trace dotfile
        if (line.hasOption ("trace")) tracefile = line.getOptionValue ("trace");
        
        // Option -noexec
        if (line.hasOption ("noexec")) execute = false;

        // Remaining arguments (the input file)
        String[] files = line.getArgs();
        if (files.length != 1) {
            System.err.println ("Incorrect command line.");
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp (cmdline, options);
            return false;
        }
        
        infile = files[0];
        return true;
    }
}

