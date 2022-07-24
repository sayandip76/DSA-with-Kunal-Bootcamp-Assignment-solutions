package com.sayan.conditionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Distance_bet_points {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.println("Enter the coordinates of the 1st point in 3D: ");
        float a1= inp.nextInt();
        float b1= inp.nextInt();
        float c1= inp.nextInt();
        System.out.println("Enter the coordinates of the 2nd point in 3D: ");
        float a2= inp.nextInt();
        float b2= inp.nextInt();
        float c2= inp.nextInt();
        float distance= (float) Math.sqrt(Math.pow(a1-a2,2)+Math.pow(b1-b2,2)+Math.pow(c1-c2,2));
        System.out.printf("The distance between the two coordinates is: %.3f",distance);
    }
}
