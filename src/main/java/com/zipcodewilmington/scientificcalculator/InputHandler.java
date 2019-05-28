package com.zipcodewilmington.scientificcalculator;

//import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
//import sun.applet.Main;

//import sun.applet.Main;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputHandler {

    private String operator;
    private Double nextValue;
    private Double prevValue;

    private Pattern opsRegex = Pattern.compile(
            "[\\+/*!\\-]|disbin|disoct|disdec|dishex|sqrt|sign|recip|sin|cos|tan|asin|acos|atan|log|ln|10\\^|e\\^|pow|\\^2"
    );
    private Pattern regexMode;

    private Boolean isNew = true;
    private Boolean exitEarly = false;

    public InputHandler() {
        operator = "";
        nextValue = 0d;
        prevValue = 0d;
    }

    public Pattern setRegexMode(int val){

        Pattern binaryDoubleRegex =     Pattern.compile("[\\+-]?(([0-1]+(\\.[0-1]+)?)|(\\.[0-1]+))");
        Pattern octalDoubleRegex =      Pattern.compile("[\\+-]?(([0-7]+(\\.[0-7]+)?)|(\\.[0-7]+))");
        Pattern decimalDoubleRegex =    Pattern.compile("[\\+-]?((\\d+(\\.\\d+)?)|(\\.\\d+))");
        Pattern hexDoubleRegex =        Pattern.compile("[\\+-]?(([0-9a-fA-F]+(\\.[0-9a-fA-F]+)?)|(\\.[0-9a-fA-F]+))");

        switch (val) {
            case 0:{
                return binaryDoubleRegex;
            }
            case 1:{
                return octalDoubleRegex;
            }
            case 3:{
                return hexDoubleRegex;
            }
            default:{
                return decimalDoubleRegex;
            }
        }
    }

    public String operatorFromInput(){
        Matcher m = opsRegex.matcher(Console.getStringInput(Language.promptForOperator.get(MainApplication.getLanguageChoice())).toLowerCase());
        if(m.find()){
            return m.group();
        } else {
            Console.println(Language.inputInvalid.get(MainApplication.getLanguageChoice()));
            return operatorFromInput();
        }
    }

    public Double numberFromInput(){
        regexMode = setRegexMode(MainApplication.getDisplayModeChoice());
        Matcher m = regexMode.matcher(Console.getStringInput(Language.promptForInput.get(MainApplication.getLanguageChoice())));
        if(m.find()){
            return InputFormatter.format(m.group(),MainApplication.getDisplayModeChoice());
//            return Double.valueOf(m.group());
        } else {
            Console.println(Language.inputInvalid.get(MainApplication.getLanguageChoice()));
            Console.println(Language.quitCalc.get(MainApplication.getLanguageChoice()));
            if(Console.getStringInput("").toLowerCase().equals("y")){
                exitEarly = true;
                return 0d;
            } else {
                return numberFromInput();
            }
        }
    }

    public Double doMath(){
        try {
            switch (operator) {
                case "-": {
                    return BasicFunctions.subtraction(prevValue, nextValue);
                }
                case "/": {
                    return BasicFunctions.division(prevValue, nextValue);
                }
                case "*": {
                    return BasicFunctions.multiplication(prevValue, nextValue);
                }
                case "disbin": {
                    Console.println(DisplayModeOutputter.getOutput(prevValue, 0));
                    return prevValue;
                }
                case "disoct":{
                    Console.println(DisplayModeOutputter.getOutput(prevValue, 1));
                    return prevValue;
                }
                case "disdec":{
                    Console.println(DisplayModeOutputter.getOutput(prevValue, 2));
                    return prevValue;
                }
                case "dishex":{
                    Console.println(DisplayModeOutputter.getOutput(prevValue, 3));
                    return prevValue;
                }
                case "sqrt":{
                    return BasicFunctions.root(prevValue);
                }
                case "sign":{
                    return BasicFunctions.flipSign(prevValue);
                }
                case "recip":{
                    return BasicFunctions.invert(prevValue);
                }
                case "sin":{
                    return CalSciFunctions.sine(prevValue, MainApplication.getDegreeChoice());
                }
                case "cos":{
                    return CalSciFunctions.cosine(prevValue, MainApplication.getDegreeChoice());
                }
                case "tan":{
                    return CalSciFunctions.tangent(prevValue, MainApplication.getDegreeChoice());
                }
                case "asin":{
                    return CalSciFunctions.arcsine(prevValue, MainApplication.getDegreeChoice());
                }
                case "acos":{
                    return CalSciFunctions.arccosine(prevValue, MainApplication.getDegreeChoice());
                }
                case "atan":{
                    return CalSciFunctions.arctangent(prevValue, MainApplication.getDegreeChoice());
                }
                case "log":{
                    return CalSciFunctions.log(prevValue);
                }
                case "ln":{
                    return CalSciFunctions.ln(prevValue);
                }
                case "10^":{
                    return CalSciFunctions.tenToTheX(prevValue);
                }
                case "e^":{
                    return CalSciFunctions.exp(prevValue);
                }
                case "!":{
                    return CalSciFunctions.factorial(prevValue);
                }
                case "+":{
                    return BasicFunctions.addition(prevValue, nextValue);
                }
                case "pow":{
                    return BasicFunctions.power(prevValue, nextValue);
                }
                case "^2":{
                    return BasicFunctions.square(prevValue);
                }
                default: {
                    return 0d;
                }
            }
        } catch (Exception e) {
            Console.println("ERR");
            return 0d;
        }
    }

    public Double controlLoop(){
        while(!exitEarly) {
            if (isNew) {
                prevValue = numberFromInput();
                if(exitEarly)break;
            }
            operator = operatorFromInput();
            if (isUnary(operator)) {
                if(exitEarly)break;
                prevValue = doMath();
                isNew = false;
                Console.println(DisplayModeOutputter.getOutput(prevValue, MainApplication.getDisplayModeChoice()));
            } else {
                if(exitEarly)break;
                nextValue = numberFromInput();
                prevValue = doMath();
                isNew = false;
                Console.println(DisplayModeOutputter.getOutput(prevValue, MainApplication.getDisplayModeChoice()));
            }
        }
        exitEarly = false;
        isNew = true;
        return 0d;
    }

    public Boolean isUnary(String op){
        String[] unaryOps = {"disbin", "disoct", "disdec", "dishex",
            "sqrt", "sign", "recip", "sin", "cos", "tan",
            "acos", "asin", "atan", "log", "ln", "10^",
            "e^", "!", "^2"};
        for (String operators:unaryOps) {
            if(operators.equals(op)){
                return true;
            }
        }
        return false;
    }

    public void takeCommand(){
        switch(Console.getStringInput(Language.command.get(MainApplication.getLanguageChoice())).toLowerCase()){
            case "cmode":{
                MainApplication.setCalcChoice();
                break;
            }
            case "dmode":{
                MainApplication.setDegreeChoice();
                break;
            }
            case "lmode":{
                MainApplication.setLangChoice();
                break;
            }
            case "list":{
                Console.println(Language.mainCommands.get(MainApplication.getLanguageChoice()));
                break;
            }
            case "c":{
                controlLoop();
                break;
            }
            case "exit":{
                MainApplication.setFinished(Boolean.TRUE);
                break;
            }
            case "math":{
                Console.println(Language.availableCommands.get(MainApplication.getLanguageChoice()));
                break;
            }
            case "puppy":{
                Console.println(Puppy.getPuppy());
                break;
            }
            default:{
                Console.println(Language.inputInvalid.get(MainApplication.getLanguageChoice()));
                break;
            }
        }
    }
}
