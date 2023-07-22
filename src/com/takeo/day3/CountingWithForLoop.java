package com.takeo.day3;

import java.util.Scanner;

public class CountingWithForLoop {

    //Use a for loop when you know the exact number of iterations or when you have a well-defined loop control variable
    // that needs to be incremented or decremented in a specific pattern.

    public static void main(String[] args) {

        // counting

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit for counting: ");
        int limit = scanner.nextInt();

        // post Operator
        // pre Operator

        for (int i = 1; i <= limit; i++) {

            if(i%2 == 0){
                System.out.print(i + " ");
            }

            //i = i+1;
        }

        // 1,3, 5, 7, 9
        // 2,4,6,8,10


        System.out.println(); // Move to the next line after printing the numbers.
        scanner.close();
    }


    //counting from 1 to 50
}
