package com.sayan.conditionals_loops.basic_java_programs;

import java.util.Scanner;

public class circle_area {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        float radius=in.nextFloat();
        System.out.print("The area of circle: ");
        System.out.format("%.3f",(3.14*radius*radius));
    }
}
