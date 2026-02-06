/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.busreservationsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * *
 * @author ruksh
 */
public class DBConnection {

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // JDBC URL for SQL Server
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Bus_Reservation_System;encrypt=false";
            String user = "Admin"; // Your SQL Server username
            String password = "12345"; // Your SQL Server password

            // Attempt connection
            System.out.println("Attempting to connect to the database...");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Database Successfully!");

        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        // Test the connection
        Connection testConnection = getConnection();
        if (testConnection != null) {
            System.out.println("Connection successful!");
        } else {
            System.out.println("Connection failed.");
        }
    }
}

