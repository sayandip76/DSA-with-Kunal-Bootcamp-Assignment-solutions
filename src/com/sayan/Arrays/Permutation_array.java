package com.sayan.Arrays;

import java.util.*;

public class Permutation_array {
    public static void main(String[] args) {
        int[] arr={0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }
    public static int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
