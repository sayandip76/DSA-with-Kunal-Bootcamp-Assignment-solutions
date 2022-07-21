package com.sayan.first_java_ans;

import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter the 1st integer: ");
        int a= inp.nextInt();
        System.out.print("Enter the 2nd integer: ");
        int b= inp.nextInt();
        System.out.print("Enter the operator among (+,-,*,/): ");
        char c=inp.next().charAt(0);
        if (c=='+'){
            System.out.println("The sum of 1st and 2nd integer is: "+ (a+b));
        }
        else if (c=='-'){
            System.out.println("The subtraction of 2nd from 1st integer is: "+ (a-b));
        }
        else if (c=='*') {
            System.out.println("The product of 1st and 2nd integer is: " + (a * b));
        }
        else if (c=='/'){
            System.out.println("The division of 1st by 2nd integer is: "+ (a/b));
        }
        else {
            System.out.println("Undefined operator has been inputted!!!");
        }
    }
}
