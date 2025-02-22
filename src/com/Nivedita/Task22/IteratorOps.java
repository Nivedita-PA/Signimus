package com.Nivedita.Task22;

import java.util.*;

public class IteratorOps {
    public static void main(String[] args) {

        //Practice 1
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Nivedita,Uday,Bhaskar"));
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        while(iterator.hasNext()){
            if(iterator.next().startsWith("B")){
                iterator.remove();
            }
        }
        System.out.println(names);

        //2
        LinkedList<String> cities = new LinkedList<>(Arrays.asList("Bangalore","Pune","Delhi"));
        ListIterator<String> iterator1 = cities.listIterator();
        System.out.println("Cities in forward");
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("Cities in backward");
        while (iterator1.hasPrevious()){
            System.out.println(iterator1.previous());
        }

        //3
        Vector<String> vector = new Vector<>(Arrays.asList("India","Pakistan","China"));
        Enumeration<String> enumeration = vector.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
