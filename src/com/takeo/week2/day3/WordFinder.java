package com.takeo.week2.day3;

import java.util.Scanner;

public class WordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word position to find (1 for the first word, 2 for the second, etc.): ");
        int n = scanner.nextInt();

        String result = findWord(sentence, n);
        System.out.println("The " + n + " word is: " + result);

        scanner.close();
    }

    public static String findWord(String sentence, int n) {
        String[] words = sentence.split(" ");
        int numWords = words.length;

        if (n < 1 || n > numWords) {
            return "Invalid position";
        }

        return words[n - 1];
    }
}

