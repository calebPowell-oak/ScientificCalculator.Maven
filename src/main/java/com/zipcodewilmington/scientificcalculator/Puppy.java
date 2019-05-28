package com.zipcodewilmington.scientificcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Puppy {
    private static String[] puppyArr = {"            __\n" +
            "(\\,--------'()'--o\n" +
            " (_    ___    /~\"\n" +
            "  (_)_)  (_)_)","             .--~~,__\n" +
            ":-....,-------`~~'._.'\n" +
            " `-,,,  ,_      ;'~U'\n" +
            "  _,-' ,'`-__; '--.\n" +
            " (_/'~~      ''''(;","          __\n" +
            " \\ ______/ V`-,\n" +
            "  }        /~~\n" +
            " /_)^ --,r'\n" +
            "|b      |b",",-.___,-.\n" +
            "\\_/_ _\\_/\n" +
            "  )O_O(\n" +
            " { (_) }\n" +
            "  `-^-'  ","    ___\n" +
            " __/_  `.  .-\"\"\"-.\n" +
            " \\_,` | \\-'  /   )`-')\n" +
            "  \"\") `\"`    \\  ((`\"`\n" +
            " ___Y  ,    .'7 /|\n" +
            "(_,___/...-` (_/_/ "};

    public static ArrayList<String> pups = new ArrayList<String>(Arrays.asList(puppyArr));

    public static String getPuppy(){
        Random r = new Random();
        return pups.get(r.nextInt(puppyArr.length - 1));
    }
}

