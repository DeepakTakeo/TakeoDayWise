package com.takeo.week2.day3;

public class AnimalLegCounter {
    public static void main(String[] args) {
        int chickens = 5;
        int cows = 2;
        int pigs = 8;

        int totalLegs = countTotalLegs(chickens, cows, pigs);
        System.out.println("Total number of legs: " + totalLegs);
    }

    public static int countTotalLegs(int chickens, int cows, int pigs) {
        int chickenLegs = 2;
        int cowLegs = 4;
        int pigLegs = 4;

        int totalLegs = (chickens * chickenLegs) + (cows * cowLegs) + (pigs * pigLegs);

        return totalLegs;
    }
}

