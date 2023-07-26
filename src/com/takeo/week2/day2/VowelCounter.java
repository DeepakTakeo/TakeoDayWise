package com.takeo.week2.day2;

import java.util.Scanner;

public class VowelCounter {
    public static int countVowels(String sentence, char[] vowelsArray) {
        int vowelCount = 0;
        sentence = sentence.toLowerCase();

        for (char ch : sentence.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsArray[vowelCount] = ch;
                vowelCount++;
            }
        }

        return vowelCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String userInput = scanner.nextLine();

        char[] vowelsArray = new char[userInput.length()]; // Max size for storing all characters
        int vowelCount = countVowels(userInput, vowelsArray);

        System.out.println("Number of vowels in the sentence: " + vowelCount);
        System.out.print("Vowels: ");
        for (int i = 0; i < vowelCount; i++) {
            System.out.print(vowelsArray[i] + " ");
        }

        scanner.close();
    }
}
