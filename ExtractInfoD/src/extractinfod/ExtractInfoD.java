/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package extractinfod;

/* Demonstrates the use of SQL queries from  a Java program.
 */

import java.sql.*;
import java.io.*;
import sun.jdbc.odbc.*;

public class ExtractInfoD
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

    String  query = "SELECT DISTINCT CustomerName "
            + "FROM Customer, Item, Orders, OrderItem "
            + "WHERE Customer.CustomerID = Orders.CustomerID "
            + "AND Orders.OrderNumber = OrderItem.OrderNumber "
            + "AND OrderItem.ItemNumber = Item.ItemNumber "
            + "AND Description = 'computer'";
     ResultSet  rs = stmt.executeQuery(query);
      System.out.println();
      System.out.println("   Customers ordering computers");
      while(rs.next())
      /*	we used field number 1, but could have used the field name: CustomerName
      		as the argument to getString.  we will learn later how to get the number
      		of fields and their names from the database if we do not know them

      */
         System.out.println(rs.getString(1));

      stmt.close();
  }
  catch (Exception e)
  {
	  e.printStackTrace();
  }
 }
}