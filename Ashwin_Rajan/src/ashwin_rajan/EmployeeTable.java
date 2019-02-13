/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ashwin_rajan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import sun.jdbc.odbc.JdbcOdbcDriver;

/**
 *
 * @author Ashwin Rajan
 */
public class EmployeeTable {
    
    private static Statement stmt;
    private static Connection con;

    public static void createCon() throws Exception {
        new JdbcOdbcDriver();
        String url = "jdbc:odbc:Employees";
        String user = "";
        String password = "";
        con = DriverManager.getConnection(url, user, password);
        stmt = con.createStatement();

    }

    public static void createTable() throws Exception {

        stmt.executeUpdate("CREATE TABLE Employee (EmpID VARCHAR(5),EmpName VARCHAR(25),EmpAddress VARCHAR(40), AnnualSalary DOUBLE)");

    }

    public static void insertRecord() throws Exception {

        stmt.executeUpdate("INSERT INTO Employee VALUES ('11111', 'Satyendra Narayan','123 Waterloo, waterloo,ON N2L5C7',30000)");
        stmt.executeUpdate("INSERT INTO Employee VALUES ('22222', 'Maurice Dusseault','456 Waterloo, waterloo,ON N2L5C7',150000)");
        stmt.executeUpdate("INSERT INTO Employee VALUES ('33333', 'John Greenhouse','111 Waterloo, waterloo,ON N2L5C7',210000)");
        stmt.executeUpdate("INSERT INTO Employee VALUES ('44444', 'Garry Closson','333 Jane Street, Appleby,ON N1L2L1',130000)");
        stmt.executeUpdate("INSERT INTO Employee VALUES ('55555', 'Neil Robb','345 Financial Dr., Brampton,ON L2M2N1',120000)");


    }

    public static void averageSalary() throws Exception {

        ResultSet rs = stmt.executeQuery("Select Avg(AnnualSalary) as Average from Employee");

        while (rs.next()) {

            System.out.println("The Average Salary is " + rs.getString("Average"));
        }

        stmt.close();
        con.close();

    }
    
    public static void noOfRecord() throws Exception {
        
        ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
        
        int count=0;
        
        while(rs.next()){
            
            count++;
        }
        
        System.out.println("No of records in employee table = "+count);
    }
    
    
    public static void dropTable() throws Exception {

        stmt.executeUpdate("drop table Employee");



    }
}

