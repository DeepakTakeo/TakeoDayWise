package com.takeo.week3.day3;

public class SmallestPositiveInt {

    public static int findSmallestPositiveInt(int[] array) {
        int smallestPositiveInt = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] <= smallestPositiveInt) {
                smallestPositiveInt = array[i];
            }
        }

        return smallestPositiveInt;
    }

    public static void main(String[] args) {
        int[] array = {-1, 0, 2, 3, 5, 10, 11};

        int smallestPositiveInt = findSmallestPositiveInt(array);

        System.out.println("The smallest positive integer in the array is: " + smallestPositiveInt);
    }
}
