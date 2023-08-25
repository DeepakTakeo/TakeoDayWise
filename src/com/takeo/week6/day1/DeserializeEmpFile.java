package com.takeo.week6.day1;

import java.io.*;

public class DeserializeEmpFile {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file  = new File("C:\\Users\\deepa\\OneDrive\\Desktop\\test.txt");
        FileInputStream fip = new FileInputStream(file);
        ObjectInputStream oip = new ObjectInputStream(fip);

        Employee empObj = (Employee) oip.readObject();
        oip.close();
        fip.close();

        System.out.println(empObj.getName());
        System.out.println(empObj.getId());

    }
}
