package com.sayan.conditionals_loops.basic_java_programs;

import java.util.Scanner;

public class perimeter_equi_triangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the side: ");
        float side=in.nextFloat();
        System.out.print("The perimeter of the equilateral triangle: ");
        System.out.format("%.2f",3*side);
    }
}
