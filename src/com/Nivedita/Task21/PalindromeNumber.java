package com.Nivedita.Task21;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int y = 0;
        int temp = Math.abs(x);
        int last = 0;
        while(temp>0){ //121
            last = temp%10;
            y = (y*10)+last;
            temp /= 10;
        }
        if(x==y) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(331));
    }
}
