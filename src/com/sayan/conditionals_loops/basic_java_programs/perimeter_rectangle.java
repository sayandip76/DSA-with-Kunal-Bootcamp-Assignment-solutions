package com.sayan.conditionals_loops.basic_java_programs;

import java.util.Scanner;

public class perimeter_rectangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length: ");
        float length=in.nextFloat();
        System.out.print("Enter the breadth: ");
        float breadth=in.nextFloat();
        System.out.print("The perimeter of rectangle: ");
        System.out.format("%.2f",2*(length+breadth));
    }
}
