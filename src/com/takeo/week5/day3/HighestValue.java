package com.takeo.week5.day3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HighestValue {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("A",10);
        map.put("B",30);
        map.put("C",50);
        map.put("D",100);
        map.put("E",90);
        map.put("F",80);

        String keyWithMaxValue = null;
        int max = 0;

        for(Map.Entry<String,Integer> entry : map.entrySet()){
              //entry.getValue();
              //entry.getKey();
            if(entry.getValue() > max){  // 10 >0 // 30 > 10 // 50 > 30 // 100 > 50 // 90 > 100
                max = entry.getValue();
                keyWithMaxValue = entry.getKey();
            }
        }

        System.out.println("Key with max value : "+ keyWithMaxValue);

        // key highest value  100 , approach to find highest :
        // you can find max value in array {10,30,50,100,90,80}


    }

}
