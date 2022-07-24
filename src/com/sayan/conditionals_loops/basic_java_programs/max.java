package com.sayan.conditionals_loops.basic_java_programs;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int max=inp.nextInt();
        boolean a=true;
        while (a){
            int input=inp.nextInt();
            if (input!=0){
                if(input>max){
                    max=input;
                }
            }
            else {
                a=false;
            }
        }
        System.out.print("The maximum of all the inputted numbers is: "+max);
    }
}
