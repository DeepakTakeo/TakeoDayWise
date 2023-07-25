package com.takeo.week1.day5;

import java.util.Scanner;

public class MovieTicketBookingProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Movie Ticket Booking System!");
        System.out.println("Movies Playing Today:");
        System.out.println("1. Action Movie - 'The Avengers'");
        System.out.println("2. Comedy Movie - 'Just for Laughs'");
        System.out.println("3. Drama Movie - 'The Pursuit of Happyness'");
        System.out.print("Enter the number of the movie you want to watch (1/2/3): ");

        int movieChoice = scanner.nextInt();

        // Concatenate user's movie choice to the final booking message
        String bookingMessage = "You have booked tickets for: ";

        // Use switch to determine the selected movie based on the user's choice
        switch (movieChoice) {
            case 1:
                bookingMessage += "Action Movie - 'The Avengers'";
                break;
            case 2:
                bookingMessage += "Comedy Movie - 'Just for Laughs'";
                break;
            case 3:
                bookingMessage += "Drama Movie - 'The Pursuit of Happyness'";
                break;
            default:
                System.out.println("Invalid choice! Booking default movie.");
                bookingMessage += "Action Movie - 'The Avengers'"; // Default movie choice
        }

        // Ask the user for the number of tickets
        System.out.print("How many tickets do you want to book? ");
        int numTickets = scanner.nextInt();

        // Calculate the total cost based on the number of tickets using if-else statement
        double ticketPrice;
        if (movieChoice == 1) {
            ticketPrice = 10.0; // Action Movie ticket price
        } else if (movieChoice == 2) {
            ticketPrice = 8.0; // Comedy Movie ticket price
        } else {
            ticketPrice = 9.0; // Drama Movie ticket price
        }

        double totalCost = ticketPrice * numTickets;

        // Add total cost to the booking message
        bookingMessage += ". Number of tickets: " + numTickets + ". Total cost: $" + totalCost;

        System.out.println(bookingMessage);
        System.out.println("Enjoy the movie!");

        scanner.close();
    }
}
