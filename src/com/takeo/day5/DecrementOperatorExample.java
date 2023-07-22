package com.takeo.day5;

public class DecrementOperatorExample {

    public static void main(String[] args) {
        int count = 8;

        // Using prefix decrement (--count)
        int result1 = --count; // Decrement count first, then assign to result1
        System.out.println("Prefix Decrement:");
        System.out.println("count: " + count); // Output: 7
        System.out.println("result1: " + result1); // Output: 7

        // Reset count to 8
        count = 8;

        // Using postfix decrement (count--)
        int result2 = count--; // Assign count to result2 first, then decrement count
        System.out.println("\nPostfix Decrement:");
        System.out.println("count: " + count); // Output: 7
        System.out.println("result2: " + result2); // Output: 8
    }
}
