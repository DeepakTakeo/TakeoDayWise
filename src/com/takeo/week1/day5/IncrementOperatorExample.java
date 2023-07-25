package com.takeo.week1.day5;

public class IncrementOperatorExample {

    public static void main(String[] args) {
        int count = 5;

        // Using prefix increment (++count)
        int result1 = ++count; // Increment count first, then assign to result1
        System.out.println("Prefix Increment:");
        System.out.println("count: " + count); // Output: 6
        System.out.println("result1: " + result1); // Output: 6

        // Reset count to 5
        count = 5;

        // Using postfix increment (count++)
        int result2 = count++; // Assign count to result2 first, then increment count
        System.out.println("\nPostfix Increment:");
        System.out.println("count: " + count); // Output: 6
        System.out.println("result2: " + result2); // Output: 5
    }
}
