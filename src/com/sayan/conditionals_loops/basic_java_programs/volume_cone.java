package com.sayan.conditionals_loops.basic_java_programs;

import java.util.Scanner;

public class volume_cone {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the base radius: ");
        float base=in.nextFloat();
        System.out.print("Enter the height of the cone: ");
        float height=in.nextFloat();
        System.out.print("The volume of the cone: ");
        System.out.format("%.2f",(1.0/3.0)*3.14*base*base*height);
    }
}
