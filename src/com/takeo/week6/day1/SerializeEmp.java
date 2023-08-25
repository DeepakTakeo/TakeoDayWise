package com.takeo.week6.day1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializeEmp {

    public static void main(String[] args) throws IOException {

        File file  = new File("C:\\Users\\deepa\\OneDrive\\Desktop\\test.txt");
        List<Integer> listInteger = new ArrayList<>();

        FileOutputStream fop = new FileOutputStream(file);
        ObjectOutputStream oop = new ObjectOutputStream(fop);
        Employee emp = new Employee(1,"Deepak");
        oop.writeObject(emp);
        fop.close();
        oop.close();
        System.out.println("success ");


    }
}
