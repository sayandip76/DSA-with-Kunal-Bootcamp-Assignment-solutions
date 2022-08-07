package com.sayan.Arrays;

import java.util.Arrays;

public class Two_sum {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int n=9;
        System.out.println(Arrays.toString(twoSum(arr,n)));
    }
    public static int[] twoSum(int[] nums, int target) {
        //int[] ans=new int[2];
        for(int i=1; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[j]+nums[j-i]==target){
                    return new int[]{j-i,j};
                }
            }
        }
        return null ;
    }
}
