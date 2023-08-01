package com.takeo.week2.day4;

/*
In Java, abstract is a non-access modifier in java applicable for classes,
and methods but not variables.
 It is used to achieve abstraction which is one of the pillars of Object Oriented Programming(OOP).
 Following are different contexts where abstract can be used in Java.
*/
 abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract method to calculate area (no implementation) //subclasser responsibility
    //subclass must override them to provide a method definition
    public abstract double calculateArea();

    // Concrete method with implementation
    public void displayColor() {
        System.out.println("Color: " + color);
    }
}

abstract class Employee{

    public abstract double getEmployeeSalary();
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

   @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        circle.displayColor(); // Output: Color: Red
        System.out.println("Circle Area: " + circle.calculateArea()); // Output: Circle Area: 78.53981633974483

        rectangle.displayColor(); // Output: Color: Blue
        System.out.println("Rectangle Area: " + rectangle.calculateArea()); // Output: Rectangle Area: 24.0
    }
}

