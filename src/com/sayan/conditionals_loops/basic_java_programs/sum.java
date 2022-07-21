package com.sayan.conditionals_loops.basic_java_programs;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int c=0;
        boolean a=true;
        while (a){
            int input=inp.nextInt();
            if (input!=0) {
                c += input;
            }
            else {
                a=false;
            }
        }
        System.out.print("The sum of all the inputted numbers is: "+c);
    }
}
