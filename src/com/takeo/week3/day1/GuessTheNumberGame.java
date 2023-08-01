package com.takeo.week3.day1;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Guess the Number game!");
        System.out.print("Enter the range of numbers (minimum and maximum, separated by a space): ");
        int minRange = scanner.nextInt();
        int maxRange = scanner.nextInt();

        int secretNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("I've selected a number between " + minRange + " and " + maxRange + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess the number.");

        while (attempts < maxAttempts) {
            System.out.print("Attempt #" + (attempts + 1) + ": Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You've guessed the correct number " + secretNumber + " in " + attempts + " attempts.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've run out of attempts. The correct number was " + secretNumber + ".");
        }

        scanner.close();
    }
}

