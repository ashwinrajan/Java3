/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cointable;

/**
 *
 * @author Ashwin Rajan
 */
public class TestClass {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here

        
        CoinTable.createCon();
        CoinTable.dropTable();
        CoinTable.createTable();
        CoinTable.insertRecord();
        CoinTable.resultSet();
        
        
    }
}
