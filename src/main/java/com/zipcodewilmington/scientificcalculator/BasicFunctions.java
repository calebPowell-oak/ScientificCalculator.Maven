package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class BasicFunctions {

    private Double solution;
    private Double x;
    private Double y;


    //Basic Functions
    public BasicFunctions()

    {

    }

    public Double addition(Double x, Double y)
    {
        return x + y;
    }
    public Double subtraction(Double x, Double y)
    {
        return x - y;
    }
    public Double multiplication(Double x, Double y)
    {
        return x * y;
    }
    public Double division(Double x, Double y)
    {
        solution = x / y;
        return solution;
    }
    public Double root(Double x)
    {
        return x = Math.sqrt(Math.abs(x));

    }

}
