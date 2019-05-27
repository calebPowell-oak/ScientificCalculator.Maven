package com.zipcodewilmington.scientificcalculator;

public class InputFormatter {
    // helper class to turn string input into a number
    // should be able to handle binary, octal, decimal, and hexadecimal
    // 0 -- binary
    // 1 -- octal
    // 2 -- decimal
    // 3 -- hex;

    public static Double format(String s, int mode){
        s = s.toLowerCase();
        switch(mode){
            case 0:
                return stringToDouble(s,0);
            case 1:
                return stringToDouble(s,1);
            case 2:
                return Double.valueOf(s);
            case 3:
                return stringToDouble(s,3);
            default:
                return null;
        }

    }

    public static Double format(String s){
        return format(s, 3);
    }


    public static Double stringToDouble(String s, int mode) {

        int dotPlace = s.indexOf('.');

        if (dotPlace == -1) {
            return getLeftValue(s, mode) * getNegative(s);
        }
        else {
            return (getLeftValue(s.substring(0, dotPlace), mode) + getRightValue(s.substring(dotPlace + 1), mode)) * getNegative(s);
        }
    }

    public static Double getLeftValue(String s, int mode){

        double base = getBase(mode);


        int loopEnd = - 1;
        if(s.length() > 0) {
            if (s.charAt(0) == '-' || s.charAt(0) == '+') {
                loopEnd = 0;
            }
        }

        double placeValue = 1;
        Double leftValue = 0.0;
        for(int i = s.length()-1;i > loopEnd; i--){
            //System.out.println("i: " + i + "         char: " + s.charAt(i) + "       str: " + charToHex(s.charAt(i)));
            leftValue = leftValue + Double.valueOf(charToHex(s.charAt(i))) * placeValue;
            //System.out.println("i: " + i + "    leftValue: " + leftValue + "     placeValue: " + placeValue);
            //System.out.println("  digit: " + charToHex(s.charAt(i))+ "    Double value: " + Double.valueOf(s.substring(i,i+1)));
            placeValue = placeValue * base;

        }

        return leftValue;
    }

    public static Double getRightValue(String s, int mode){
        double base = getBase(mode);

        double placeValue = base;
        Double rightValue = 0.0;
        for(int i = 0; i < s.length(); i++){
            //System.out.println("i: " + i + "     char: " + s.charAt(i) + "      str: " + charToHex(s.charAt(i)));
            //System.out.println("   placeValue: " + placeValue + "     res: " + Double.valueOf(charToHex(s.charAt(i)))/ placeValue);
            rightValue = rightValue + Double.valueOf(charToHex(s.charAt(i))) / placeValue;
            placeValue = placeValue * base;
        }

        return rightValue;
    }

    public static String charToHex(char c){
        switch(c){
            case '0':
                return "0";
            case '1':
                return "1";
            case '2':
                return "2";
            case '3':
                return "3";
            case '4':
                return "4";
            case '5':
                return "5";
            case '6':
                return "6";
            case '7':
                return "7";
            case '8':
                return "8";
            case '9':
                return "9";
            case 'a':
                return "10";
            case 'b':
                return "11";
            case 'c':
                return "12";
            case 'd':
                return "13";
            case 'e':
                return "14";
            case 'f':
                return "15";
            default:
                return null;

        }
    }

    public static double getBase(int mode){
        double base;
        switch(mode) {
            case 0:
                return 2.0;
            case 1:
                return 8.0;
            case 3:
                return 16.0;
            default:
                return 10.0;
        }
    }

    public static Double getNegative(String s){
        if(s.length() > 0 && s.charAt(0) == '-'){
            return -1.0;
        }
        else {
            return 1.0;
        }
    }

}
