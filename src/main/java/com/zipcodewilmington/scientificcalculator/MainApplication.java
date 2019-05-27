package com.zipcodewilmington.scientificcalculator;

import com.sun.javaws.Main;
import com.sun.org.apache.xpath.internal.operations.Bool;
import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    private static Integer langChoice = 0;
    private static Integer degreeChoice = 0;
    private static Integer displayModeChoice = 2;
    private static Boolean finished = false;

    public static void main(String[] args) {
        InputHandler app = new InputHandler();
        while(!finished){
            app.takeCommand();
        }
    }

    public static void setLangChoice(){
        switch(Console.getIntegerInput("1: English, 2: Español")){
            case 2:{
                MainApplication.langChoice = 1;
                break;
            }
            default:{
                MainApplication.langChoice = 0;
                break;
            }
        }
    }

    public static void setDegreeChoice(){
        switch (Console.getIntegerInput("1: Degree, 2: Radian, 3: Gradian")){
            case 2:{
                degreeChoice = 1;
                break;
            }
            case 3:{
                degreeChoice = 2;
                break;
            }
            default:{
                degreeChoice = 0;
            }
        }
    }

    public static void setCalcChoice() {
        switch (Console.getIntegerInput("1: Binary, 2: Octal, 3: Dec, 4: Hexadecimal")){
            case 1:{
                displayModeChoice = 0;
                break;
            }
            case 2:{
                displayModeChoice = 1;
                break;
            }
            case 4:{
                displayModeChoice = 3;
                break;
            }
            default:{
                displayModeChoice = 2;
            }
        }
    }

    public static void setFinished(Boolean x){
        finished = x;
    }

    public static Integer getDegreeChoice(){
        return degreeChoice;
    }

    public static Integer getLanguageChoice(){
        return langChoice;
    }

    public static Integer getDisplayModeChoice() {
        return displayModeChoice;
    }
}
