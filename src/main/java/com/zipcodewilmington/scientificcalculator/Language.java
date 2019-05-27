package com.zipcodewilmington.scientificcalculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Language {

    private static String[] greets = {"Welcome to my calculator!", "!Bienvenidos a mi calculadora!"};
    private static String[] cmds = {
            "Available commands:\n" +
                    "Add:       +\n" +
                    "Subtract:  -\n" +
                    "Multiply:  *\n" +
                    "Divide:    /\n" +
                    "x^2:       s\n" +
                    "x^1/2:     r\n",

            "Comandos disponibles\n" +
                    "añadir:    +\n" +
                    "sustraer:  -\n" +
                    "multiplicar: *\n" +
                    "dividir:   /\n" +
                    "x^2:       s\n" +
                    "x^1/2:     r\n"
    };
    private static String[] invalidInput = {"Invalid input.", "inputo invalido"};
    private static String[] inputPrompt = {"Enter a number or a command.", "Ingrese un número o un comando."};

    public static ArrayList<String> greeting = new ArrayList<String>(Arrays.asList(greets));
    public static ArrayList<String> availableCommands = new ArrayList<String>(Arrays.asList(cmds));
    public static ArrayList<String> inputInvalid = new ArrayList<String>(Arrays.asList(invalidInput));
    public static ArrayList<String> promptForInput = new ArrayList<String>(Arrays.asList(inputPrompt));

}
