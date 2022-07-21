package com.sayan.conditionals_loops.basic_java_programs;

import java.util.Scanner;

public class TSA_cube {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the side of cube: ");
        float side=in.nextFloat();
        System.out.print("The T.S.A of the cube: ");
        System.out.format("%.3f",(6*side*side));
    }
}
