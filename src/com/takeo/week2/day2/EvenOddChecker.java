package com.takeo.week2.day2;

public class EvenOddChecker {
    public static void checkEvenOdd(int[] numbers) {
        for (int number : numbers) {
            String result = (number % 2 == 0) ? "even" : "odd";
            System.out.println(number + " is " + result);
        }
    }

    public static void main(String[] args) {
        int[] sampleArray = {2, 7, 10, 15, 6};

        System.out.println("Checking even/odd for elements in the array:");
        checkEvenOdd(sampleArray);
    }
}