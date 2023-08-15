package com.takeo.week5.day1;

import java.util.Scanner;

class AdminPasswordSet {
    static {
        System.out.println("This is a static block");
    }

    static String adminUserName = "admin";
    static String adminPassword = "admin";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username ");
        String userName = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();

        if(userName.equals(userName) && password.equals(adminPassword)){
            System.out.println("Login SuccessFul");
        }


        String passwordNew = "Value@1234";

        // hash value
        // Base64
        // MD5 --- implement

        // encrypt/decrypt  this





    }
}