package com.sayan.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Target_array {
    public static void main(String[] args) {
        int[] arr1={0,1,2,3,4};
        int[] arr2={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(arr1,arr2)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] ans=new int[index.length];
        ArrayList<Integer> target=new ArrayList<>();
        for(int i=0; i<index.length; i++){
            target.add(index[i],nums[i]);
        }

        for(int i=0; i<index.length; i++){
            ans[i]=target.get(i);
        }
        return ans;
    }
}
