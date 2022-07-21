package com.sayan.first_java_ans;

import java.util.Scanner;

public class Palindrome_string {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=inp.next();
        String p="";
        for (int i=s.length()-1; i >= 0; i--){
            p=p+s.charAt(i);
        }
        if (s.equals(p)){
            System.out.println("The inputted string is Palindrome.");
        }
        else {
            System.out.println("The inputted string is not a Palindrome.");
        }
    }
}
