package com.sayan.Functions;

import java.util.Scanner;

public class Prime_bet_two {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the two no. between which all prime no. to be printed: ");
        int a= inp.nextInt();
        int b= inp.nextInt();
        for (int i=a; i<=b; i++) {
            if (i > 1) {
                if (prime(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    private static boolean prime(int a) {
        int i=2;
        for (; i*i<=a; i++){
            if (a%i==0) {
                return false;
            }
        }
        return (i*i>a);
    }
}
