package com.takeo.week3.day1;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Print the original array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        // Print the reversed array
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
