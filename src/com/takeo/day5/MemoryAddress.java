package com.takeo.day5;

public class MemoryAddress {

    public static void main(String[] args) {
        // Create an object
        String obj1 = "Hello";
        String obj2 = "Hello";

        // Get the memory address using System.identityHashCode()
        int memoryAddress1 = System.identityHashCode(obj1);
        int memoryAddress2 = System.identityHashCode(obj2);

        // Convert the memory address to hexadecimal for better representation
        String hexMemoryAddress1 = Integer.toHexString(memoryAddress1);
        String hexMemoryAddress2 = Integer.toHexString(memoryAddress2);

        // Print the memory address
        System.out.println("Memory Address For obj1: 0x" + hexMemoryAddress1);
        System.out.println("Memory Address For obj1: 0x" + hexMemoryAddress2);


        String s1 = new String("Test");
        String s2 = new String("Test");


// Get the memory address using System.identityHashCode()
        int memoryAdd1 = System.identityHashCode(s1);
        int memoryAdd2 = System.identityHashCode(s2);

        // Convert the memory address to hexadecimal for better representation
        String hexMemoryAdd1 = Integer.toHexString(memoryAdd1);
        String hexMemoryAdd2 = Integer.toHexString(memoryAdd2);

        // Print the memory address
        System.out.println("Memory Address For s1: 0x" + hexMemoryAdd1);
        System.out.println("Memory Address For s2: 0x" + hexMemoryAdd2);

    }
}
