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

/* Demonstrates the use of SQL queries from  a Java program.
 */

import java.sql.*;
import sun.jdbc.odbc.*;

public class TestMetaData
{
 public static void main (String args[])
 {
  try
  {
     // new JdbcOdbcDriver();
     System.setProperty("jdbc.drivers",  "sun.jdbc.odbc.JdbcOdbcDriver");

     String url = "jdbc:odbc:Sales";
      String user = "";
      String password = "";
      Connection con = DriverManager.getConnection(url, user, password);
      Statement stmt = con.createStatement();

      String query = "SELECT * FROM Customer ORDER BY CustomerName";

		ResultSet rs = stmt.executeQuery (query) ;

		ResultSetMetaData rsmd = rs.getMetaData();
      	int columnCount = rsmd.getColumnCount();

		while (rs.next())
		   {
				  for (int i = 1; i <= columnCount; i++)
				 {
					 if (i > 1)
					 	System.out.print(", ");

					 System.out.print(rs.getString(i));
				  }
			  System.out.println();
		   }
       rs.close();

      stmt.close();
  }
  catch (Exception e)
  {
	  e.printStackTrace();
  }
 }
}
