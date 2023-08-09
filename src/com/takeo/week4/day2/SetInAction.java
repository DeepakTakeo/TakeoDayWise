package com.takeo.week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInAction {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(4);
        list.add(1);

        System.out.println(list);  // no duplicates in set

        Set<Integer> set = new HashSet<>(list);

        System.out.println(set);

        // iteration is same as list  ,iterator ,for each

        for(Integer value : set){
            System.out.println(value);
        }

    }

}
