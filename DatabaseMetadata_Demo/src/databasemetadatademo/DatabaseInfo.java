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

/* Illustrate DatabaseMetaData, ResultSetMetaData
 * and SQL aggregate functions.
 */

import java.sql.*;
import java.io.*;
import java.text.*;

class DatabaseInfo
{
 public static void main (String args[])
 {
  	try
  	{
      ResultSet rs;
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      String url = "jdbc:odbc:Sales";
      Connection con = DriverManager.getConnection(url);

 	  DatabaseMetaData dbMetaData = con.getMetaData();

      System.out.println("Supports entry level SQL: " +
                         dbMetaData.supportsANSI92EntryLevelSQL());
      System.out.println("Supports intermediate SQL: " +
                         dbMetaData.supportsANSI92IntermediateSQL());
      System.out.println("Supports full SQL: " +
                         dbMetaData.supportsANSI92FullSQL());
      System.out.println("Supports stored procedures: " +
                         dbMetaData.supportsStoredProcedures());
      System.out.println("Quote string: " +
                        dbMetaData.getIdentifierQuoteString());
	   System.out.println("\n\n");

      System.out.println("Types used in the database:");
      System.out.print('\t');

/*
	According to JDK documentation, getTypeInfo() returns 18 columns of information
	for each type provided by the database system. We only list one, TYPE_NAME,
	leaving as an exercise the use of the colNamesTypes to list the names and types
	of all columns of this result set to see if they correspond to the 18 listed in the documentation
*/
      rs = dbMetaData.getTypeInfo();
      while (rs.next())
      		System.out.print(rs.getString("TYPE_NAME") + " ");
      //  System.out.print(rs.getString("DATA_TYPE") + " ");
    	//System.out.print(rs.getString("PRECISION") + " ");
		//	System.out.print(rs.getString("AUTO_INCREMENT") +" ");
       System.out.println("\n\n");

/*
	According to the JDK documentation, the getTables method returns ten
	columns of information for each table in the database.  We list only TABLE_NAME
	It is column 3 so we could have used getString(3) to retrieve it, but using
	column name is much more useful.
*/
      String[ ] tables ={"TABLE"};
   		rs = dbMetaData.getTables( null, null, "%" ,tables);
   //		rs = dbMetaData.getTables( null, null, "%rderItem" ,tables);
     // rs = dbMetaData.getTables(null,null,"%",null);

      System.out.println("Tables in the Sales database:");
      System.out.print('\t');

      while(rs.next())
      // 	System.out.print(rs.getString("TABLE_NAME") + " ");
     	System.out.print(rs.getString("TABLE_TYPE") + " ");
       //   System.out.print(rs.getString("REMARKS") + " ");

      System.out.println("\n\n");

/*
	According JDK doumentation, the getColumns method returns 18 fields
	to describe each column. We list COLUMN_NAME and COLUMN_TYPE.
*/
      rs = dbMetaData.getColumns(null,null,"Customer", null);
      System.out.println("Columns in the Customer table");

      while(rs.next())
        System.out.println("  "+rs.getString("COLUMN_NAME")+"\t "+ rs.getString("TYPE_NAME"));
      //  System.out.println('\t'+rs.getString("COLUMN_NAME")+"\t"+ rs.getString("TYPE_NAME") + "\t" + rs.getString("DATA_TYPE"));

 System.out.println("\n\n");

/*
	Using the columnNamesTypes method to list the names and types of coumns
	in the result set returned by the getColumn method we see that the result
	set actually contains 19 columns, some of which are named differently than columns
	listed in the JDK documentation.
*/
      displayStrings("Fields describing each column", colNamesTypes(rs));

 	System.out.println("\n\n");

      String query;
      query = "SELECT * FROM Item";
      Statement stmt = con.createStatement();
      rs = stmt.executeQuery(query);
/*
	This shows that we can use the colNamesTypes method to display the names
	and types of the columns from the Item table.
*/
      displayStrings("Item Columns",colNamesTypes(rs));

 	System.out.println("\n\n");

      query = "SELECT SUM(BalanceDue),AVG(BalanceDue),MAX(BalanceDue) "
        + "FROM Customer";
      rs = stmt.executeQuery(query);
/*
	The result set gives the values of the SUM, AVG, and MAX functions. THese
	are not columns of the customer tables, but rather they are values computed
	from the balanceDue column. We use the colNamesTypes method to list the
	names and types of the columns in the result set.  Because these columns
	have no names Java creates the names Expr1000, Expr1001, and Expr1003 for them.
	They have internal database types of CURRENCY which does not correspond
	to a SQL type. Java getBigDecimal method will return the value of each function.
*/
      displayStrings("Function columns",colNamesTypes(rs));

    System.out.println("\n\n");

    System.out.println("Sum, average, and maximum balance due");

    while(rs.next())
         System.out.println("$" + rs.getBigDecimal(1,2) + " $"
            + rs.getBigDecimal(2,2) + " $" + rs.getBigDecimal(3,2));

 	System.out.println("\n\n");

      query = "SELECT COUNT(*), MIN(Quantity) FROM OrderItem "
            + "WHERE ItemNumber = '222222'";
      rs = stmt.executeQuery(query);

    while(rs.next())
      {
         System.out.println
            ("Number of radio order items: " + rs.getInt(1));
         System.out.println
           ("Minimum quantity of radios ordered in any order item: "
                             + rs.getInt(2));
      }
      stmt.close();
  }

  catch (Exception e)
  {e.printStackTrace();}
 }

 public static String[ ] colNamesTypes(ResultSet rs) throws SQLException
 {
      ResultSetMetaData rsMetaData = rs.getMetaData();
      int cols = rsMetaData.getColumnCount();

//	String array to hold the name and type of each column in the result set argument to this method
      String[ ] s = new String[cols];

      String label, tab;
      for (int i=1; i<=cols; i++)
      {
        label = rsMetaData.getColumnLabel(i);
      //To keep type column aligned we use two tabs characters as a separator for true case other wise one tab
      if (label.length() < 8)
      		tab = "\t\t\t";
      else
      		tab = "\t";

     //column numbers start with 1, while array indices start at 0
      s[i-1] = '\t' + label + tab + rsMetaData.getColumnTypeName(i);
      }
      return s;
 }

 //Displays a description and a list of the elements of its string array argument.
 public static void displayStrings(String description, String[]s)
 {
      System.out.println(description);
      for(int i=0; i<s.length; i++)
         System.out.println(s[i]);
 }
}