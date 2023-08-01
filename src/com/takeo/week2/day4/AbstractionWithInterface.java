package com.takeo.week2.day4;


// default methods in interface from Java 8. we can provide implementation of those in interface
//backward compatibility
interface Drawable {

    //public ,statc, final
    int i = 10;
    void draw();

    //abstract
    void print();

}

interface Check {

    void printCheck();

}

class Polygon implements Drawable,Check {
    @Override
    public void draw() {
        System.out.println("Drawing a Polygon");
    }

    @Override
    public void print() {
     // logic
    }

    @Override
    public void printCheck() {
        //logic
    }
}

class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    public void print() {

    }
}

public class AbstractionWithInterface {
    public static void main(String[] args) {
        Drawable circle = new Polygon();
        Drawable square = new Square();

        circle.draw(); // Output: Drawing a circle
        square.draw(); // Output: Drawing a square
    }
}
