/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package extractinfob;

/* Demonstrates the use of SQL queries from  a Java program.
 */

import java.sql.*;
import sun.jdbc.odbc.*;

public class ExtractInfoB
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

     String query =   "SELECT * FROM OrderItem WHERE ItemNumber = '222222'";
      ResultSet rs = stmt.executeQuery(query);
      System.out.println();
      System.out.println("   Order items for radios");
      System.out.println("OrderNumber\tQuantity\tUnitPrice");
     while (rs.next())
      /*	we omitted field 2 ItemNumber from the display because we selected
      		all results to have ItemNumer = 222222.
      		we use the getInt method because field 3, quantity, has SQL type INTEGER.
      		UnitPrice field has type Currency in the database.
      */
         System.out.println(rs.getString(1) + "\t\t" + rs.getInt(3)
                                + "\t\t$" + rs.getBigDecimal(4,2));


      stmt.close();
      con.close();
  }
  catch (Exception e)
  {
	  e.printStackTrace();
  }
 }
}

