package com.takeo.day5;

import java.util.Scanner;

public class TicketBookingSystemIfElse {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Ticket Booking System!");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check ticket price based on age using if-else statements
        double ticketPrice;
        if (age <= 3) {
            ticketPrice = 0.0; // Free ticket for children below or equal to 3 years
        } else if (age <= 12) {
            ticketPrice = 5.0; // Child ticket price for age 4 to 12
        } else if (age <= 60) {
            ticketPrice = 10.0; // Standard ticket price for age 13 to 60
        } else {
            ticketPrice = 7.5; // Senior citizen ticket price for age above 60
        }

        System.out.println("Your ticket price is: $" + ticketPrice);

        scanner.close();
    }
}
