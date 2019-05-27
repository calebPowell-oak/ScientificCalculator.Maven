package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class BasicFunctions {

    private static Double solution;
    //Basic Functions

    public BasicFunctions()
    {

    }

    public static Double addition(Double x, Double y)
    {
        return x + y;
    }
    public static Double subtraction(Double x, Double y)
    {
        return x - y;
    }
    public static Double multiplication(Double x, Double y)
    {
        return x * y;
    }
    public static Double division(Double x, Double y)
    {
        solution = x / y;
        return solution;
    }
    public static Double root(Double x)
    {
        return x = Math.sqrt(Math.abs(x));
    }
    public static Double power(Double base, Double exp){
        return Math.pow(base, exp);
    }
    public static Double square(Double base){
        return Math.pow(base, 2);
    }
    public static Double invert(Double x){
        return 1/x;
    }
    public static Double flipSign(Double x){
        return -1*x;
    }

}