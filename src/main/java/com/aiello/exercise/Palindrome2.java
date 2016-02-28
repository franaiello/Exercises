package com.aiello.exercise;

/**
 * Created by francisaiello on 11/30/15.
 */
public class Palindrome2 {

    public static boolean isPalindrome(String value) {
        String upper = value.toUpperCase();
        for (int i=0, j=value.length()-1; i<=j-1; i++, j--) {
            if (upper.charAt(i) != upper.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
