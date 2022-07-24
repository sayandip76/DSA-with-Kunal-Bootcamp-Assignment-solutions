package com.sayan.conditionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a no.: ");
        float n= inp.nextFloat();
        System.out.println("Enter the exponent to the inputted no.: ");
        float p= inp.nextFloat();
         float pow=1;
        if (p==0){
            System.out.println("The power of "+n+" to "+p+" is: 1");
        }
        else if (p>0) {
            int i=0;
            while (i<p){
                pow*=n;
                i++;
            }
            System.out.println("The power of "+n+" to "+p+" is: "+pow);
        }
        else{
            int i=0;
            while (i<Math.abs(p)){
                pow*=n;
                i++;
            }
            System.out.printf("The power of "+n+" to "+p+" is: %.3f",(1/pow));
        }

    }
}
