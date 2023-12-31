package com.takeo.week3.day4;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1 ; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }  // change sorting order
            }
            //i++;
        }
    }
    public static void main(String[] args) {
        int[] array = {64, 34, 25 }; // indexOutOfBound  // {34,64,25} Ist iteration of inner loop j
                                                         // {34,25,64} IInd iteration of inner loop j
                                                  //  II nd iteration of outer loop
                                                     // {25,34,64}  Ist iteration of inner loop


        bubbleSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
