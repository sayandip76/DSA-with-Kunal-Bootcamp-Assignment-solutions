package com.sayan.first_java_ans;

import java.util.Scanner;

public class INR_USDollar {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter amount in rupee currency: ");
        float money=inp.nextFloat();
        System.out.println("After conversion into US Dollar, the money is: "+ (money*0.013)+"$");
    }
}
