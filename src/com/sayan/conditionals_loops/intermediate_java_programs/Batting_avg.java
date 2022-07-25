package com.sayan.conditionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Batting_avg {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the total no. of runs scored: ");
        int runs= inp.nextInt();
        System.out.println("Enter the total no. innings played: ");
        int innings= inp.nextInt();
        System.out.println("Enter the no. of times the player remains not out: ");
        int not_out= inp.nextInt();
        int out=innings-not_out;
        if (out==0){
            System.out.print("The batting average of the batsman is: NA");
        }
        else {
            float bat_avg = (float) runs / (float) out;
            System.out.printf("The batting average of the batsman is: %.3f", bat_avg);
        }
    }
}
