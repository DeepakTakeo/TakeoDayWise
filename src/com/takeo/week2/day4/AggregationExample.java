package com.takeo.week2.day4;

// Class representing an Address
class Address {
    String city;
    String state;
    String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public void displayAddress() {
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
    }
}

// Class representing a Student
class Student {
    int rollNumber;
    String name;
    Address address; // Aggregation: Student has an Address

    public Student(int rollNumber, String name, Address address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
    }

    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Address:");
        address.displayAddress();
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        // Creating an Address object
        Address address = new Address("New York", "NY", "USA");

        // Creating a Student object with the Address object as an attribute
        Student student = new Student(101, "John Doe", address);

        // Displaying the Student information, including the Address
        student.displayStudentInfo();
    }
}
