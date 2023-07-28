package com.takeo.week2.day4;

interface Drawable {
    void draw();
}

class Polygon implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Polygon");
    }
}

class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
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
