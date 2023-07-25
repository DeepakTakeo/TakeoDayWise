package com.takeo.week1.day3;

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {

        String s = "567";  // String pool   //part of memory
        String t = new String("Hello");   // create  String in heap memory
        //data get stored in different part of memory

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Concatenate the first name and last name with a space in between
        String fullName = firstName + " " + lastName;

        System.out.println("Your full name is: " + fullName);

        scanner.close();
    }
}
