package com.takeo.week2.day3;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello World!";
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        System.out.println("The reversed string is " + reversedStr);
    }
}