package com.sayan.Arrays;

import java.util.Arrays;

public class Odd_val_matrix {
    public static void main(String[] args) {
        int m=2,n=3;
        int[][] arr={{0,1},{1,1}};
        System.out.println(oddCells(m,n,arr));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[] row=new int[m];
        int[] col=new int[n];
        for (int[] index : indices) {
            row[index[0]]++;
            col[index[1]]++;
        }
        int c=0;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if(((row[i]+col[j])%2)!=0)
                    c++;
            }
        }
        return c;
    }
}
