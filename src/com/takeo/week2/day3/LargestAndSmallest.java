package com.takeo.week2.day3;

public class LargestAndSmallest {

    public static void main(String[] args) {
        int[] array = {10, 4, 2, 9, 7, 5, 3, 8, 6, 1};
        int largest = array[0];
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            } else if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        System.out.println("The largest element in the array is " + largest);
        System.out.println("The smallest element in the array is " + smallest);
    }
}