package com.sayan.Arrays;

import java.util.Arrays;

public class Matrix_rotation {
    public static void main(String[] args) {
        int[][]arr={{0,1,0,0},{0,1,1,1},{1,0,0,0},{0,1,0,1}};
        int tar[][]={{1,0,1,0},{0,0,0,1},{1,1,1,0},{0,0,1,0}};
        System.out.println((findRotation(arr,tar)));
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        //int[][] ans=new int[n][n];
        int i=0,f=0;
        for(; i<n; i++){
            for(int j=0; j<n; j++){
                if(target[i][j]!=mat[i][j]){
                    f=1;
                    break;
                };
            }
            if(f==1)
                break;
        }
        if(i>=n){
            return true;
        }
        i=0;
        f=0;
        for(; i<n; i++){
            for(int j=0; j<n; j++){
                if(target[j][n-i-1]!=mat[i][j]){
                    f=1;
                    break;
                };
            }
            if(f==1)
                break;
        }
        if(i>=n){
            return true;
        }
        i=0;
        f=0;
        for(; i<n; i++){
            for(int j=0; j<n; j++){
                if(target[n-i-1][n-j-1]!=mat[i][j]){
                    f=1;
                    break;
                };
            }
            if(f==1)
                break;
        }
        if(i>=n){
            return true;
        }
        i=0;
        f=0;
        for(; i<n; i++){
            for(int j=0; j<n; j++){
                if(target[n-j-1][i]!=mat[i][j]){
                    f=1;
                    break;
                };
            }
            if(f==1)
                break;
        }
        if(i>=n){
            return true;
        }
        return false;
    }
}
