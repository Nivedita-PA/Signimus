package com.Nivedita.Task16;

public class ReverseAString {
    public static void main(String[] args) {
     String ans = "";
     ans = reverse("Nikki",5-1,ans);
        System.out.println(ans);
    }
    public static String reverse(String s,int l,String ans){
        if(l==-1) return ans;
        ans  += s.charAt(l);
        return reverse(s,l-1,ans);
    }
}
