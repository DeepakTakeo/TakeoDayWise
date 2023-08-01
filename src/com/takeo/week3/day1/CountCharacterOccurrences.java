package com.takeo.week3.day1;

import java.util.Scanner;

public class CountCharacterOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to count: ");
        char character = scanner.next().charAt(0);

        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == character) {
                count++;
            }
        }

        System.out.println("Occurrences of '" + character + "' in the string: " + count);

        scanner.close();
    }
}
