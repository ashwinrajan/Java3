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

 public class TestDatabaseMetaData
 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
      // Load the JDBC driver
      Class.forName ("sun.jdbc.odbc.JdbcOdbcDriver") ;
      System.out.println("Driver loaded");

     // Establish a connection
     Connection connection = DriverManager.getConnection ("jdbc:odbc:Sales");
     System.out.println("Database connected");

     DatabaseMetaData dbMetaData = connection.getMetaData();
     System.out.println("database URL: " + dbMetaData.getURL());
     System.out.println("database username: " +   dbMetaData.getUserName());
     System.out.println("database product name: " +    dbMetaData.getDatabaseProductName());
     System.out.println("database product version: " +       dbMetaData.getDatabaseProductVersion());
     System.out.println("JDBC driver name: " +        dbMetaData.getDriverName());
     System.out.println("JDBC driver version: " +        dbMetaData.getDriverVersion());
     System.out.println("JDBC driver major version: " +        dbMetaData.getDriverMajorVersion());
     System.out.println("JDBC driver minor version: " +        dbMetaData.getDriverMinorVersion());
     System.out.println("Max number of connections: " +        dbMetaData.getMaxConnections());
     System.out.println("MaxTableNameLength: " +        dbMetaData.getMaxTableNameLength());
     System.out.println("MaxColumnsInTable: " +        dbMetaData.getMaxColumnsInTable());

     // Close the connection
     connection.close();
   }
 }

