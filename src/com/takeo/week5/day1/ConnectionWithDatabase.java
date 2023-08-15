package com.takeo.week5.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionWithDatabase {

     //jdbc
    // jar / war file
    //  java archive  -- only java files  // Web archive   -- web related files incuding java  ,server - apache tomcat



    public static void main(String[] args) {

       // reference of url and user and password

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "postgres";

        // Integer s = new Integer();
        // Exceptions - handle exception scenarios in code
        Connection connection = null;  //resource
        try {
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Connected");
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


          // frameworks




    }


}
