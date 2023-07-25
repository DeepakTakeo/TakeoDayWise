package com.takeo.week1.day3;

import java.util.Scanner;

public class StringConcatenation2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the area code: ");
        String areaCode = scanner.nextLine();

        System.out.print("Enter the local number: ");
        String localNumber = scanner.nextLine();

        // Concatenate the area code and local number with a hyphen in between
        String phoneNumber = areaCode.concat("-").concat(localNumber);

        System.out.println("The complete phone number is: " + phoneNumber);

        scanner.close();
    }
}
