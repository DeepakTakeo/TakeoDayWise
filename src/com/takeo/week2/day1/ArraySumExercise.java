package com.takeo.week2.day1;

public class ArraySumExercise {

    public static void main(String[] args) {
        // Declare an array of integers
        int[] nums = { 5, 2, 9, 1, 5, 6 };

        //print array in java
        for (int i =0;i<nums.length;i++) {
            System.out.print(nums[i] + " ");
        }

        // Calculate the sum of elements in the array
        int sum = 0;
        for (int i =0;i<nums.length;i++) {
            sum += nums[i];
        }

        // Display the result
        //System.out.println("Array: " + java.util.Arrays.toString(nums));
        System.out.println("Sum of elements: " + sum);
    }
}