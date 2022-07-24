package com.sayan.conditionals_loops.basic_java_programs;

import java.util.Scanner;

public class perimeter_circle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        float radius=in.nextFloat();
        System.out.print("The perimeter of circle: ");
        System.out.format("%.3f",(2*3.14*radius));
    }
}
