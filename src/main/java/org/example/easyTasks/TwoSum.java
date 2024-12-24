package org.example.easyTasks;

public class TwoSum {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        // моё решение
//        int firstIndex = 0;
//        int secondIndex = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int firstNum = nums[i];
//            for (int j = i+1; j < nums.length; j++) {
//                int secondNum = nums[j];
//                if (target == firstNum + secondNum){
//                    firstIndex = i;
//                    secondIndex = j;
//                }
//            }
//        }
//        return new int[]{firstIndex, secondIndex};

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
