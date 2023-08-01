package com.takeo.week3.day1;

class StaticKeyword {
    static {
        System.out.println("This is a static block");
    }

    static int count = 0;

    public StaticKeyword() {
        count++;
    }
    static void printMessage() {
        System.out.println("This is a static method");
    }

    public static void main(String[] args) {
        StaticKeyword s1 = new StaticKeyword();  //0+1
        StaticKeyword s2 = new StaticKeyword();  //1+1

        System.out.println(count);

       StaticKeyword.printMessage();
    }
}