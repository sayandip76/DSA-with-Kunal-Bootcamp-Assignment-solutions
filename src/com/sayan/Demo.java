package com.sayan;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the 1st integer: ");
        int a= input.nextInt();
        System.out.print("Enter the 2nd integer: ");
        int b= input.nextInt();
        System.out.print("The sum of the two integers is: "+ (a+b));
    }
}
