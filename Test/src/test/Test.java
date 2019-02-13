/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.*;

/**
 *
 * @author Ashwin Rajan
 */
public class Test {

    public static void main(String args[]) throws Exception {

        // This will load the MySQL driver, each DB has its own driver
        Class.forName("com.mysql.jdbc.Driver");

        // Setup the connection with the DB
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Sales?"
                + "user=root&password=root");

        // Statements allow to issue SQL queries to the database
        Statement stmt = con.createStatement();

        stmt.executeUpdate("DROP TABLE if exists Customer");
        stmt.executeUpdate("DROP TABLE if exists Salesperson");
        stmt.executeUpdate("DROP TABLE  if exists Item");
        stmt.executeUpdate("DROP TABLE   if exists Orders");
        stmt.executeUpdate("DROP TABLE  if exists OrderItem");

        stmt.executeUpdate("CREATE TABLE Customer (CustomerID VARCHAR(4), CustomerName"
                + " VARCHAR(25), Address VARCHAR(25), BalanceDue Decimal)");

        stmt.executeUpdate("INSERT INTO Customer VALUES (1234, 'Satyendra Narayan', '22 First St.', 1667.00)");
        stmt.executeUpdate("INSERT INTO Customer VALUES (5678, 'John Greenhouse', '33 Second St.', 130.95)");
        stmt.executeUpdate("INSERT into Customer VALUES (4321, 'Maurice Dusseault', '44 Third St.', 0)");
        stmt.executeUpdate("INSERT INTO Customer VALUES (8765, 'Helen Mckay', '55 Fourth St.', 0)");


        stmt.executeUpdate("CREATE TABLE Salesperson (SalespersonID VARCHAR(2),"
                + "SalespersonName VARCHAR(25), Address VARCHAR(25))");
        stmt.executeUpdate("INSERT INTO Salesperson VALUES (12,'Manoj Kumar','66 Fifth St.')");
        stmt.executeUpdate("INSERT INTO Salesperson VALUES (98,'Karina Kapoor','77 Sixth St.')");


        stmt.executeUpdate("CREATE TABLE Item (ItemNumber VARCHAR(6),"
                + "Description VARCHAR(20), Quantity INTEGER)");
        stmt.executeUpdate("INSERT INTO Item VALUES (222222, 'radio', 32)");
        stmt.executeUpdate("INSERT INTO Item VALUES (333333, 'television', 14)");
        stmt.executeUpdate("INSERT INTO Item VALUES (444444, 'computer', 9)");


        stmt.executeUpdate("CREATE TABLE Orders (OrderNumber VARCHAR(4),"
                + " CustomerID VARCHAR(4), SalespersonID VARCHAR(2), OrderDate DATE)");
        stmt.executeUpdate("INSERT INTO Orders VALUES (1, 1234, 12, '1999-11-25')");
        stmt.executeUpdate("INSERT INTO Orders VALUES (2, 5678, 12, '1999-02-23')");
        stmt.executeUpdate("INSERT INTO Orders VALUES (3, 8765, 98, '1999-02-03')");
        stmt.executeUpdate("INSERT INTO Orders VALUES (4, 1234, 12, '1999-04-01')");
        stmt.executeUpdate("INSERT INTO Orders VALUES (5, 8765, 98, '1999-02-28')");


        stmt.executeUpdate("CREATE TABLE OrderItem (OrderNumber CHAR(4),"
                + " ItemNumber CHAR(6), Quantity INTEGER, UnitPrice Decimal)");
        stmt.executeUpdate("INSERT INTO OrderItem VALUES (1, 222222, 4, 027.00)");
        stmt.executeUpdate("INSERT INTO OrderItem VALUES (1, 333333, 2, 210.50)");
        stmt.executeUpdate("INSERT INTO OrderItem VALUES (1, 444444, 1, 569.00)");
        stmt.executeUpdate("INSERT INTO OrderItem VALUES (2, 333333, 2, 230.95)");
        stmt.executeUpdate("INSERT INTO OrderItem VALUES (3, 222222, 3, 027.00)");
        stmt.executeUpdate("INSERT INTO OrderItem VALUES (3, 333333, 1, 230.95)");
        stmt.executeUpdate("INSERT INTO OrderItem VALUES (4, 444444, 1, 569.00)");
        stmt.executeUpdate("INSERT INTO OrderItem VALUES (5, 222222, 2, 027.00)");
        stmt.executeUpdate("INSERT INTO OrderItem VALUES (5, 444444, 1, 725.00)");

        stmt.close(); //option
        con.close();	//required to insert last element
    }
}
