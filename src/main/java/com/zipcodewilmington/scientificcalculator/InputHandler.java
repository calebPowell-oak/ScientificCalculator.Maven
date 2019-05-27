package com.zipcodewilmington.scientificcalculator;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import sun.applet.Main;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputHandler {

    private Double result;
    private String rawInput;
    private String cleanInput;
    private String operator;
    private Double nextValue;
    private Double prevValue;
    //                                                      "/^([\\+/*-] +)?[\\+-]?[\\d]+\\.?([\\d]+)?/gm"
    private Pattern octalDoubleRegex =      Pattern.compile("^([\\+/*-] +)?[\\+-]?[0-7]+\\.?([0-7]+)?");
    private Pattern binaryDoubleRegex =     Pattern.compile("^([\\+/*-] +)?[\\+-]?[01]+\\.?([01]+)?");
    private Pattern decimalDoubleRegex =    Pattern.compile("^([\\+/*-] +)?[\\+-]?[\\d]+\\.?([\\d]+)?");
    private Pattern hexDoubleRegex =        Pattern.compile("^([\\+/*-] +)?[\\+-]?[\\d]+\\.?([\\d]+)?");
    private Pattern opsRegex =              Pattern.compile("[\\+*/-]");

    public InputHandler() {
        result = 0d;
        rawInput = "";
        cleanInput = "";
        operator = "";
        nextValue = 0d;
        prevValue = 0d;
    }

    public void inputCycle(){
        rawInput = getInputFromUser();
        cleanInput();

    }

    public void cleanInput(){
        Matcher m;
        switch(MainApplication.getDisplayModeChoice()){
            case 0:{
                m = binaryDoubleRegex.matcher(rawInput);
                break;
            }
            case 1:{
                m = octalDoubleRegex.matcher(rawInput);
                break;
            }
            case 3:{
                m = hexDoubleRegex.matcher(rawInput);
                break;
            }
            default:{
                m = decimalDoubleRegex.matcher(rawInput);
                break;
            }
        }
        m.find();
        try {
            if(m.groupCount() > 1){
                cleanInput = m.group(0);
            } else {
                cleanInput = m.group();
            }
        } catch (Exception e) {
            Console.println(Language.inputInvalid.get(MainApplication.getLanguageChoice()));
        }
    }

//    public void fillFields(){
//        if (hasOperator(cleanInput)) {
//
//        }
//    }

    public Boolean hasOperator(String input){
        Matcher m = opsRegex.matcher(input);
        m.find();
        System.out.println(m.groupCount());
        return m.groupCount() > 0;
    }



    public String getInputFromUser(){
        return Console.getStringInput(Language.promptForInput.get(MainApplication.getLanguageChoice()));
    }

    public String getCleanInput(){
        return cleanInput;
    }

    public void setRawInput(String rawInput) {
        this.rawInput = rawInput;
    }
}
