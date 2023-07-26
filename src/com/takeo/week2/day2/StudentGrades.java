package com.takeo.week2.day2;

import java.util.Scanner;

public class StudentGrades {
    static int[] grades = new int[5];

    public static double getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static char getGradeLetter(double averageGrade) {
        if (averageGrade >= 90) {
            return 'A';
        } else if (averageGrade >= 80) {
            return 'B';
        } else if (averageGrade >= 70) {
            return 'C';
        } else if (averageGrade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static boolean isPassing(double averageGrade) {
        return averageGrade >= 60;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter grades for five students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        double averageGrade = getAverageGrade();
        char gradeLetter = getGradeLetter(averageGrade);
        boolean isPassing = isPassing(averageGrade);

        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Grade Letter: " + gradeLetter);
        System.out.println("Pass/Fail: " + (isPassing ? "Pass" : "Fail"));

        scanner.close();
    }
}

