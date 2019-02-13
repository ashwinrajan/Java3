/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package extractinfo;

/* Demonstrates the use of SQL queries from  a Java program.
 */

import java.sql.*;
import java.io.*;
import sun.jdbc.odbc.*;

public class ExtractInfo
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

      query =   "SELECT * FROM OrderItem WHERE ItemNumber = '222222'";
      rs = stmt.executeQuery(query);
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

      query =  "SELECT CustomerName FROM Customer, Orders "
             + "WHERE Customer.CustomerID = Orders.CustomerID "
             + "AND  OrderDate = {d '1999-03-22'}";
      rs = stmt.executeQuery(query);
      System.out.println();
      System.out.println("   Customer placing orders on Mar 22, 1999");
      while(rs.next())
         System.out.println(rs.getString("CustomerName"));

      query = "SELECT DISTINCT CustomerName "
            + "FROM Customer, Item, Orders, OrderItem "
            + "WHERE Customer.CustomerID = Orders.CustomerID "
            + "AND Orders.OrderNumber = OrderItem.OrderNumber "
            + "AND OrderItem.ItemNumber = Item.ItemNumber "
            + "AND Description = 'computer'";
      rs = stmt.executeQuery(query);
      System.out.println();
      System.out.println("   Customers ordering computers");
      while(rs.next())
      /*	we used field number 1, but could have used the field name: CustomerName
      		as the argument to getString.  we will learn later how to get the number
      		of fields and their names from the database if we do not know them

      */
         System.out.println(rs.getString(1));

      query =  "SELECT OrderNumber FROM Orders "
             + "WHERE OrderDate BETWEEN {d '1999-04-01'} AND {d '1999-04-30'}";
      rs = stmt.executeQuery(query);
      System.out.println();
      System.out.println("   Order numbers of orders from 4/1/99 to 4/30/99");
      while(rs.next())
         System.out.println(rs.getString("OrderNumber"));

      /*	we add a new row to illustrate the UPDATE and DELETE statements
      		which change the database. We update the new row, and then delete
      		it, leaving the database unchanged

      		Becuase UPDATE and DELETE statements do not return values, we use
      		the executeUpdate method to execute them.
      */
      String sql;
      sql = "INSERT INTO Item VALUES ('555555', 'CD player', 10)";
      stmt.executeUpdate(sql);

      sql = "UPDATE Item SET Quantity = 12 "
          + "WHERE Description = 'CD player'";
      stmt.executeUpdate(sql);
      System.out.println();
      System.out.println("   Added and updated a new item");
      System.out.println("Description");

      query = "SELECT Description FROM Item";
      rs = stmt.executeQuery(query);
      while(rs.next())
        System.out.println(rs.getString(1));

      sql = "DELETE FROM Item WHERE Description = 'CD player'";
      stmt.executeUpdate(sql);

   query = "SELECT Description FROM Item";
      rs = stmt.executeQuery(query);
      System.out.println();
      System.out.println("   Deleted the new item");
      System.out.println("Description");
      while(rs.next())
        System.out.println(rs.getString(1));
      stmt.close();
  }
  catch (Exception e)
  {
	  e.printStackTrace();
  }
 }
}

