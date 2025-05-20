package org.example.easyTasks;

// Given an integer x, return true if x is a palindrome, and false otherwise.

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        String sourceStr = String.valueOf(x);
        StringBuilder sb = new StringBuilder(sourceStr);
        String reverseStr = String.valueOf(sb.reverse());
        if (sourceStr.equals(reverseStr)) {
            return true;
        }
        return false;
    }
}
