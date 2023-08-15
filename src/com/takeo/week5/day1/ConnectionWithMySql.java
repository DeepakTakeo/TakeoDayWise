package com.takeo.week5.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionWithMySql {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/information_schema";
        String user = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySql database!");
            connection.close();
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            System.err.println("Connection error: " + e.getMessage());
        }
    }
}
