package com.sayan.conditionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Compound_interest {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        float prin=inp.nextFloat();
        System.out.println("Enter the rate of interest: ");
        float rate=inp.nextFloat();
        System.out.println("Enter the time period in terms of years: ");
        int time=inp.nextInt();
        float CI= (float) (prin*Math.pow(1+rate/100,time));
        System.out.printf("Compound Interest: %.2f",CI);
    }
}
