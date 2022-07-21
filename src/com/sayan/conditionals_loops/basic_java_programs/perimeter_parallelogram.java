package com.sayan.conditionals_loops.basic_java_programs;

import java.util.Scanner;

public class perimeter_parallelogram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the longer side: ");
        float base=in.nextFloat();
        System.out.print("Enter the shorter side: ");
        float height=in.nextFloat();
        System.out.print("The perimeter of parallelogram: ");
        System.out.format("%.2f",2*(base+height));
    }
}
