package com.zipcodewilmington.scientificcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Puppy {

    public static String getPuppy(){
        Random r = new Random();
        String[] puppyArr = {"            __\n" +
                "(\\,--------'()'--o     " + Language.dogTalk.get(MainApplication.getLanguageChoice()) +"\n" +
                " (_    ___    /~\"\n" +
                "  (_)_)  (_)_)","             .--~~,__\n" +
                ":-....,-------`~~'._.'\n" +
                " `-,,,  ,_      ;'~U'     " + Language.dogTalk.get(MainApplication.getLanguageChoice()) +"\n" +
                "  _,-' ,'`-__; '--.\n" +
                " (_/'~~      ''''(;","          __\n" +
                " \\ ______/ V`-,\n" +
                "  }        /~~      " + Language.dogTalk.get(MainApplication.getLanguageChoice()) +"\n" +
                " /_)^ --,r'\n" +
                "|b      |b",",-.___,-.\n" +
                "\\_/_ _\\_/\n" +
                "  )O_O(\n" +
                " { (_) }   " + Language.dogTalk.get(MainApplication.getLanguageChoice()) +"\n" +
                "  `-^-'  ","             ___\n" +
                "          __/_  `.  .-\"\"\"-.\n" +
                Language.dogTalk.get(MainApplication.getLanguageChoice()) + "     \\_,` | \\-'  /   )`-')\n" +
                "           \"\") `\"`    \\  ((`\"`\n" +
                "          ___Y  ,    .'7 /|\n" +
                "         (_,___/...-` (_/_/ "};
        ArrayList<String> pups = new ArrayList<String>(Arrays.asList(puppyArr));
        return pups.get(r.nextInt(puppyArr.length));
    }
}

