package com.takeo.week5.day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(1,2,3,4,5,6);
        List<Integer> list2 = List.of(7,8,9,10,4,5);

        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i : list1){
            map.put(i,i);
        }

        for(Integer j : list2){
            if(map.containsKey(j)){
                System.out.println(j);
            }
        }

        List<Integer> common = new ArrayList<>(list1);
        common.retainAll(list2);

    }
}
