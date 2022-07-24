package com.sayan.conditionals_loops.basic_java_programs;

import java.util.Scanner;

public class CSA_cylinder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the radius of base of the circle: ");
        float radius=in.nextFloat();
        System.out.print("Enter the height of the cylinder: ");
        float height=in.nextFloat();
        System.out.print("The C.S.A of the cylinder: ");
        System.out.format("%.3f",(2*3.14*radius*height));
    }
}
