package com.sayan.conditionals_loops.basic_java_programs;

import java.util.Scanner;

public class volume_prism {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the base pf the triangular side: ");
        float base=in.nextFloat();
        System.out.print("Enter the altitude of the triangular side: ");
        float altitude=in.nextFloat();
        System.out.print("Enter the length between the two triangular faces: ");
        float length=in.nextFloat();
        System.out.print("The volume of the prism: ");
        System.out.format("%.2f",0.5*base*altitude*length);
    }
}
