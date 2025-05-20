package org.example.easyTasks;

/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {5, 8, 1, 0, -3, 2, 8, 2};

        System.out.println(Arrays.toString(twoSum(array, 5)));
        System.out.println(Arrays.toString(twoSum2(array, 5)));
    }

    public static int[] twoSum(int[] nums, int target) {
        // моё решение
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSum2(int[] nums, int target) {
        // Подход 1: Грубая сила
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // If no valid pair is found, return an empty array instead of null
        return new int[] {};
    }
}
