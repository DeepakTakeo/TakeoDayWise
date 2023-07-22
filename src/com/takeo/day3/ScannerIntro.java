package com.takeo.day3;


import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {
        // Step 1: Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in); // memory and cpu resources occupied.  reference  //outOfMemory

        // Step 2: Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Step 3: Use the Scanner object to read the input (name) from the user
        String name = scanner.nextLine();

        //sql db lang
        //C, C#, Python, Go
        //equals ,== contains

        // Step 4: Prompt the user to enter their age
        System.out.print("Enter your age: ");

        // Step 5: Use the Scanner object to read the input (age) from the user
        int age = scanner.nextInt();

        // Step 6: Prompt the user to enter their favorite number
        System.out.print("Enter your favorite number: ");

        // Step 7: Use the Scanner object to read the input (favorite number) from the user
        double favoriteNumber = scanner.nextDouble();

        // Step 8: Display the collected information back to the user
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite number is " + favoriteNumber + ".");

        // Step 9: Close the Scanner to release the resources (optional but good practice)
        scanner.close();
    }


}
