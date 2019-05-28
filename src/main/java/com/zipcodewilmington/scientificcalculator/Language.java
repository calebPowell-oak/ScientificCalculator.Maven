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
                    "x^y:       pow\n" +
                    "x^1/2:     sqrt\n" +
                    "1/x:       recip\n" +
                    "flip sign: sign\n" +
                    "sin():     sin\n" +
                    "cos():     cos\n" +
                    "tan():     tan\n" +
                    "arcsin():  asin\n" +
                    "arccos():  acos\n" +
                    "arctan():  atan\n" +
                    "Log:       log\n" +
                    "Ln:        ln\n" +
                    "10^x:      10^\n" +
                    "e^x:       e^\n" +
                    "Factorial: !\n" +
                    "Square:    ^2",
            "Comandos disponibles:\n" +
                    "Añadir:    +\n" +
                    "Sustraer:  -\n" +
                    "Multiplicar: *\n" +
                    "Dividir:   /\n" +
                    "x^y:       pow\n" +
                    "x^1/2:     sqrt\n" +
                    "1/x:       recip\n" +
                    "flip sign: sign\n" +
                    "sin():     sin\n" +
                    "cos():     cos\n" +
                    "tan():     tan\n" +
                    "arcsin():  asin\n" +
                    "arccos():  acos\n" +
                    "arctan():  atan\n" +
                    "Log:       log\n" +
                    "Ln:        ln\n" +
                    "10^x:      10^\n" +
                    "e^x:       e^\n" +
                    "Factorial: !\n" +
                    "Square:    ^2",
    };
    private static String[] mainCmds = {
            "Available commands:\n" +
                    "C: calculator mode\n" +
                    "list: list commands\n" +
                    "DMode: change degree mode\n" +
                    "CMode: change calc mode (hex, bin, dec, oct)\n" +
                    "LMode: change language\n" +
                    "Math: list math operators\n" +
                    "Puppy: Show puppy" +
                    "\nExit: exit",

            "Available commands:\n" +
                    "C: modo calculadora\n" +
                    "list: listar comandos\n" +
                    "DMode: cambiar el modo de grado\n" +
                    "CMode: cambiar el modo de cálculo (hex, bin, dec, oct)\n" +
                    "LMode: cambiar idioma\n" +
                    "Math: listar operadores matemáticos\n" +
                    "Puppy: mostrar perrito" +
                    "\nExit: suspender",
    };
    private static String[] invalidInput = {"Invalid input.", "inputo invalido"};
    private static String[] inputPrompt = {"Enter a number. (or enter \"q\" to quit)",
            "Ingrese un número. (o ingrese \"q\" para suspender)"};
    private static String[] opPromt = {"Enter an operator", "Ingrese un operador"};
    private static String[] mainCom = {"", ""};
    private static String[] com = {"Command:          (list: list commands)",
            "Comando:          (list: listar comandos)"};
    private static String[] exit = {"Exit calc mode?\ny/n", "salir del modo de cálculo?\ny/n"};

    public static ArrayList<String> greeting = new ArrayList<String>(Arrays.asList(greets));
    public static ArrayList<String> availableCommands = new ArrayList<String>(Arrays.asList(cmds));
    public static ArrayList<String> inputInvalid = new ArrayList<String>(Arrays.asList(invalidInput));
    public static ArrayList<String> promptForInput = new ArrayList<String>(Arrays.asList(inputPrompt));
    public static ArrayList<String> promptForOperator = new ArrayList<String>(Arrays.asList(opPromt));
    public static ArrayList<String> command = new ArrayList<String>(Arrays.asList(com));
    public static ArrayList<String> mainCommands = new ArrayList<String>(Arrays.asList(mainCmds));
    public static ArrayList<String> quitCalc = new ArrayList<String>(Arrays.asList(exit));

}
