/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package preparedstatement;

import java.sql.*;
import sun.jdbc.odbc.*;

class TestPreparedStatement {

    public static void main(String args[]) throws Exception {

        ResultSet rs;

        //   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        new JdbcOdbcDriver();
        //	System.setProperty("jdbc.drivers",  "sun.jdbc.odbc.JdbcOdbcDriver");

        String url = "jdbc:odbc:Sales";
        Connection con = DriverManager.getConnection(url);

        String query;
        //Question mark indicates where we can substitute one of the descriptions: radio, television or computer
        query = "SELECT Quantity FROM Item WHERE Description = ?";

        PreparedStatement pStmt = con.prepareStatement(query);

        pStmt.setString(1, "radio");
        rs = pStmt.executeQuery();

        System.out.println("Using a prepared statement to find quantity of radios");
        while (rs.next()) {
            System.out.println(rs.getInt("Quantity"));
        }
        rs.close();	//need to close the ResultSet after every query

        pStmt.setString(1, "computer");
        rs = pStmt.executeQuery();
        System.out.println("Using a prepared statement to find quantity of computers");
        while (rs.next()) {
            System.out.println(rs.getInt("Quantity"));
        }
        rs.close();	////need to close the ResultSet after every query


        query = "SELECT OrderNumber FROM Orders "
                + "WHERE OrderDate BETWEEN ? AND ?";
        pStmt = con.prepareStatement(query);
        pStmt.setDate(1, Date.valueOf("1999-04-01")); //Date class in java.sql extends java.util.Date
        pStmt.setDate(2, Date.valueOf("1999-04-30"));
        rs = pStmt.executeQuery();

        System.out.println("Using a prepared statement to find orders in April");
        while (rs.next()) {
            System.out.println(rs.getInt("OrderNumber"));
        }
    }
}
