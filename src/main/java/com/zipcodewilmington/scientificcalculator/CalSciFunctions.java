package com.zipcodewilmington.scientificcalculator;

public class CalSciFunctions {


    private static Double factorialCutoff = 0.0000000000001;






    /** Trig Functions
     * 0 -- Degrees;
     * 1 -- Radians;
     * 2 -- Gradians;
     */

    public static Double sine(Double x, int mode){
        x = toCurrentMode(x, mode);
        return Math.sin(x);
    }

    public static Double cosine(Double x, int mode){
        x = toCurrentMode(x, mode);
        return Math.cos(x);
    }

    public static Double tangent(Double x, int mode){
        x = toCurrentMode(x, mode);
        return Math.tan(x);
    }

    public static Double arcsine(Double x, int mode){
        x = Math.asin(x);
        return toCurrentMode(x, mode);
    }

    public static Double arccosine(Double x, int mode){
        x = Math.acos(x);
        return toCurrentMode(x, mode);
    }

    public static Double arctangent(Double x, int mode){
        x = Math.atan(x);
        return toCurrentMode(x, mode);
    }


    // Logarithmic Functions
    public static Double log(Double x){
        return Math.log10(x);
    }

    public static Double ln(Double x){
        return Math.log(x);
    }

    public static Double tenToTheX(Double x){
        return Math.pow(10,x);
    }

    public static Double exp(Double x){
        return Math.exp(x);
    }



    // Factorial
    public static Double factorial(Double x){
        if(x - x.intValue() > factorialCutoff)
            return Double.NaN;
        else if(x < 0.0)
            return Double.NaN;
        else
            return factFunction(x);

    }

    public static Double factFunction(Double x){
        int y;
        Long fact = Long.valueOf(1);
        if(x.compareTo(0.0)==0)
            return 1.0;
        else
            y = x.intValue();
        for(int i=1;i<=y;i++){
            fact*=i;
        }
        return Double.valueOf(fact);
    }


    // I just want this in any calculator
    public static Double e(){
        return Math.exp(1);
    }

    public static Double pi(){
        return Math.PI;
    }





    // helper methods
    public static Double toCurrentMode(Double x, int mode){
        switch (mode){
            case 0:
                x = degToRad(x);
                break;
            case 1:
                break;
            case 2:
                x = gradToRad(x);
                break;
        }
        return x;
    }

    public static Double degToRad(Double x){
        return (x * Math.PI)/180;
    }

    public static Double gradToRad(Double x){
        return (x * Math.PI)/200;
    }




}

