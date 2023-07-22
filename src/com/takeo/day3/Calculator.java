package com.takeo.day3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator;
        double num1, num2, result;
        boolean repeat = true;

        do {
            // Step 1: Prompt the user to enter the first number.
            System.out.print("Enter the first number: ");
            num1 = scanner.nextDouble();

            // Step 2: Prompt the user to enter the operator.
            System.out.print("Enter the operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            // Step 3: Prompt the user to enter the second number.
            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();

            // Step 4: Perform the calculation based on the operator.
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator. Please try again.");
                    continue;
            }

            // Step 5: Display the result to the user.
            System.out.println("Result: " + result);

            // Step 6: Ask the user if they want to perform another calculation.
            System.out.print("Do you want to perform another calculation? (y/n): ");
            String answer = scanner.next();

            // Step 7: Check if the user wants to repeat or exit the program.
            repeat = answer.equalsIgnoreCase("y");

        } while (repeat);

        // Step 8: Exit the program.
        System.out.println("Goodbye!");
        scanner.close();
    }
}
