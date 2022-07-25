package com.sayan.conditionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1= inp.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2= inp.nextInt();
        int pdt=num1*num2;
        while (num1%num2!=0){
            int temp=num1;
            num1=num2;
            num2=temp%num2;
        }
        System.out.println("H.C.F = "+num2);
        System.out.println("L.C.M = "+(pdt/num2));
    }
}
