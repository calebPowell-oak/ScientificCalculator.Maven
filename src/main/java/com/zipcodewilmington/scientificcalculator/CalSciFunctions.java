package com.zipcodewilmington.scientificcalculator;

public class CalSciFunctions {


    private static Double factorialCutoff = 0.000001;






    /** Trig Functions
     * 0 -- Degrees;
     * 1 -- Radians;
     * 2 -- Gradians;
     */

    public static Double sine(Double x, int mode){
        x = toCurrentMode(x, mode);
        return new Double(Math.sin(x.doubleValue()));
    }

    public static Double cosine(Double x, int mode){
        x = toCurrentMode(x, mode);
        return new Double(Math.cos(x.doubleValue()));
    }

    public static Double tangent(Double x, int mode){
        x = toCurrentMode(x, mode);
        return new Double(0);
    }

    public static Double arcsine(Double x, int mode){
        x = new Double(Math.asin(x.doubleValue()));
        return toCurrentMode(x, mode);
    }

    public static Double arccosine(Double x, int mode){
        x = new Double(Math.acos(x.doubleValue()));
        return toCurrentMode(x, mode);
    }

    public static Double arctangent(Double x, int mode){
        x = new Double(Math.atan(x.doubleValue()));
        return toCurrentMode(x, mode);
    }


    // Logarithmic Functions
    public static Double log(Double x){
        return Double.valueOf(Math.log10(x.doubleValue()));
    }

    public static Double ln(Double x){
        return Double.valueOf(Math.log(x.doubleValue()));
    }

    public static Double tenToTheX(Double x){
        return Double.valueOf(Math.pow(10,x));
    }

    public static Double exp(Double x){
        return Double.valueOf(Math.exp(x));
    }



    // Factorial
    public static Double factorial(Double x){
        if(Double.compare(x,x - x.intValue()) > factorialCutoff)
            return Double.NaN;
        else if(x.compareTo(Double.valueOf(0)) == -1)
            return Double.NaN;
        else
            return factFunction(x);

    }

    public static Double factFunction(Double x){
        int y;
        Long fact = new Long(1);
        if(x.compareTo(Double.valueOf(0))==0)
            return Double.valueOf(1);
        else
            y = x.intValue();
        for(int i=1;i<=y;i++){
            fact*=i;
        }
        return Double.valueOf(fact);
    }


    // I just want this in any calculator
    public static Double e(){
        return Double.valueOf(Math.exp(1));
    }

    public static Double pi(){
        return Double.valueOf(Math.PI);
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
