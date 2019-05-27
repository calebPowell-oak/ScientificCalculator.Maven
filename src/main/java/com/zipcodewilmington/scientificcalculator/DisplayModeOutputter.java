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
        if(d.isNaN()){
            return "NaN";
        } else if(d.isInfinite()){
            return "Nan";
        }
        switch (mode){
            case 0:
                return toBinary(d);
            case 1:
                return toOctal(d);
            case 2:
                return Double.toString(d);
            case 3:
                return toHex(d);
            default:
                return "Invalid mode value. Mode must be an int between 0 and 3";

        }
    }

    public static String getOutput(Double d){
        return Double.toString(d);
    }


    public static String toBinary(Double d){
        Integer leftSide;
        String rightSide;
        String s = d.toString();

        int dotIndex = s.indexOf('.');

        leftSide = new Integer(s.substring(0,dotIndex));
        rightSide = decFractionToBinary(d - Math.floor(d));


        return Integer.toBinaryString(leftSide) + "." + rightSide;


    }


    public static String toOctal(Double d){
        Integer leftSide;
        String rightSide;
        String s = d.toString();

        int dotIndex = s.indexOf(".");

        leftSide = new Integer(s.substring(0,dotIndex));
        rightSide = decFractionToOctal(d - Math.floor(d));

        return Integer.toOctalString(leftSide) + "." + rightSide;
    }

    public static String toHex(Double d){
        Integer leftSide;
        String rightSide;
        String s = d.toString();

        int dotIndex = s.indexOf(".");

        leftSide = new Integer(s.substring(0,dotIndex));
        rightSide = decFractionToHex(d - Math.floor(d));

        return Integer.toHexString(leftSide) + "." + rightSide;
    }




    // helper functions

    public static String decFractionToBinary(Double d){
        int maxBinaryDigits = 20;
        StringBuilder sbuild = new StringBuilder();

        int i = 0;
        while(i < maxBinaryDigits){
            d = d*2;
            sbuild.append((int)Math.floor(d));
            d = d - Math.floor(d);
            i++;
            if(d.compareTo(Double.valueOf(0))==0)
                break;
        }
        return sbuild.toString();
    }

    public static String decFractionToOctal(Double d){
        StringBuilder sbuild = new StringBuilder();
        String s = decFractionToBinary(d);


        while(s.length()%3 != 0)
            s = s + "0";

        int i=0;
        while(i < s.length()){
            sbuild.append(binaryToOctalDigit(s.substring(i,i+3)));
            i+=3;
        }

        if(s.length()>3 && s.substring(s.length()-3).equals("000"))
            sbuild.deleteCharAt(sbuild.length()-1);

        return sbuild.toString();
    }

    public static String decFractionToHex(Double d){
        StringBuilder sbuild = new StringBuilder();
        String s = decFractionToBinary(d);

        while(s.length()%4 != 0)
            s = s + "0";

        //System.out.println("s: " + s);

        int i=0;
        while(i < s.length()){
            sbuild.append(binaryToHexDigit(s.substring(i,i+4)));
            //System.out.println("");
            //System.out.println("append string: " + s.substring(i,i+4) );
            //System.out.println("append character: " + binaryToHexDigit(s.substring(i,i+4)));
            i+=4;
        }

        if(s.length()>4 && s.substring(s.length()-4).equals("0000"))
            sbuild.deleteCharAt(s.length()-1);

        return sbuild.toString();
    }


    public static String binaryToOctalDigit(String s){
        switch(s){
            case "000":
                return "0";
            case "001":
                return "1";
            case "010":
                return "2";
            case "011":
                return "3";
            case "100":
                return "4";
            case "101":
                return "5";
            case "110":
                return "6";
            case "111":
                return "7";
            default:
                return null;
        }
    }

    public static String binaryToHexDigit(String s){
        switch(s){
            case "0000":
                return "0";
            case "0001":
                return "1";
            case "0010":
                return "2";
            case "0011":
                return "3";
            case "0100":
                return "4";
            case "0101":
                return "5";
            case "0110":
                return "6";
            case "0111":
                return "7";
            case "1000":
                return "8";
            case "1001":
                return "9";
            case "1010":
                return "a";
            case "1011":
                return "b";
            case "1100":
                return "c";
            case "1101":
                return "d";
            case "1110":
                return "e";
            case "1111":
                return "f";
            default:
                return null;
        }
    }

}