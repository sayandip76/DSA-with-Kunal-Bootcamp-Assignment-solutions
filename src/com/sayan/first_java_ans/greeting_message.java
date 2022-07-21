package com.sayan.first_java_ans;

import java.util.Scanner;

public class greeting_message {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name=inp.nextLine();
        System.out.println("Hello "+name+"! Welcome to Java.");
    }
}
