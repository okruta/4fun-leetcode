package org.okruta.palindromenumber;

/*
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * */
public class Solution {

    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int length = s.length();
        int invertedIndex = length - 1;

        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(invertedIndex)) {
                return false;
            }

            invertedIndex--;
        }

        return true;
    }
}
