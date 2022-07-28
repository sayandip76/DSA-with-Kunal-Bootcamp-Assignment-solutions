package com.sayan.Arrays;

import java.util.ArrayList;

public class Pangram_sentence {
    public static void main(String[] args) {
        String s="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }
    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        String alphas = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphas.length(); i++) {
            if (sentence.indexOf(alphas.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}
