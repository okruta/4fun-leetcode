package org.okruta.twosums;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> neededMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int needed = target - current;
            Integer indexOfNeeded = neededMap.get(current);
            if (indexOfNeeded != null) {
                return new int[]{indexOfNeeded, i};
            }
            neededMap.put(needed, i);
        }
        throw new IllegalArgumentException("No result");
    }
}
