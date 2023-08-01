package com.takeo.week2.day5;

import java.util.HashMap;
import java.util.Map;

public class MapFunctionsExample {
    public static void main(String[] args) {
        // Create a Map to store some data
        Map<String, Integer> studentScores = new HashMap<>();

        // Add elements to the Map
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 95);
        studentScores.put("David", 88);

        // Get the size of the Map
        int size = studentScores.size();
        System.out.println("Size of the Map: " + size);

        // Check if the Map is empty
        boolean isEmpty = studentScores.isEmpty();
        System.out.println("Is the Map empty? " + isEmpty);

        // Access a value by key
        int aliceScore = studentScores.get("Alice");
        System.out.println("Alice's Score: " + aliceScore);

        // Check if a key exists in the Map
        boolean hasKey = studentScores.containsKey("Bob");
        System.out.println("Does the Map have a key 'Bob'? " + hasKey);

        // Check if a value exists in the Map
        boolean hasValue = studentScores.containsValue(88);
        System.out.println("Does the Map have a value 88? " + hasValue);

        // Update the value for a key
        studentScores.put("Bob", 92);
        System.out.println("Updated score for Bob: " + studentScores.get("Bob"));

        // Remove a key-value pair from the Map
        studentScores.remove("Charlie");
        System.out.println("After removing Charlie: " + studentScores);

        // Iterate through the Map
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name + "'s Score: " + score);
        }
    }
}

