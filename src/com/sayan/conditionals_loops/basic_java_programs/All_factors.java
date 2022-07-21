package com.sayan.conditionals_loops.basic_java_programs;

import java.util.*;

public class All_factors {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>(2);
        System.out.print("Enter a number: ");
        int num=inp.nextInt();
        System.out.println("All the factors of the inputted no. is: ");
        int c=-1;
        for (int i=1; i<=Math.sqrt(num); i++){
            if (num%i==0){
                c++;
                arr.add(c,i);
                if (i!=num/i) {
                    arr.add(arr.size() - c, num / i);
                }
            }
        }
        System.out.println(arr);
    }
}
