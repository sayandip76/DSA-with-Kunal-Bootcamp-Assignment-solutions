package com.sayan.Arrays;

import java.util.ArrayList;

public class Greatest_num_candies {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,3};
        System.out.println(kidsWithCandies(arr,3));
    }
    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans=new ArrayList<>(candies.length);
        int max=0;
        for (int candy : candies) {
            if (max < candy) {
                max = candy;
            }
        }

        for (int candy : candies) {
            if (max <= candy + extraCandies) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}
