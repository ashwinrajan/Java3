/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databasemetadatademo;

import java.sql.*;

public class TestResultSetmetaData {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Load the JDBC driver
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        System.out.println("Driver loaded");

        Connection connection = DriverManager.getConnection("jdbc:odbc:Sales");
        System.out.println("Database connected");

        // Create a statement
        Statement statement = connection.createStatement();

        // Execute a statement
        ResultSet resultSet = statement.executeQuery("select * from customer");

        ResultSetMetaData rsMetaData = resultSet.getMetaData();

        for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
            System.out.printf("%-17s\t", rsMetaData.getColumnName(i));
        }

        System.out.println();

        // Iterate through the result and print the student names
        while (resultSet.next()) {
            for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
                System.out.printf("%-17s\t", resultSet.getObject(i));
            }

            System.out.println();
        }

        // Close the connection
        connection.close();
    }
}
