package com.sayan.Arrays;

public class Matrix_diag_sum {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        System.out.println(diagonalSum(arr));
    }
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0; i<mat.length; i++){
            if(i!=(mat.length-i-1)){
                sum+=mat[i][i]+mat[i][mat.length-i-1];
            }
            else{
                sum+=mat[i][i];
            }
        }
        return sum;
    }
}
