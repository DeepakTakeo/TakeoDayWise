package com.takeo.week2.day1;

import java.util.Scanner;

public class ArraySumWithScanner {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array based on the user's input size
        int[] nums = new int[size];

        // Ask the user to input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // Close the Scanner after taking input
        scanner.close();

        // Calculate the sum of elements in the array
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // Display the result
        System.out.println("Array: " + java.util.Arrays.toString(nums));
        System.out.println("Sum of elements: " + sum);
    }
}
