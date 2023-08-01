package com.takeo.week3.day1;

public class Week1 {

    public static void main(String[] args) {

        float floatValue = 5.767567567576f;  //7

        double doubleValue = 5.87578567567567567;  //15

        String s  = "Deepak";  // location of variable ---> String pool  //s stored in stack
        String s1 = new String(""); // heap   s1 in stack

        int i = 5;  //stack

        int[] d = {3,6,9,7};

        int[] array = new int[7];

        Parent parent = new Parent();
        Parent parent1 = null;
        int j = 7;
        Integer i1 = Integer.valueOf(j);




    }



}

//JVM --> search for main method
//---->  Week1.main(String[] aer)


class Parent{

    private String name;
    private int age;


    //getter / setter

    // why constructor ?
    public Parent()
    {

    }  // no return type  // class name

    public Parent(String s,int a){
        this.name=s;
        this.age=a;
    }

    void printAge(int a){
        System.out.println(" Parent age");
    }

    double printAge(int a,int b){
        System.out.println("Overloaded Parent age");
        return 0;
    }
    // method & constructor  // parameter
    // constructor -- init
    // method -- behaviour /logic
}

class Child extends  Parent {

    @Override
    void printAge(int a) {
        super.printAge(a);
    }
}
