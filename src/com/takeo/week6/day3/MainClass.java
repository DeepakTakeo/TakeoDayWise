package com.takeo.week6.day3;

public class MainClass {

    public static void main(String[] args) {

        CalculateSum calculateSum = (a,b) -> a+b;
        int result = calculateSum.sum(10,20);
        System.out.println(result);

    }
}
