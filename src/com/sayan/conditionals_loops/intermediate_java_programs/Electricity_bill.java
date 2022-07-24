package com.sayan.conditionals_loops.intermediate_java_programs;

//source of these measurements: GFG
//        1 to 100 units – Rs. 10/unit
//        100 to 200 units – Rs. 15/unit
//        200 to 300 units – Rs. 20/unit
//        above 300 units – Rs. 25/unit


import java.util.Scanner;

public class Electricity_bill {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the units consumed: ");
        int units= inp.nextInt();
        int bill=0;
        if ((units>=1)&&(units<=100)){
            bill=units*10;
        }
        else if ((units>100)&&(units<=200)){
            bill=100*10+(units-100)*15;
        }
        else if ((units>200)&&(units<=300)){
            bill=100*10+100*15+(units-200)*20;
        }
        else if (units>300){
            bill=100*10+100*15+100*20+(units-300)*25;
        }
        System.out.println("Electricity bill: "+"Rs."+bill);
    }
}
