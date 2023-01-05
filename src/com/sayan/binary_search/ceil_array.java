package com.sayan.binary_search;

public class ceil_array {
    public static void main(String[] args) {
        int[] arr ={9,10,14,17,20,25};
        System.out.println(ceil(arr,36));
    }

    private static int ceil(int[] arr, int target) {
        int start=0;
        int l=arr.length;
        int end= l-1;
        int mid = 0;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==target)
                return arr[mid];
            else if (arr[mid]<target)
                start=mid+1;
            else
                end=mid-1;
        }
        if (start>l-1) {
            System.out.println("Index surpassed array length!");
            System.out.println("Last index of array:"+(l-1));
            System.out.print("Searched element at:");
            return start;
        }
        else
            return arr[start];
    }

}
