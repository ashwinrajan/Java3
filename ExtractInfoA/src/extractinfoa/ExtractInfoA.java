/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package extractinfoa;

/* Demonstrates the use of SQL queries from  a Java program.
 */

import java.sql.*;
import sun.jdbc.odbc.*;

public class ExtractInfoA
{
 public static void main (String args[])
 {
  try
  {
      new JdbcOdbcDriver();
      //System.setProperty("jdbc.drivers",  "sun.jdbc.odbc.JdbcOdbcDriver");
	//	Class.forName(args[0]);

      String url = "jdbc:odbc:Sales";
      String user = "";
      String password = "";
      Connection con = DriverManager.getConnection(url, user, password);
      Statement stmt = con.createStatement();

      String query = "SELECT CustomerName, Address FROM Customer ORDER BY CustomerName";

      /*
      	The SQL SELECT statement returns the selected rows in a ResultSet.
      	We use the executeQuery method to execute SELECT statement
      */
      ResultSet rs = stmt.executeQuery(query);

      System.out.println("  Names and Addresses of Customers");

      //We embed tab charcter \t in the string to space the data horizontally
      System.out.println("Name\t\t\tAddress");

	 //We can retreive fields by name or by field number
      while (rs.next())	//next() returns true when another row is available
      {
         System.out.println(rs.getString("CustomerName") + '\t'  + rs.getString("Address"));
         //System.out.println(rs.getString(1) + '\t'  + rs.getString(2));
	  }

       stmt.close();
       con.close();
  }
  catch (Exception e)
  {
	  e.printStackTrace();
  }
 }
}