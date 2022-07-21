package com.sayan.first_java_ans;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        float p= inp.nextFloat();
        System.out.print("Enter the rate of interest: ");
        float r= inp.nextFloat();
        System.out.print("Enter the time period: ");
        int t= inp.nextInt();
        float SI=p*r*t/100;
        System.out.println("The simple interest for all the given parameters is: "+SI);
    }
}
