package com.sayan.conditionals_loops.basic_java_programs;

import java.util.Scanner;

public class volume_pyramid {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the base length: ");
        float length=in.nextFloat();
        System.out.print("Enter the base width: ");
        float width=in.nextFloat();
        System.out.print("Enter the height of pyramid: ");
        float height=in.nextFloat();
        System.out.print("The volume of pyramid: ");
        System.out.format("%.3f",length*width*height/3);
    }
}
