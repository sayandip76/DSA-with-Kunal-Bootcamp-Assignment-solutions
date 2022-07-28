package com.sayan.Arrays;

import java.util.ArrayList;

public class Pangram_sentence {
    public static void main(String[] args) {
        String s="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }
    public static boolean checkIfPangram(String sentence) {
        for (char i='a'; i<='z'; i++) {
            if (sentence.indexOf(i) == -1) {
                return false;
            }
        }
        return true;
    }
}
