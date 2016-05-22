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

/**
 * Class to represent data in the interpreter.
 * Each data item has a type and a value. The type can be integer
 * or Boolean. Each operation asserts that the operands have the
 * appropriate types.
 * All the arithmetic and Boolean operations are calculated in-place,
 * i.e., the result is stored in the same data.
 * The type VOID is used to represent void values on function returns.
 */

import parser.*;

public class Data {
    /** Types of data */
    public enum Type {VOID, BOOLEAN, INTEGER, OBJECT, ANIMATION;}

    /** Type of data*/
    private Type type;

    /** Value of the data */
    private int value; 

    /** Valors dels objectes */
    private String tipus;
    private int x;
    private int y;
    private int width;
    private int height;
    private int rotation;

    private String fill;

    /** Valors de les animacions */
    private int begin;
    private int duration;


    /** Valors de les animacions */
    private 

    /** Constructor for integers */
    Data(int v) { type = Type.INTEGER; value = v; }

    /** Constructor for Booleans */
    Data(boolean b) { type = Type.BOOLEAN; value = b ? 1 : 0; }

    /** Constructor for void data */
    Data() {type = Type.VOID; }

    /** Constructor for object data */
    Data(String tipus, int cx, int cy, int w, int h, String f, int r)
    {
        type = Type.OBJECT;
        x = cx;
        y = cy;
        width = w;
        height = h;
        fill = f;
        rotation = r;
        this.tipus = tipus;
    }

    /** Constructor for animation data */
    Data(int b, int e) { type = Type.ANIMATION; begin = b; end = e; }

    /** Copy constructor */
    Data(Data d) { type = d.type; value = d.value; }

    /** Returns the type of data */
    public Type getType() { return type; }

    /** Indicates whether the data is Boolean */
    public boolean isBoolean() { return type == Type.BOOLEAN; }

    /** Indicates whether the data is integer */
    public boolean isInteger() { return type == Type.INTEGER; }

    /** Indicates whether the data is void */
    public boolean isVoid() { return type == Type.VOID; }

    /** Indicates whether the data is object */
    public boolean isObject() { return type == Type.OBJECT; }

    /** Indicates whether the data is object */
    public boolean isAnimation() { return type == Type.ANIMATION; }

    /**
     * Gets the value of an integer data. The method asserts that
     * the data is an integer.
     */
    public int getIntegerValue() {
        assert type == Type.INTEGER;
        return value;
    }

    /**
     * Gets the value of a Boolean data. The method asserts that
     * the data is a Boolean.
     */
    public boolean getBooleanValue() {
        assert type == Type.BOOLEAN;
        return value == 1;
    }

    /**
     * Gets the values of an Object data. The method asserts that
     * the data is a Object.
     */
    public int getObjectCoordX() {
        assert type == Type.OBJECT;
        return x;
    }

    public int getObjectCoordY() {
        assert type == Type.OBJECT;
        return y;
    }

    public int getObjectWidth() {
        assert type == Type.OBJECT;
        return width;
    }

    public int getObjectHeight() {
        assert type == Type.OBJECT;
        return height;
    }

    public String getObjectColor() {
        assert type == Type.OBJECT;
        return fill;
    }

    public int getRotation() {
        assert type == Type.OBJECT;
        return rotation;
    }

    /**
     * Gets the values of an Animation data. The method asserts that
     * the data is an Animation.
     */    
    public int getBegin(){
        assert type == Type.ANIMATION;
        return begin;
    }

    public int getDuration(){
        assert type = Type.ANIMATION;
        return duration;

    }

    /** Defines a Boolean value for the data */
    public void setValue(boolean b) { type = Type.BOOLEAN; value = b ? 1 : 0; }

    /** Defines an integer value for the data */
    public void setValue(int v) { type = Type.INTEGER; value = v; }

    /** Defines an object for the data */
    public void setValue(String tipus, int cx, int cy, int w, int h, String f, int r)
    {
        type = Type.OBJECT;
        x = cx;
        y = cy;
        width = w;
        height = h;
        fill = f;
        rotation = r;
    }

    public void setValue(int b, int e)
    {
        type = Type.ANIMATION;
        begin = b;
        end = e;
    }

    public void setCoordX(int cx) { type = Type.OBJECT; x = cx; }

    public void setCoordY(int cy) { type = Type.OBJECT; y = cy; }

    public void setWidth(int w) { type = Type.OBJECT; width = w; }

    public void setHeight(int h) { type = Type.OBJECT; height = h; }

    public void setColor(String c) { type = Type.OBJECT; fill = c; }

    public void setRotation(int r) { type = Type.OBJECT; rotation = r; }

    /** Defines an object for animation */
    public void setValue(int b, int e) { type = Type.ANIMATION; begin = b; end = e; }

    public void setBegin(int b) { type = Type.ANIMATION; begin = b; }

    public void setDuration(int d) { type = Type.ANIMATION; duration = d; }

    /** Copies the value from another data */
    public void setData(Data d) { type = d.type; value = d.value; }
    
    /** Returns a string representing the data in textual form. */
    public String toString() {
        if (type == Type.BOOLEAN) return value == 1 ? "true" : "false";
        return Integer.toString(value);
    }
    
    /**
     * Checks for zero (for division). It raises an exception in case
     * the value is zero.
     */
    private void checkDivZero(Data d) {
        if (d.value == 0) throw new RuntimeException ("Division by zero");
    }

    /**
     * Evaluation of arithmetic expressions. The evaluation is done
     * "in place", returning the result on the same data.
     * @param op Type of operator (token).
     * @param d Second operand.
     */
     
    public void evaluateArithmetic (int op, Data d) {
        assert type == Type.INTEGER && d.type == Type.INTEGER;
        switch (op) {
            case AslLexer.PLUS: value += d.value; break;
            case AslLexer.MINUS: value -= d.value; break;
            case AslLexer.MUL: value *= d.value; break;
            case AslLexer.DIV: checkDivZero(d); value /= d.value; break;
            case AslLexer.MOD: checkDivZero(d); value %= d.value; break;
            default: assert false;
        }
    }

    /**
     * Evaluation of expressions with relational operators.
     * @param op Type of operator (token).
     * @param d Second operand.
     * @return A Boolean data with the value of the expression.
     */
    public Data evaluateRelational (int op, Data d) {
        assert type != Type.VOID && type == d.type;
        switch (op) {
            case AslLexer.EQUAL: return new Data(value == d.value);
            case AslLexer.NOT_EQUAL: return new Data(value != d.value);
            case AslLexer.LT: return new Data(value < d.value);
            case AslLexer.LE: return new Data(value <= d.value);
            case AslLexer.GT: return new Data(value > d.value);
            case AslLexer.GE: return new Data(value >= d.value);
            default: assert false; 
        }
        return null;
    }
}
