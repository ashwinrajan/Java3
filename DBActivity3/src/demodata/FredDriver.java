/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demodata;

/*
 * This program demonstrates the connecting a Java program with an Access
 * database
 */
import java.sql.*;

public class FredDriver {

    private final String data = "jdbc:odbc:Sales";
    private ResultSet rec;

    FredDriver(String sSQL) {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection(data);

            Statement st = conn.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            rec = st.executeQuery(sSQL);
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load JDBC/ODBC Driver");
            System.out.println("Class Error: " + e);
        } catch (SQLException e) {
            System.out.println("Unable to connect");
            System.out.println("SQL Error: " + e);
        }
    }

    public ResultSet getResultSet() {
        return rec;
    }

    public static void main(String[] args) {
        FredDriver d = new FredDriver("SELECT * FROM Customer");
    }
}