package com.sayan.conditionals_loops.basic_java_programs;

import java.util.Scanner;

public class parallelogram_area {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the base: ");
        float base=in.nextFloat();
        System.out.print("Enter the height: ");
        float height=in.nextFloat();
        System.out.print("The area of parallelogram: ");
        System.out.format("%.2f",base*height);
    }
}
