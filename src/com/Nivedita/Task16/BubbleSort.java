package com.Nivedita.Task16;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,2,5,7,3,5,2,7,0};
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            int swaps = 0;
            for(int j=1; j< arr.length; j++){
                if(arr[j-1]>arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swaps++;
                }
            }
            if(swaps==0) break;
        }
        System.out.println("After sorting------------------");
        System.out.println(Arrays.toString(arr));
    }
}
