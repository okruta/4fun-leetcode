package org.okruta.palindromenumber;

/*
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * */
public class Solution3 {

    public boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        if (number < 10) {
            return true;
        }
        int reverse = 0;
        int temp = number;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return reverse == number;
    }
}