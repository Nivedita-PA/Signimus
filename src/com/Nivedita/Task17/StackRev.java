package com.Nivedita.Task17;

import java.util.Stack;

public class StackRev {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String name = "Nivedita";
        for(int i=0; i<name.length(); i++){
            st.add(name.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!st.empty()){
            sb.append(st.pop());
        }
        System.out.println(sb.toString());
    }
}
