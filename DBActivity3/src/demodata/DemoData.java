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
 * This program demonstrates the use of a GUI with a ResultSet object Uses
 * FredDriver.java
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class DemoData extends JFrame implements ActionListener {

    FredDriver f = new FredDriver("SELECT CustomerName, Address, BalanceDue FROM Customer");
    ResultSet results = f.getResultSet();
    JButton bNext = new JButton("Next");
    JButton bPrevious = new JButton("Previous");
    JButton bFirst = new JButton("First");
    JButton bLast = new JButton("Last");
    JLabel lName = new JLabel("Name", JLabel.CENTER);
    JLabel lCity = new JLabel("City", JLabel.CENTER);
    JLabel lBalanceDue = new JLabel("Balance Due", JLabel.CENTER);
    JTextField tName = new JTextField(20);
    JTextField tCity = new JTextField(20);
    JTextField tBalanceDue = new JTextField(20);
    JPanel cPane = new JPanel();

    public DemoData() {
        super("A Database Frame");
        setBounds(500, 200, 250, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(cPane);
        cPane.setLayout(new GridLayout(5, 4));

        cPane.add(lName);
        cPane.add(tName);
        cPane.add(lCity);
        cPane.add(tCity);
        cPane.add(lBalanceDue);
        cPane.add(tBalanceDue);
        cPane.add(bFirst);
        cPane.add(bPrevious);
        cPane.add(bNext);
        cPane.add(bLast);

        bNext.setMnemonic('N');
        bPrevious.setMnemonic('P');
        bFirst.setMnemonic('F');
        bLast.setMnemonic('L');
        bNext.addActionListener(this);
        bPrevious.addActionListener(this);
        bFirst.addActionListener(this);
        bLast.addActionListener(this);


        try {
            results.next();
            tName.setText(results.getString("CustomerName"));
            tCity.setText(results.getString("Address"));
            tBalanceDue.setText(results.getString("BalanceDue"));
        } catch (SQLException e) {
            System.out.println("SQL Error on resultset: " + e);
        }

        setVisible(true);

    }

    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();

        if (source == bNext) {
            moveNext();
        } else if (source == bPrevious) {
            movePrevious();
        } else if (source == bFirst) {
            showFirst();
        } else if (source == bLast) {
            showLast();
        }
    }

    public void moveNext() {
        try {

            if (results.isLast()) {
                results.previous();
            }

            if (results.next()) {
                tName.setText(results.getString("CustomerName"));
                tCity.setText(results.getString("Address"));
                tBalanceDue.setText(results.getString("BalanceDue"));

            }


        } catch (SQLException e) {
            System.out.println("SQL Error on move next: " + e);
        }
    }

    public void movePrevious() {
        try {
            if (results.previous()) {
                tName.setText(results.getString("CustomerName"));
                tCity.setText(results.getString("Address"));
                tBalanceDue.setText(results.getString("BalanceDue"));



            }
        } catch (SQLException e) {
            System.out.println("SQL Error on move previous: " + e);
        }
    }

    public void showFirst() {

        try {

            while (results.previous()) {


                if (results.isFirst()) {
                    tName.setText(results.getString("CustomerName"));
                    tCity.setText(results.getString("Address"));
                    tBalanceDue.setText(results.getString("BalanceDue"));

                }

            }
        } catch (SQLException e) {
            System.out.println("SQL Error on move next: " + e);
        }


    }

    public void showLast() {

        try {

            while (results.next()) {



                if (results.isLast()) {
                    tName.setText(results.getString("CustomerName"));
                    tCity.setText(results.getString("Address"));
                    tBalanceDue.setText(results.getString("BalanceDue"));
                    

                }

              
            }
            results.previous();
            
        } catch (SQLException e) {
            System.out.println("SQL Error on move next: " + e);
        }

    }

    public static void main(String[] args) {
        DemoData d = new DemoData();
    }
}
