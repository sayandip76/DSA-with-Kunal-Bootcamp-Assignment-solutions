package com.sayan.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Lucky_no_matrix {
    public static void main(String[] args) {
        int[][] arr={{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(arr));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        for (int[] ints : matrix) {
            int min = ints[0] + 1, c = 0;
            for (int j = 0; j < n; j++) {
                if (ints[j] < min) {
                    min = ints[j];
                    c = j;
                }
            }
            int max = min;
            for (int[] value : matrix) {
                if (value[c] > max)
                    max = value[c];
            }
            if (max == min)
                ans.add(max);
        }
        return ans;
    }
}
