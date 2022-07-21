package com.sayan.conditionals_loops.basic_java_programs;

import java.util.Scanner;

public class perimeter_square {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        float side=in.nextFloat();
        System.out.print("The perimeter of square: ");
        System.out.format("%.3f",(4*side));
    }
}
