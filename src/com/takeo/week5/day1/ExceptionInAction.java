package com.takeo.week5.day1;

public class ExceptionInAction {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};

        //System.out.println(a[6]);
        // output   // out of bound exception// run fine  //unexpected behaviour  // handle  try catch, throws , throw , finally

        try {
            System.out.println(a[7]);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        // continue execution
        System.out.println("Next Set of Actions");

    }
}
