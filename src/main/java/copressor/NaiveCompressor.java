package copressor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NaiveCompressor implements Compressor {

    private String inputString;

    public NaiveCompressor(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public String compress(String inputString) {
        String result = "";
        int inputStrLen = inputString.length();
        char next = 0;
        char actual;
        char previous = 0;

        for (int i = 0; i < inputStrLen; i++) {
            actual = inputString.charAt(i);
            if (i < inputStrLen - 1)
                next = inputString.charAt(i + 1);
            if (i > 0)
                previous = inputString.charAt(i-1);

            if (actual == ' ' || actual == '\n' || actual == '\t') {
                actual = next;
                i++;
                if (i > 0)
                    previous = inputString.charAt(i-1);
                if (i < inputStrLen - 1)
                    next = inputString.charAt(i + 1);
                if (Character.isLowerCase(actual)) {
                    if ((previous != ',') || (previous != '.'))
                    actual = Character.toUpperCase(actual);
                }
            }

            result = result + actual;
        }

        return result;
    }

    @Override
    public String decompress(String input) {
        return null;
    }

//    private char convertPolishSignToASCII(char inputChar){
//        char tmpChar;
//
//        switch (inputChar){
//            case 'ę': tmpChar =
//        }
//
//        return tmpChar;
//    }
}
