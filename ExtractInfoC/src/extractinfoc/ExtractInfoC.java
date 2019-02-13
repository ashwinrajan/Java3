/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package extractinfoc;

/* Demonstrates the use of SQL queries from  a Java program.
 */

import java.sql.*;
import java.io.*;
import sun.jdbc.odbc.*;

public class ExtractInfoC
{
 public static void main (String args[])
 {
  try
  {
      new JdbcOdbcDriver();
      String url = "jdbc:odbc:Sales";
      String user = "";
      String password = "";
      Connection con = DriverManager.getConnection(url, user, password);
      Statement stmt = con.createStatement();


     String  query =  "SELECT CustomerName FROM Customer, Orders "
             + "WHERE Customer.CustomerID = Orders.CustomerID "
             + "AND  OrderDate = {d '1999-03-22'}";
     ResultSet rs = stmt.executeQuery(query);
      System.out.println();
      System.out.println("   Customer placing orders on Mar 22, 1999");
      while(rs.next())
         System.out.println(rs.getString("CustomerName"));

      stmt.close();
  }
  catch (Exception e)
  {
	  e.printStackTrace();
  }
 }
}
