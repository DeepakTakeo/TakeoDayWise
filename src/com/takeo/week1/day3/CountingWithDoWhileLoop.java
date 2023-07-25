package com.takeo.week1.day3;

import java.util.Scanner;

public class CountingWithDoWhileLoop {

    // Use a do-while loop when you want to ensure that the loop body is executed at least once before
    // checking the termination condition.
    // use cases

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit for counting: ");
        int limit = scanner.nextInt();

        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= limit);

        System.out.println(); // Move to the next line after printing the numbers.

        scanner.close();
    }


}
