package com.takeo.week4.day1;

import java.util.HashMap;
import java.util.Map;

public class MapInAction {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();  // capacity 16 buckets

        //Map<key,value>  //immutable   //equals and hashcode method you have to override in Custom class

        map.put("Test1",1);   // take key  -> calculation of hashcode and then it will calculate the index of bucket
        map.put("Test2", 4);

        //after hashcode cal  -> point it to same index

        Object o = new Object();

        //not insert duplicate key // only 1 null key is allowed





    }


}
