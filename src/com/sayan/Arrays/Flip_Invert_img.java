package com.sayan.Arrays;

import java.util.Arrays;

import static java.util.Arrays.deepToString;

public class Flip_Invert_img {
    public static void main(String[] args) {
        int[][] arr={{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(deepToString(flipAndInvertImage(arr)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int l=image.length;
        for(int i=0; i<l; i++){
            for(int j=0; j*2< image[i].length; j++){
                if(image[i][j]==image[i][image[i].length-j-1]){
                    image[i][j]=(image[i][image[i].length-j-1])^=1;
                }
            }
        }
        return image;
    }
}
