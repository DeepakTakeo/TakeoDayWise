package com.takeo.week4.day2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInAction {

    public static void main(String[] args) {

        String key1 = "Hello";
        String key2 = "hello";
        String key3 = "HELLO";

        Map<String,Integer> map = new HashMap<>();
        map.put(key1,2);
        map.put(key2,3);
        map.put(key3,4);
        map.put(key1,7);  // happen  // it will override tha value of key 1  // null key


        Set<String> set = map.keySet();  //similar to list  key
        //iterate hashMap
        /*for(String key : set){
            System.out.println("key " + key + " value : " + map.get(key));
        }

        for(Integer value : map.values()){
            System.out.println("value  " + value);
        }*/

        // Iterator
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> obj = iterator.next();
            System.out.println("key " + obj.getKey() + " value : " + obj.getValue());
        }




        int n = 16;

        System.out.println("HashCode");

        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        System.out.println(System.identityHashCode(key3));

        System.out.println("Index Calculation");

        System.out.println(System.identityHashCode(key1) % (n-1));
        System.out.println(System.identityHashCode(key2) % (n-1));
        System.out.println(System.identityHashCode(key3) % (n-1));








    }
}
