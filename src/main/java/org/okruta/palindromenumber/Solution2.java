package org.okruta.palindromenumber;

/*
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * */
public class Solution2 {

    public boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        if (number < 10) {
            return true;
        }

        int length = (int) (Math.log10(number) + 1);
        int temp = number;

        for (int i = 0; i < length / 2; i++) {
            int remainder = temp % 10;
            temp = temp / 10;

            int reversed = (number / ((int) Math.pow(10, length - 1 - i))) % 10;
            if (remainder != reversed) {
                return false;
            }
        }

        return true;
    }
}