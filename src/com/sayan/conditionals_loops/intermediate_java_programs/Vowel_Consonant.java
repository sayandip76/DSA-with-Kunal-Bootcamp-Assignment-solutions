package com.sayan.conditionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char alpha= inp.next().trim().charAt(0);
        if (((alpha>='a')&&(alpha<='z'))||((alpha>='A')&&(alpha<='Z'))) {
            if ((alpha == 'a') || (alpha == 'e') || (alpha == 'i') || (alpha == 'o') || (alpha == 'u') || (alpha == 'A') || (alpha == 'E') || (alpha == 'I') || (alpha == 'O') || (alpha == 'U')) {
                System.out.println(alpha + " is a vowel.");
            } else {
                System.out.println(alpha + " is a consonant.");
            }
        }
        else {
            System.out.println(alpha+" is not an alphabet!!!");
        }
    }
}
