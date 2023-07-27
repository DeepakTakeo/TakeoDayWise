package com.takeo.week2.day3;


//parent class
class Employee {

    private static int i = 10;
    int j = 11;

    public int k = 20;
    protected int l = 30;

    public static int getValueOfI(){
        return i;
    }

    //use i outside class  //provide getter and setter
    public int getI(){
        return i;
    }
    public void setI(int value){
        this.i=value; //super keyword
    }
}

//child class
public class TestAccessModifier extends Employee {

     int k = l + 4;

     int z = j+10;

    public static void main(String[] args) {

        String s = new String("test");  //heap
        String s1 = "test";  //String pool-->within heap  // role of stack memory

        Employee emp = new Employee();
        int m = Employee.getValueOfI();

        int v = emp.getI()+1;

        final int g = 10;


    }

}
