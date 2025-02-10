package com.Nivedita.Task15;

import java.util.*;

public class RemovingDuplicates {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,5,7,3,5,2,7,0);
        System.out.println(arr);
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.size(); i++){
            set.add(arr.get(i));
        }
        System.out.println("After removing duplicates");
        System.out.println(set);
    }
}
