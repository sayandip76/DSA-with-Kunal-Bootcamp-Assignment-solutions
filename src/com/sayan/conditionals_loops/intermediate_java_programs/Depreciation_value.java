package com.sayan.conditionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Depreciation_value {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the current value of the item: ");
        float v1= inp.nextFloat();
        System.out.println("Enter the rate of depreciation of the item per year: ");
        float r= inp.nextFloat();
        System.out.println("Enter the time period in terms of years: ");
        int t = inp.nextInt();
        float v2= (float) (v1*Math.pow((1-r/100),t));
        System.out.printf("The value of the item after %d years is: %.2f",t,v2);
    }
}
