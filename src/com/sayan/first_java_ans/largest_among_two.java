package com.sayan.first_java_ans;

import java.util.Scanner;

public class largest_among_two {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a= inp.nextInt();
        int b= inp.nextInt();
        if (a>b){
            System.out.println(a+" is largest one among the two no.");
        }
        else {
            System.out.println(b+" is largest one among the two no.");
        }
    }
}
