package com.Nivedita.Task21;

import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                if(!st.isEmpty() && st.peek()==map.get(c)) st.pop();
                else return false;
            }else st.push(c);
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(){{{}"));
    }
}
