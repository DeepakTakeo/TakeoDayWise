package com.takeo.week4.day2;

import java.util.ArrayList;
import java.util.Arrays;

public class ListGrow {

    public static void main(String[] args) {
        int[] originalArray = new int[10];  //10 upto 5 elements  increase size by half 15
        int[] biggerArray;

        // Simulate adding elements to the original array
        for (int i = 0; i < 10; i++) {
            originalArray[i] = i + 1;
        }

        System.out.println(Arrays.toString(originalArray));

        if (originalArray.length == 10) {
            int newCapacity = originalArray.length * 2;
            biggerArray = new int[newCapacity];
            System.arraycopy(originalArray, 0, biggerArray, 0, originalArray.length);
            originalArray = biggerArray;
        }

        System.out.println(Arrays.toString(originalArray));
    }
    }


