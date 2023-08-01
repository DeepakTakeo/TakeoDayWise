package com.takeo.week3.day1;

import java.util.Scanner;

public class MonthNameProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month number (1-12): ");
        int monthNumber = scanner.nextInt();

        String monthName = getMonthName(monthNumber);

        if (monthName != null) {
            System.out.println("The month corresponding to number " + monthNumber + " is " + monthName + ".");
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }

        scanner.close();
    }

    public static String getMonthName(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return null; // Invalid month number
        }
    }
}