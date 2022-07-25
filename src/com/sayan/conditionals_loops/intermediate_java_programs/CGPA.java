package com.sayan.conditionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the no. of subjects: ");
        int n= inp.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the marks of all the subjects: ");
        int grade=0;
        for (int i=0; i<n; i++){
            arr[i]=inp.nextInt();
            grade+=arr[i]/10;
        }
        float grade_avg=(float)grade/(float)n;
        System.out.printf("CGPA obtained by the student: %.2f",grade_avg);
    }
}
