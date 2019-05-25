package com.zipcodewilmington.scientificcalculator;



// to handle
public class DisplayModeOutputter {
    /** Mode types
     * 0 -- Binary
     * 1 -- Octal
     * 2 -- Decimal
     * 3 -- Hexadecimal
     */

    private static int binaryRightLength;

    public static String getOutput(Double d, int mode){
        switch (mode){
            case 0:
                return toBinary(Double.toString(d));
            case 1:
                return toOctal(Double.toString(d));
            case 2:
                return Double.toString(d);
            case 3:
                return Double.toHexString(d);
            default:
                return "Invalid mode value. Mode must be an int between 0 and 3";

        }
    }

    public static String getOutput(Double d){
        return Double.toString(d);
    }


    public static String toBinary(String s){
        Integer leftSide;
        Integer rightSide;

        int dotIndex = s.indexOf('.');

        leftSide = new Integer(s.substring(0,dotIndex));
        rightSide = new Integer(s.substring(dotIndex + 1));

        return Integer.toBinaryString(leftSide) + "." + Integer.toBinaryString(rightSide);


    }


    public static String toOctal(String s){
        Integer leftSide;
        Integer rightSide;

        int dotIndex = s.indexOf(".");

        leftSide = new Integer(s.substring(0,dotIndex));
        rightSide = new Integer(s.substring(dotIndex + 1));

        return Integer.toOctalString(leftSide) + "." + Integer.toOctalString(rightSide);
    }



}
