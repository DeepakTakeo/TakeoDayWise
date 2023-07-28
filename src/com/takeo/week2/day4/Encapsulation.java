package com.takeo.week2.day4;

/*
By using encapsulation, we hide the implementation details of the Student class,
 and other classes can interact with a Student object only through the public methods,
  providing better control and security over the object's internal state.
  By encapsulating the fields and providing getter and setter methods,
   we ensure that the object's internal state is accessed and modified in a controlled manner.
    Other parts of the program cannot directly access the private fields, maintaining the principle of encapsulation.
*/
class Students {
    private String name;
    private int age;
    private String rollNumber;

    public Students(String name){
        this.name = name;
    }

    public Students(){
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age value!");
        }
    }


    // Getter methods to access the private fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    // Setter methods to modify the private fields
    public void setName(String name) {
        this.name = name;
    }



    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Students student = new Students("string");
        student.setName("John Doe");
        student.setAge(20);
        student.setRollNumber("12345");

        // Accessing the private fields using getter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Roll Number: " + student.getRollNumber());

        // Trying to access the private fields directly (will result in a compile-time error)
        // System.out.println("Name: " + student.name); // Error: The field 'name' is not visible
    }
}

