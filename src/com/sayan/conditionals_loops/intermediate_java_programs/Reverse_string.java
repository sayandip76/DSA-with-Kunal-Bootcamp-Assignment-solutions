package com.sayan.conditionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Reverse_string {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=inp.next();
        int l=str.length();
        String str2="";
        for (int i=0; i<l; i++){
            str2+=str.trim().charAt(l-i-1);
        }
        System.out.println("Reversed string: "+str2);
    }
}
