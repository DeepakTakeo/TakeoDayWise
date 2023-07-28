package com.takeo.week2.day4;

public class WrapperExample {
    public static void main(String[] args) {
        // Using wrapper classes to convert primitive data types to objects
        int intValue = 42;
        Integer integerObj = Integer.valueOf(intValue); // Boxing

        double doubleValue = 3.14;
        Double doubleObj = Double.valueOf(doubleValue); // Boxing

        char charValue = 'A';
        Character charObj = Character.valueOf(charValue); // Boxing

        boolean boolValue = true;
        Boolean boolObj = Boolean.valueOf(boolValue); // Boxing

        // Using wrapper classes to convert objects back to primitive data types
        int intValueFromObj = integerObj.intValue(); // Unboxing

        double doubleValueFromObj = doubleObj.doubleValue(); // Unboxing

        char charValueFromObj = charObj.charValue(); // Unboxing

        boolean boolValueFromObj = boolObj.booleanValue(); // Unboxing

        // Autoboxing (Automatic conversion from primitive to wrapper class)
        Integer autoBoxedInt = 100;

        // Autounboxing (Automatic conversion from wrapper class to primitive)
        int autoUnboxedInt = autoBoxedInt;

    }
}

