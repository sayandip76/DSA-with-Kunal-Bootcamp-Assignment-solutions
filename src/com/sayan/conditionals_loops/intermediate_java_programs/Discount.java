package com.sayan.conditionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter marked price: ");
        float mp= inp.nextFloat();
        System.out.println("Enter selling price: ");
        float sp= inp.nextFloat();
        float discount=mp-sp;
        System.out.printf("Percentage of discount given in this purchase: %.2f %%",(discount/mp)*100);
    }
}
