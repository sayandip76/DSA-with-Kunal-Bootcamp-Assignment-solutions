package com.sayan.conditionals_loops.basic_java_programs;

import java.util.Scanner;

public class equilateral_triangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the side: ");
        float side=in.nextFloat();
        System.out.print("The area of the equilateral triangle: ");
        System.out.format("%.2f",(Math.pow(3,0.5)/4)*Math.pow(side,2));
    }
}
