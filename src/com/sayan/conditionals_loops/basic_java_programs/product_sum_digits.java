package com.sayan.conditionals_loops.basic_java_programs;

import java.util.Scanner;

public class product_sum_digits {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number with at least two digits: ");
        int num= inp.nextInt();
        int pdt=1,sum=0;
        while (num!=0){
            pdt*=num%10;
            sum+=num%10;
            num/=10;
        }
        System.out.println("The difference between product and sum of the digits of a no. is: "+(pdt-sum));
    }
}
