package com.sayan.Arrays;


public class Richest_customer_wealth {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        int max=0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int money : account) {
                sum += money;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
