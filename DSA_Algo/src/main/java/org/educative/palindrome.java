package org.educative;

public class palindrome {
    public static boolean isPalindrome(String s) {
        // This problem solved using two pointers

        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
