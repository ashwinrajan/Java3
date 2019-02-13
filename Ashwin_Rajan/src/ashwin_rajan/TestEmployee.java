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

/**
 *
 * @author Ashwin Rajan
 */
public class TestEmployee {

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        EmployeeTable.createCon();
        EmployeeTable.dropTable();
        EmployeeTable.createTable();
        EmployeeTable.insertRecord();
        EmployeeTable.noOfRecord();
        EmployeeTable.averageSalary();
        
    }
    
}
