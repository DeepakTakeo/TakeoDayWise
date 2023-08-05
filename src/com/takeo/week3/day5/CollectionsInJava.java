package com.takeo.week3.day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.PriorityQueue;

public class CollectionsInJava {
    public static void main(String[] args) {
        // ArrayList example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList); // Output: ArrayList: [Apple, Banana, Orange]

        // HashSet example
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(20); // Duplicates are not allowed in a HashSet
        System.out.println("HashSet: " + hashSet); // Output: HashSet: [10, 20, 30]

        // HashMap example
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Bob", 28);
        System.out.println("HashMap: " + hashMap); // Output: HashMap: {Bob=28, John=25, Jane=30}

        // PriorityQueue example
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(20);
        System.out.print("PriorityQueue: ");
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " "); // Output: PriorityQueue: 10 20 30
        }
    }
}

