package com.sayan.Arrays;

import java.util.Arrays;

public class Plus_one {
    public static void main(String[] args) {
        int[] arr1={9,8,5,7,6,9};
        int[] arr2={2,3,8,9,4};
        int[] arr3={9,9,9,9,9,9,9,9};
        System.out.println(Arrays.toString(plusOne(arr1)));
        System.out.println(Arrays.toString(plusOne(arr2)));
        System.out.println(Arrays.toString(plusOne(arr3)));
    }
    public static int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] ans=new int[n+1];
        ans[0]=1;
        return ans;
    }
}
