/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cointable;

import java.sql.*;
import sun.jdbc.odbc.JdbcOdbcDriver;

/**
 *
 * @author Ashwin Rajan
 */
public class CoinTable {

    /**
     * @param args the command line arguments
     */
    private static Statement stmt;
    private static Connection con;

    public static void createCon() throws Exception {
        new JdbcOdbcDriver();
        String url = "jdbc:odbc:Coin";
        String user = "";
        String password = "";
        con = DriverManager.getConnection(url, user, password);
        stmt = con.createStatement();

    }

    public static void createTable() throws Exception {

        stmt.executeUpdate("CREATE TABLE Coin (CoinName VARCHAR(25), CoinValue DOUBLE)");

    }

    public static void insertRecord() throws Exception {

        stmt.executeUpdate("INSERT INTO Coin VALUES ('Penny', 0.01)");
        stmt.executeUpdate("INSERT INTO Coin VALUES ('Nickel',0.05)");
        stmt.executeUpdate("INSERT into Coin VALUES ('Dime', 0.10)");
        stmt.executeUpdate("INSERT INTO Coin VALUES ('Quater',0.25)");
        stmt.executeUpdate("INSERT INTO Coin VALUES ('Half Dollar', 0.50)");
        stmt.executeUpdate("INSERT INTO Coin VALUES ('Dollar', 1.00)");


    }

    public static void resultSet() throws Exception {

        ResultSet rs = stmt.executeQuery("Select Avg(CoinValue) as Total from Coin");

        while (rs.next()) {
            
            System.out.println("Total Sum is " + rs.getString("Total"));
        }

        stmt.close();
        con.close();

    }
    
    public static void dropTable() throws Exception {

        stmt.executeUpdate("drop table Coin");



    }
}
