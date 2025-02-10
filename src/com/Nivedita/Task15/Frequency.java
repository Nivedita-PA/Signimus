package com.Nivedita.Task15;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        String val = "rock solid bottom solid rock rock";
        String ans[] = val.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<ans.length; i++){
            if(map.containsKey(ans[i])){
                map.put(ans[i], map.get(ans[i])+1);
            }else{
                map.put(ans[i],1);
            }
        }
        for (Map.Entry<String,Integer> value: map.entrySet()) {
            System.out.println("Key: "+ value.getKey() + " Value: "+value.getValue());
        }
    }
}
