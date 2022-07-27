package com.sayan.conditionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class sum_negative_even_odd {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num,sum_neg=0,sum_e=0,sum_o=0;
        boolean in=true;
        System.out.println("Enter the number one by one and end the process with 0: ");
        while (in){
            num= inp.nextInt();
            if (num==0)
                in=false;
            if (num<0){
                sum_neg+=num*(-1);
            }
            else {
                if (num%2==0){
                    sum_e+=num;
                }
                else {
                    sum_o+=num;
                }
            }
        }
        System.out.println("Sum of -Ve numbers: -"+sum_neg);
        System.out.println("Sum of +Ve even numbers: "+sum_e);
        System.out.println("Sum of +Ve odd numbers: "+sum_o);
    }
}
