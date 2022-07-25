package com.sayan.conditionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class nCr_nPr {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter n=");
        int n=inp.nextInt();
        System.out.print("Enter r=");
        int r= inp.nextInt();
        int p=1,q=1;
        for (int i=0; i<r; i++){
            p*=n-i;
            q*=i+1;
        }
        System.out.println("nCr = "+(p/q));
        System.out.println("nPr = "+p);
    }
}
