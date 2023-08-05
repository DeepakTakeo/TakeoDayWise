package com.takeo.week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListExample {
    public static void main(String[] args) {

        int[] arr = new int[7];
        arr[0] = 2;

        // Creating an ArrayList of Strings
        List<String> names = new ArrayList<>();  //infinte  capcity  //wrapper classes

        // Adding elements to the list
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        //access
        names.get(0);

         //iteration
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // Removing elements by value
        names.remove("Bob"); // Removes the value 2

        // Removing elements by index
        names.remove(0); // Removes the element at index 0

        // Check if an element exists
        boolean containsDog = names.contains("Alice"); // true

        // Initializing the list with elements using List.of()
        List<Integer> numbers = List.of(2,8,4,7,0,4);
    }
}