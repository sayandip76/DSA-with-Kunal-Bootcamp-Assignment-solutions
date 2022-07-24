package com.sayan.conditionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the numbers until the ultimate entry of '0': ");
        int c=0,sum=0;
        boolean a=true;
        while (a){
            int input= inp.nextInt();
            if (input!=0){
                sum+=input;
                c++;
            }
            else {
                a=false;
            }
        }
        float avg=(float)sum/(float) c;
        System.out.print("The average of all the inputted no.: "+avg);
    }
}
