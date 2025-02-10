package com.Nivedita.Task16;

public class Fcatorial {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }
    public static int fact(int a){
        if(a==1 || a==0) return 1;
        return fact(a-1)*a;
    }
}
