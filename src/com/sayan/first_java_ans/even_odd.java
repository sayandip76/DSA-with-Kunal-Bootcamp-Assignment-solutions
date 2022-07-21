package com.sayan.first_java_ans;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int num= inp.nextInt();
        if (num%2==0){
            System.out.println(num+" is an even no.");
        }
        else {
            System.out.println(num+" is an odd no.");
        }
    }
}
