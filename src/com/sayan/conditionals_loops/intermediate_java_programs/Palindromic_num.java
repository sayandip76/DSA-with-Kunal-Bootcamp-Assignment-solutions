package com.sayan.conditionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Palindromic_num {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= inp.nextInt();
        int num1=num;
        int num2=0;
        while(num>0){
            num2=num2*10+(num%10);
            num/=10;
        }
        if (num1==num2) {
            System.out.println(num1+" is a palindromic number.");
        }
        else {
            System.out.println(num1+" is not a palindromic number.");
        }
    }
}
