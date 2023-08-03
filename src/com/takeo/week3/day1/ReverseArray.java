package com.takeo.week3.day1;

import java.util.Date;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int size = sc.nextInt();



        //1
        //1000
        //1000000

        Date d = new Date();
       int[] array = new int[size]; // int  -> 32 bits/4 bytes.  = 4*5 = 20 bytes  //Fixed 5 values

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
