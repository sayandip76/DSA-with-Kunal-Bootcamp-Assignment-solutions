package com.sayan.Arrays;

import java.util.Arrays;

public class Remove_duplicates {
    public static void main(String[] args) {
        int[] arr={4,4,5,6,7,7,7,8,8,9};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=1; i<nums.length; i++){
            if(nums[k]!=nums[i]){
                k++;
                nums[k]=nums[i];
            }
        }
        //System.out.println(Arrays.toString(nums));
        return k+1;
    }
}
