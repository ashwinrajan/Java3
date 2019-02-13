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

/*
	Demonstrates the use of SQL queries from  a Java program.
	Program is divided into several methods.
	It also uses the concept of Metadata for ResultSet object
 */

import java.sql.*;

public class TestJDBCMethods
{
	static Connection connection;
	static Statement statement;

    //---------------------------------------------------------------------------------------------------
	public static void main (String[ ] args) throws Exception
    {
	 	String sourceURL = "jdbc:odbc:sales" ;
	 	String query  = "SELECT CustomerName, Address FROM Customer ORDER BY CustomerName";

	 	String queryWildcard = "SELECT * FROM Customer" ;   // Select all columns

		Class.forName ("sun.jdbc.odbc.JdbcOdbcDriver") ;
		connection = DriverManager.getConnection (sourceURL) ;
		statement   = connection.createStatement ( ) ;
		statement. executeQuery (query) ;
	 	showResultSet(statement);
	 	closeConnection ( ) ;
    }

   //-----------------------------------------------------------------------------------------------
	 //Closte the connection
	public static void closeConnection ( )
   {
	if (connection != null)
	try
	{
		connection.close ( ) ;
		connection = null ;
	}
	catch (SQLException ex)
	{
		System.out.println("\nSQLException----------------------------------------\n") ;
		System.out.println("SQLState: " + ex.getSQLState ( ) ) ;
		System.out.println("Message : " + ex.getMessage ( ) ) ;
	}
  }

  public  static void showResultSet(Statement stat) throws SQLException
  {
	  ResultSet result = stat.getResultSet();
	  ResultSetMetaData metadata = result.getMetaData();
	  int columnCount = metadata.getColumnCount();

	  for(int i =1; i <= columnCount ; i++)
	  {
		  if (i > 1) System.out.print ("\t");
		  System.out.print (metadata.getColumnLabel(i) );
	  }
	  System.out.println();

	  while (result.next() )
	  {
		  for(int i = 1; i <= columnCount; i++)
		  {
			   if (i > 1) System.out.print ("\t");
		      System.out.print (result.getString(i) );
		  }
	    System.out.println();
	 }
	 result.close();

}
}