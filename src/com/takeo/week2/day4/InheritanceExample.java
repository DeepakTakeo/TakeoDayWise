package com.takeo.week2.day4;

// Superclass (Parent class)
class Animal {
    private String name;
    private int age;

    //getter and setter


    public Animal(){
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }


}

// Subclass (Child class) inheriting from Animal class
class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // Call the constructor of the superclass (Animal)
        this.breed = breed;
    }

    // Overriding the makeSound method from the superclass
    @Override
    public void makeSound() {
        System.out.println("Dog barks!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an instance of the Dog subclass
        Dog dog = new Dog("Buddy", 3, "Labrador");


        // Calling methods from both the superclass (Animal) and subclass (Dog)
        dog.displayInfo(); // Method from the superclass
        dog.makeSound();   // Method overridden in the subclass
    }
}