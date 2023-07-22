
package com.takeo.day4;

import java.util.Scanner;

public class RevisionDay3 {
    public static void main(String[] a) {  // void missing  //s  //args //main
        // can write anything in place of a  //entry point  //JVM unable to locate

        int intValue = 2343; //mix int and char --remove char
        char charValue = 't';   //single quote to define char
        String test = "Hello";  //  double quote to define string

        String first = "John";

        String second = "John";

        String third = "John";

        String firstNew = new String("John");  //occupy separate space in heap area

        String secondNew = new String("John");


        String result = test.concat("Hello");  //double quote in string

        System.out.println("Please enter a limit");  // 5

        Scanner scanner = new Scanner(System.in);  // new ,for creating new object  // import package above class
        int limit = scanner.nextInt();  //  //nextInt() in case we are using int  //naming convention
        int i = 0;

        for (i = 0; i < limit; i++) {
            System.out.println("count " + i);
            //print counting up to limit  //out in place of in //
           // i=1+1;
        }

        String s = "13457457459";

        //inbuilt function

        //Application Insta --facebook  --post your pick ,write a post
        //  WhatsApp -- Messaging

        //immutable --- once created we cannot change
        String st = "Deepak";
        st = "NewName";

        if (s.contains("3")) {  //String, cannot compare with int
            System.out.println("inside if");
        }

        scanner.close();

        //System.gc();

    }

}

