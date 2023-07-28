package com.takeo.week2.day4;

/*
 Method overloading is a feature in Java (and other programming languages)
 that allows a class to have multiple methods with the same name but different parameters.
 It enables a single method name to represent different behaviors based on the number or
  types of parameters passed to the method.
*/
public class StaticPolymorphism {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        StaticPolymorphism calculator = new StaticPolymorphism();

        System.out.println(calculator.add(5, 10));           // Output: 15
        System.out.println(calculator.add(2, 3, 4));        // Output: 9
        System.out.println(calculator.add(3.14, 2.86));     // Output: 6.0
        System.out.println(calculator.add("Hello, ", "Java")); // Output: Hello, Java
    }
}
