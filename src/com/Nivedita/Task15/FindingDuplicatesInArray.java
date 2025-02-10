package com.Nivedita.Task15;

import java.util.*;

public class FindingDuplicatesInArray {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,5,7,3,5,2,7,0);
        Set<Integer> set =  new HashSet<>();
        Set<Integer> ans =  new HashSet<>();
        for(int i=0; i<arr.size(); i++){
            if(set.contains(arr.get(i))){
                ans.add(arr.get(i));
            }else set.add(arr.get(i));
        }
        System.out.println(ans);

    }
}
