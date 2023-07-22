package com.takeo.day3;

import java.util.Scanner;

public class ScannerNext {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //next() can take input as 1 word only,if we press space then it will terminate program
        System.out.print("Enter your first name in : ");
        String firstName = scanner.next();

        //nextLine() can take whole line as input ,if we press enter control will go to next line
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.println(firstName);
        System.out.println(fullName);

        scanner.close();
    }
}
