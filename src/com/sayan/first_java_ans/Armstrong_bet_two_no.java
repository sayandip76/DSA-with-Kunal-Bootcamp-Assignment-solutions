package com.sayan.first_java_ans;

import java.util.Scanner;
//import java.lang.*;

public class Armstrong_bet_two_no {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the starting no.: ");
        int a=inp.nextInt();
        System.out.print("Enter the starting no.: ");
        int b=inp.nextInt();
        for (int i=a+1; i<b; i++){
            int m=(int)(Math.log10(i))+1;
            int n=i,c=0;
            while (n!=0){
                c+=(int)Math.pow(n%10,m);
                n/=10;
            }
            if (i==c){
                System.out.println(i);
            }
        }
    }
}
