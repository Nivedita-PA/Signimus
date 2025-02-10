package com.Nivedita.Task16;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,2,5,2,7,0};
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            int temp =  arr[minIndex];
            arr[minIndex]  = arr[i];
            arr[i] = temp;
        }
        System.out.println("After sorting------------------");
        System.out.println(Arrays.toString(arr));
    }
}
