package com.sayan.first_java_ans;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the no. of terms of the series: ");
        int n= inp.nextInt();
        int a=0,b=1,c;
        System.out.println("The fibonacci series up to "+n+" numbers: ");
        System.out.print("0 1");
        for (int i=2; i<n; i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
