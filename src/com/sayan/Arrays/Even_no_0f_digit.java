package com.sayan.Arrays;

public class Even_no_0f_digit {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if((int)(Math.log10(num)+1)%2==0){
                count++;
            }
        }
        return count;
    }
}
