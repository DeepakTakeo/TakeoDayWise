package com.takeo.day4;

import java.util.Scanner;

public class RelationalLogicalOperatorsExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 10 && number < 100) {
            System.out.println("The number is in the range of 10 to 100.");
        } else if (number < 0 || number > 100) {
            System.out.println("The number is out of range.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is neither in the range of 10 to 100 nor zero.");
        }

        scanner.close();
    }


}
