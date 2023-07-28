package com.takeo.week2.day4;

/*
Method overriding is another important feature in Java (and other object-oriented programming languages)
 that allows a subclass to provide a specific implementation of a method that is already defined in its
 superclass. When a subclass overrides a method, it provides its own version of the method,
  which takes precedence over the method in the superclass when called on an instance of the subclass.
*/
class Vehicle {
    public void start() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        super.start();
        //System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    public void drift() {
        System.out.println("Car drifting");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }

    public void wheelie() {
        System.out.println("Motorcycle doing a wheelie");
    }
}

class Truck extends Vehicle {
    @Override
    public void start() {
        System.out.println("Truck started");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped");
    }

    public void loadCargo() {
        System.out.println("Truck loading cargo");
    }
}

public class DynamicPolymorphism {
    public static void main(String[] args) {

       /* The variable car is of type Vehicle,
        so it can only access methods and properties that are declared in the Vehicle class.
         Even though the object it refers to is a Car, it can only access methods that are present
          in the Vehicle class or overridden methods in the Car class.
       */
        Vehicle car = new Car();
        car.start();
        car.stop();
        //car.drift();




       /* Vehicle vehicle = new Vehicle();
        Vehicle motorcycle = new Motorcycle();
        Vehicle truck = new Truck();

        car.start();        // Output: Car started
        car.stop();         // Output: Car stopped
        // car.drift();      // This will result in a compile-time error as drift() is not a method in Vehicle class.

        motorcycle.start(); // Output: Motorcycle started
        motorcycle.stop();  // Output: Motorcycle stopped
        // motorcycle.wheelie(); // This will result in a compile-time error as wheelie() is not a method in Vehicle class.

        truck.start();      // Output: Truck started
        truck.stop();       // Output: Truck stopped
    */    // truck.loadCargo(); // This will result in a compile-time error as loadCargo() is not a method in Vehicle class.
    }
}
