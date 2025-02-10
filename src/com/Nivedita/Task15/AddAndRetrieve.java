package com.Nivedita.Task15;

import java.util.*;

public class AddAndRetrieve {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(7);
        arr.add(16);
        System.out.println(arr);

        //LinkedList
        LinkedList<Integer> ll =  new LinkedList<>();
        ll.add(23);
        ll.add(55);
        ll.add(89);
        System.out.println(ll);

        //TreeSet
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        System.out.println(ts);
        ts.add(30);
        System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts.last());

        //HashMap
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Banana");
        map.put(2,"Apple");
        map.put(3,"guava");
        map.put(4,"lichi");
        for (Map.Entry<Integer,String> val:map.entrySet()) {
            System.out.println("Key: "+val.getKey() +" Value: " +val.getValue());
        }
    }
}
