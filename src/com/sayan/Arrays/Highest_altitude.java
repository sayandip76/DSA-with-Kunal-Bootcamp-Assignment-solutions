package com.sayan.Arrays;

public class Highest_altitude {
    public static void main(String[] args) {
        int[] arr={-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
        arr= new int[]{-4, -3, -2, -1, 4, 3, 2};
        System.out.println(largestAltitude(arr));
    }
    public static int largestAltitude(int[] gain) {
        int c=0, max=0;
        for (int j : gain) {
            c += j;
            if (c > max) {
                max = c;
            }
        }
        return max;
    }
}
