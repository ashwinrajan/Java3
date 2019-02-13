/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.assignment;

import java.sql.*;
import sun.jdbc.odbc.JdbcOdbcDriver;

/**
 *
 * @author Ashwin Rajan
 */
public class BookDB {

    /**
     * Declaring Variables.
     */
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rec;
    private static Book book;

    /**
     * Creating a method that creates connecting to the database book.
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if the method was unable to create connection
     */
    public static void connect() throws ClassNotFoundException, SQLException {
        
        new JdbcOdbcDriver();
        String url = "jdbc:odbc:Books";
        String user = "";
        String password = "";
        con = DriverManager.getConnection(url, user, password);


    }

    /**
     * Creating a method that opens a statement object with scrollable and
     * updateable resultset.
     * @throws SQLException if the method found SQLException
     */
    public static void open() throws SQLException {

        stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
                ResultSet.CONCUR_UPDATABLE);

        String query = "SELECT BookCode, BookTitle, BookPrice "
                + "FROM Books ORDER BY BookCode ASC";

        rec = stmt.executeQuery(query);

    }

    /**
     * Creating a method that closes statement object and connection object.
     * @throws SQLException if the method found SQLException
     */
    public static void close() throws SQLException {

        
        stmt.close();
        con.close();
        

    }

    /**
     * Creating a method that is used to go to the next record of the database
     * from the current record and return the book object.
     * @throws SQLException if the method found SQLException
     * @return the book object
     */
    public static Book moveNext() throws SQLException {



        if (rec.isLast()) {
            rec.previous();
        }

        if (rec.next()) {

            book = new Book(rec.getString("BookCode"), rec.getString("BookTitle"),
                    rec.getDouble("BookPrice"));

        }

        return book;


    }

    /**
     * Creating a method that is used to go to the previous record of the database
     * from the current record and return the book object.
     * @throws SQLException if the method found SQLException
     * @return the book object
     */
    public static Book movePrevious() throws SQLException {

        if (rec.previous()) {

            book = new Book(rec.getString("BookCode"), rec.getString("BookTitle"),
                    rec.getDouble("BookPrice"));

        }

        return book;
    }

    /**
     * Creating a method that is used to go to the first record of the database
     * and return the book object.
     * @throws SQLException if the method found SQLException
     * @return the book object
     */
    public static Book moveFirst() throws SQLException {

        rec.first();

        book = new Book(rec.getString("BookCode"), rec.getString("BookTitle"),
                rec.getDouble("BookPrice"));


        return book;

    }

    /**
     * Creating a method that is used to go to the last record of the database
     * and return the book object.
     * @throws SQLException if the method found SQLException
     * @return the book object
     */
    public static Book moveLast() throws SQLException {

        rec.last();
        book = new Book(rec.getString("BookCode"), rec.getString("BookTitle"),
                rec.getDouble("BookPrice"));



        return book;

    }

    /**
     * Creating a method that is used to add a record to the database.
     * @throws SQLException if the method found SQLException
     */
    public static void addRecord(Book book) throws SQLException {

        String query = "INSERT INTO Books (BookCode, BookTitle, BookPrice) "
                + "VALUES ('" + book.getCode() + "', "
                + "'" + book.getTitle() + "', "
                + "'" + book.getPrice() + "')";
        stmt = con.createStatement();
        stmt.executeUpdate(query);


        rec.close();
        stmt.close();
        open();

    }

    /**
     * Creating a method that is used to update the current record of the database.
     * @throws SQLException if the method found SQLException
     */
    public static void updateRecord(Book book) throws SQLException {

        String query = "UPDATE Books SET "
                + "BookCode = '" + book.getCode() + "', "
                + "BookTitle = '" + book.getTitle() + "', "
                + "BookPrice = '" + book.getPrice() + "' "
                + "WHERE BookCode = '" + book.getCode() + "'";
        stmt = con.createStatement();
        stmt.executeUpdate(query);

        stmt.close();

    }

    /**
     * Creating a method that is used to delete the current record of the database.
     * @throws SQLException if the method found SQLException
     */
    public static void deleteRecord(String bookCode) throws SQLException {

        String query = "DELETE FROM Books "
                + "WHERE BookCode = '" + bookCode + "'";
        stmt = con.createStatement();
        stmt.executeUpdate(query);

        rec.close();
        stmt.close();
        open();

    }
}
