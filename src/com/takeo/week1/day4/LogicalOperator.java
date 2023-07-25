package com.takeo.week1.day4;

import java.util.Scanner;

public class LogicalOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Enter student's SAT score: ");
        int satScore = scanner.nextInt();

        // Using logical operators to check scholarship eligibility
        boolean isGpaHigh = (gpa >= 3.5);
        boolean isSatScoreHigh = (satScore >= 1200);

        // Additional eligibility criteria
        boolean hasOutstandingAchievement = true; // Assuming the student has outstanding achievements
        boolean isFirstGenerationCollegeStudent = false; // Assuming the student is not a first-generation college student

        // Determine scholarship eligibility based on multiple criteria
        if ((isGpaHigh && isSatScoreHigh) || hasOutstandingAchievement || !isFirstGenerationCollegeStudent) {
            System.out.println("Congratulations! The student is eligible for a scholarship.");
        } else {
            System.out.println("The student is not eligible for a scholarship.");
        }

        scanner.close();
    }


}
