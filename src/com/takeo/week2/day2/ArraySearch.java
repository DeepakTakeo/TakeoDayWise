package com.takeo.week2.day2;

import java.util.Scanner;

public class ArraySearch {
    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the target integer to search for:");
        int target = scanner.nextInt();

        int index = findIndex(array, target);

        if (index != -1) {
            System.out.println("Target integer " + target + " found at index " + index + ".");
        } else {
            System.out.println("Target integer " + target + " not found in the array.");
        }

        scanner.close();
    }
}
