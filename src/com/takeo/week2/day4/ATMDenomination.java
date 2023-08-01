package com.takeo.week2.day4;

import java.util.Scanner;

public class ATMDenomination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        int amount = scanner.nextInt();

        // Initialize the denominations
        int[] denominations = {2000, 500, 100};
        int[] notes = new int[denominations.length];


        if(amount < 100 || amount % 5 != 0){
            System.out.println("Cannot Dispense amount");
        }
        else {
            // Distribute the amount in the denominations
            for (int i = 0; i < denominations.length; i++) {
                notes[i] = amount / denominations[i];
                amount = amount % denominations[i];
            }

            // Print the denominations
            System.out.println("Denominations: ");
            for (int i = 0; i < denominations.length; i++) {
                System.out.println(denominations[i] + " : " + notes[i]);
            }
        }
    }
}