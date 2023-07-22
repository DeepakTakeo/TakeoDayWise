package com.takeo.day3;

import java.util.Scanner;

public class CountingWithWhileLoop {

    public static void main(String[] args) {

        //Use a while loop when the number of iterations is not known beforehand and is determined by a condition.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit for counting: ");
        int limit = scanner.nextInt();

        int i = 1;
        while (i <= limit) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println(); // Move to the next line after printing the numbers.

        scanner.close();
    }
}
