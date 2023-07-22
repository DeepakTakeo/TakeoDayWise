package com.takeo.day5;

import java.util.Scanner;

public class CoffeeShopOrderUsingSwitch  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Menu is as :");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Cappuccino");
        System.out.println("4. Americano");
        System.out.print("Enter the number of your desired coffee: ");

        //Different price for these coofee
        // output as total price you have to pay to shopkeeper

        int coffeeChoice = scanner.nextInt();








        // Using switch expression to prepare the selected coffee
        String coffeeType;
        switch (coffeeChoice) {
            case 1:
                coffeeType = "Espresso";
                break;
            case 2:
                coffeeType = "Latte";
                break;
            case 3:
                coffeeType = "Cappuccino";
                break;
            case 4:
                coffeeType = "Americano";
                break;
            default:
                System.out.println("Invalid choice! We'll prepare Espresso for you.");
                coffeeType = "Espresso";
        }

        System.out.println("Preparing your " + coffeeType + ". Enjoy your coffee!");

        scanner.close();
    }
}
