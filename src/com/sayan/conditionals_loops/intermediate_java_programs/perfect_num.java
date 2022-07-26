package com.sayan.conditionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class perfect_num {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int num= inp.nextInt();
        int c=1;
        for (int i=2; i*i<=num; i++){
            if (i==num/i){
                c+=i;
            }
            else {
                if (num % i == 0) {
                    c += (i + num / i);
                }
            }
        }
        if (c==num){
            System.out.println(num+" is perfect no.");
        }
        else {
            System.out.println(num+" is not a perfect no.");
        }
    }
}
