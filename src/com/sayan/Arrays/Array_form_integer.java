package com.sayan.Arrays;

import java.util.*;
public class Array_form_integer {
    public static void main(String[] args) {
        int[] arr={1,2,0,0};
        System.out.println(addToArrayForm(arr,34));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i= num.length-1;
        while (k!=0||i>=0){
            if(i>=0)
                k+=num[i--];
            list.add(0, k % 10);
            k /= 10;
        }
        return list;
    }
}
