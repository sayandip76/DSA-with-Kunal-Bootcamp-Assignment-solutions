package com.sayan.conditionals_loops.basic_java_programs;

import java.util.Scanner;

public class rhombus_area {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the 1st diagonal: ");
        float diag1=in.nextFloat();
        System.out.print("Enter the 2nd diagonal: ");
        float diag2=in.nextFloat();
        System.out.print("The area of rhombus: ");
        System.out.format("%.2f",0.5*diag1*diag2);
    }
}
