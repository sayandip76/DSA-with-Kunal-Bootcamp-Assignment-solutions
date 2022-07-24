package com.sayan.conditionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class commission_percentage {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the basic amount: ");
        float amount= inp.nextFloat();
        System.out.print("Enter the commission amount: ");
        float commission= inp.nextFloat();
        float com_per=(commission/amount)*100;
        System.out.printf("The commission percentage on Rs. %.2f is: %.2f %%.",amount,com_per);
    }
}
