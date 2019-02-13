/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package extractinfoe;

/* Demonstrates the use of SQL queries from  a Java program.
 */

import java.sql.*;
import java.io.*;
import sun.jdbc.odbc.*;

public class ExtractInfoE
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

      String query =  "SELECT OrderNumber FROM Orders "
             + "WHERE OrderDate BETWEEN {d '1999-04-01'} AND {d '1999-04-30'}";
      ResultSet rs = stmt.executeQuery(query);

      System.out.println("   Order numbers of orders from 4/1/99 to 4/30/99");
      while(rs.next())
         System.out.println(rs.getString("OrderNumber"));

      stmt.close();
  }
  catch (Exception e)
  {
	  e.printStackTrace();
  }
 }
}
