/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package preparedstatement;

/**
 *
 * @author Ashwin Rajan
 */
import java.sql.*;

public class TestJDBC {

    Connection connection;
    Statement statement;
    String sourceURL = "jdbc:odbc:sales";
    String query = "SELECT CustomerName, Address FROM Customer ORDER BY CustomerName";
    String queryWildcard = "SELECT * FROM Customer";   // Select all columns

    //---------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        TestJDBC SQLExample = new TestJDBC(); // Create application object

        SQLExample.getResultsByColumnName();
        SQLExample.getResultsByColumnPosition();
        System.out.println();

        SQLExample.getAllColumns();
        SQLExample.closeConnection();
    }

    //--------------------------------------------------------------------------------------------------------
    public TestJDBC() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            connection = DriverManager.getConnection(sourceURL);
            statement = connection.createStatement();
        } catch (SQLException sqle) {
            System.err.println("Error creating connection");
        } catch (ClassNotFoundException cnfe) {
            System.err.println(cnfe.toString());
        }
    }

    //-------------------------------------------------------------------------------------------------------------------
    public void getResultsByColumnPosition() {
        try {
            ResultSet rs = statement.executeQuery(query);

            int row = 0;
            while (rs.next()) {
                System.out.print("\nRow " + (++row) + ") ");

                for (int i = 1; i < 3; i++) {
                    System.out.print((i > 1 ? ", " : " ") + rs.getString(i));
                }
            }


            rs.close();             // Close the result set
        } catch (SQLException ex) {
            System.err.println("\nSQLExceptoin----------------------------\n");
            System.err.println("SQLState: " + ex.getSQLState());
            System.err.println("Message : " + ex.getMessage());
        }
    }

    //----------------------------------------------------------------------------------------------------------
    void getResultsByColumnName() {
        try {
            ResultSet rs = statement.executeQuery(queryWildcard);
            int row = 0;

            while (rs.next()) {
                System.out.println("Row " + (++row) + ") "
                        + rs.getString("CustomerID") + " "
                        + rs.getString("CustomerName") + " , "
                        + rs.getString("Address") + rs.getString("BalanceDue"));
            }

            rs.close();
        } catch (SQLException sqle) {
            System.err.println("\nSQLException-----------------------------\n");
            System.err.println("SQLState: " + sqle.getSQLState());
            System.err.println("Message : " + sqle.getMessage());
        }

    }

    //---------------------------------------------------------------------------------------------------
    void getAllColumns() {
        try {
            ResultSet rs = statement.executeQuery(queryWildcard);

            ResultSetMetaData metadata = rs.getMetaData();

            int columns = metadata.getColumnCount();                // Column Count
            int row = 0;

            while (rs.next()) {
                System.out.print("\nRow " + (++row) + ") ");
                for (int i = 1; i <= columns; i++) {
                    System.out.print((i > 1 ? ", " : " ") + rs.getString(i));
                }
            }

            rs.close();               // Close the result set
        } catch (SQLException ex) {
            System.err.println("\nSQLException------------------------------\n");
            System.err.println("SQLState: " + ex.getSQLState());
            System.err.println("Message : " + ex.getMessage());
        }
    }

    //-----------------------------------------------------------------------------------------------
    //Closte the connection
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException ex) {
                System.out.println("\nSQLException----------------------------------------\n");
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("Message : " + ex.getMessage());
            }
        }
    }
}
