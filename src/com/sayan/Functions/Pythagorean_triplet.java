package com.sayan.Functions;

import java.util.Scanner;

public class Pythagorean_triplet {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the triplet with space in between each of them: ");
        int a= inp.nextInt();
        int b= inp.nextInt();
        int c= inp.nextInt();
        System.out.println(pyth(a,b,c));
    }

    private static boolean pyth(int a, int b, int c) {
        return c * c == a * a + b * b;
    }
}
