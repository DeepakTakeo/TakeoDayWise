package com.takeo.week3.day5;

public class Employee {

    private String name;
    private int age;
    private String address;


    public Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public  Employee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
