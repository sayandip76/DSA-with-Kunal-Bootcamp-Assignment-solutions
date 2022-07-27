package com.sayan.Functions;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class maximum_minimum {
    public static void main(String[] args) {
        max_min();
    }

     static void max_min() {
         Scanner inp=new Scanner(System.in);
         int max=MIN_VALUE;
         int min=MAX_VALUE;
         boolean s=true;
         while (s){
             int num= inp.nextInt();
             if (num==0){
                 s=false;
             }
             else {
                 if (min > num) {
                     min = num;
                 }
                 if (num > max) {
                     max = num;
                 }
             }
         }
         System.out.println("Minimum of all the numbers: "+min);
         System.out.println("Maximum of all the numbers: "+max);
     }
}

