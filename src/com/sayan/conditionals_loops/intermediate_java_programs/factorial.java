package com.sayan.conditionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n=inp.nextInt();
        int c=1;
        while (n!=1){
            c*=n;
            n--;
        }
        System.out.print("Factorial of the inputted no. is: "+c);
    }
}
