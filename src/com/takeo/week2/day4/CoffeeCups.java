package com.takeo.week2.day4;

public class CoffeeCups {
    public static int totalCups(int n) {
        int freeCups = n / 6;
        return n + freeCups;
    }

    public static void main(String[] args) {
        System.out.println(totalCups(6));    // Output: 7
        System.out.println(totalCups(12));   // Output: 14
        System.out.println(totalCups(213));  // Output: 248
    }
}