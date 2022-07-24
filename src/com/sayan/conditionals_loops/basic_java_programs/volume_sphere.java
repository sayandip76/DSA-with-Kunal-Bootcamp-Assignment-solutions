package com.sayan.conditionals_loops.basic_java_programs;

import java.util.Scanner;

public class volume_sphere {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the radius of sphere: ");
        float radius=in.nextFloat();
        System.out.print("The volume of sphere: ");
        System.out.format("%.3f",(4.0/3.0)*(3.14*radius*radius*radius));
    }
}
