/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbactivity1;

import java.sql.*;
import sun.jdbc.odbc.JdbcOdbcDriver;

/**
 *
 * @author Ashwin Rajan
 */
public class DBActivity1 {

    private static Statement stmt;
    private static Connection con;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here


        createCon();

        dropTable();
        createTable();

        insertRecord();


    }

    public static void createCon() throws Exception {
        String url = "jdbc:odbc:Sales";
        String user = "";
        String password = "";
        con = DriverManager.getConnection(url, user, password);
        stmt = con.createStatement();

    }

    public static void dropTable() throws Exception {

        stmt.executeUpdate("drop table Customer");
        stmt.executeUpdate("drop table Salesperson");
        stmt.executeUpdate("drop table Item");
        stmt.executeUpdate("drop table Orders");
        stmt.executeUpdate("drop table OrderItem");


    }

    public static void createTable() throws Exception {

        stmt = con.createStatement();

        stmt.executeUpdate("CREATE TABLE Customer (CustomerID VARCHAR(4), CustomerName"
                + " VARCHAR(25), Address VARCHAR(25), BalanceDue CURRENCY)");

        stmt.executeUpdate("CREATE TABLE Salesperson (SalespersonID VARCHAR(2),"
                + "SalespersonName VARCHAR(25), Address VARCHAR(25))");

        stmt.executeUpdate("CREATE TABLE Item (ItemNumber VARCHAR(6),"
                + "Description VARCHAR(20), Quantity INTEGER)");

        stmt.executeUpdate("CREATE TABLE Orders (OrderNumber VARCHAR(4),"
                + " CustomerID VARCHAR(4), SalespersonID VARCHAR(2), OrderDate DATE)");

        stmt.executeUpdate("CREATE TABLE OrderItem (OrderNumber CHAR(4),"
                + " ItemNumber CHAR(6), Quantity INTEGER, UnitPrice CURRENCY)");



    }

    public static void insertRecord() throws Exception {

        stmt.executeUpdate("INSERT INTO Customer VALUES (1234, 'Satyendra Narayan', '22 First St.', 1667.00)");
        stmt.executeUpdate("INSERT INTO Customer VALUES (5678, 'John Greenhouse', '33 Second St.', 130.95)");
        stmt.executeUpdate("INSERT into Customer VALUES (4321, 'Maurice Dusseault', '44 Third St.', 0)");
        stmt.executeUpdate("INSERT INTO Customer VALUES (8765, 'Helen Mckay', '55 Fourth St.', 0)");


        stmt.executeUpdate("INSERT INTO Salesperson VALUES (12,'Manoj Kumar','66 Fifth St.')");
        stmt.executeUpdate("INSERT INTO Salesperson VALUES (98,'Karina Kapoor','77 Sixth St.')");


        stmt.executeUpdate("INSERT INTO Item VALUES (222222, 'radio', 32)");
        stmt.executeUpdate("INSERT INTO Item VALUES (333333, 'television', 14)");
        stmt.executeUpdate("INSERT INTO Item VALUES (444444, 'computer', 9)");


        stmt.executeUpdate("INSERT INTO Orders VALUES (1, 1234, 12, 'Apr 03, 1999')");
        stmt.executeUpdate("INSERT INTO Orders VALUES (2, 5678, 12, 'Mar 22, 1999')");
        stmt.executeUpdate("INSERT INTO Orders VALUES (3, 8765, 98, 'Feb 19, 1999')");
        stmt.executeUpdate("INSERT INTO Orders VALUES (4, 1234, 12, 'Apr 05, 1999')");
        stmt.executeUpdate("INSERT INTO Orders VALUES (5, 8765, 98, 'Feb 28, 1999')");


        stmt.executeUpdate("INSERT INTO OrderItem VALUES (1, 222222, 4, 027.00)");
        stmt.executeUpdate("INSERT INTO OrderItem VALUES (1, 333333, 2, 210.50)");
        stmt.executeUpdate("INSERT INTO OrderItem VALUES (1, 444444, 1, 569.00)");
        stmt.executeUpdate("INSERT INTO OrderItem VALUES (2, 333333, 2, 230.95)");
        stmt.executeUpdate("INSERT INTO OrderItem VALUES (3, 222222, 3, 027.00)");
        stmt.executeUpdate("INSERT INTO OrderItem VALUES (3, 333333, 1, 230.95)");
        stmt.executeUpdate("INSERT INTO OrderItem VALUES (4, 444444, 1, 569.00)");
        stmt.executeUpdate("INSERT INTO OrderItem VALUES (5, 222222, 2, 027.00)");
        stmt.executeUpdate("INSERT INTO OrderItem VALUES (5, 444444, 1, 725.00)");


    }
}
