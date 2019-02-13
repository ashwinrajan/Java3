/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */

/* Connects to a Microsoft Access database
 * using the JDBC-ODBC bridge
 */
package Connect;

import java.sql.*;	//contains JDBC classes
import sun.jdbc.odbc.*;	//contains JdbcOdbcDriver driver class to connect to access

public class Connect {

    public static void main(String args[]) {
        try {
            /*
             * creates a driver & register itself with DriverManager which keeps
             * a record of all registered drivers. Driver hides the details of
             * specific database. By changing the driver, same program can work
             * for different database system.
             */
            new JdbcOdbcDriver();	//or use Class.forName(arg[0]) and pass Driver class
            //Class.forName(args[0]);
//	System.setProperty("jdbc.drivers", "sun.jdbc.odbc.JdbcOdbcDriver");
     /*
             * Suplier of the driver defines the URL needed. To change the
             * driver at runtime, we need to change url. To make program
             * flexible, pass driver and URL as program arguments
             */
            String url = "jdbc:odbc:sales";

            //we do not need user and password for access database.  Needed for database on Server
            String user = "";
            String password = "";

            /*
             * This static method looks through the vector of registered drivers
             * to find a driver that can connect to the database, and throws an
             * exception if one is not found.
             */
            Connection con = DriverManager.getConnection(url, user, password);
            // Connection con = DriverManager.getConnection(url);

            System.out.println("You made the connection to the Sales database \n");
        } catch (Exception e) //catches all exceptions.  Could also have used SQLException class to catch exceptions relating to SQL
        {
            e.printStackTrace();
        }
    }
}