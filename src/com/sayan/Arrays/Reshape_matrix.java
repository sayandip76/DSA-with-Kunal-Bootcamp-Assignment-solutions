package com.sayan.Arrays;

import java.util.Arrays;

public class Reshape_matrix {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4},{5,6},{7,8},{9,10},{11,12}};
        System.out.println(Arrays.deepToString(matrixReshape(arr,3,4)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c){
            return mat;
        }
        int[][] ans=new int[r][c];
        int row=0,col=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans[row][col]=mat[i][j];
                col++;
                if(col==c){
                    row++;
                    col=0;
                }
            }
        }
        return ans;
    }
}
