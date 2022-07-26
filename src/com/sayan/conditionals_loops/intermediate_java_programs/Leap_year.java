package com.sayan.conditionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year= inp.nextInt();
        if (((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println(year+" is a leap year.");
        }
        else {
            System.out.println(year+" is not a leap year.");
        }
    }
}
