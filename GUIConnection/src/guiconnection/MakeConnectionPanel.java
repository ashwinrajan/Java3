/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package guiconnection;

/* This class is a utility class that provides a button for the main GUI
   that makes a connection to a database using the standard jdbc:odbc bridge driver

   In order to use this class, you simply instantiate it and add the resulting JPanel
   component to your GUI

   eg:   MakeConnectionPanel cPanel = new MakeConnectionPanel();
   		    getContentPane.add(cPanel);
*/

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MakeConnectionPanel extends JPanel implements ActionListener
{

	protected Connection con;
	private JButton b1 = new JButton("Connect");

///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public MakeConnectionPanel()
	{
		add(b1);
		b1.setBackground(Color.red);

		b1.addActionListener(this);

	}//constructor

///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void actionPerformed(ActionEvent e)
	{
		connect();

	}//action

///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void connect()
	{
		String source = JOptionPane.showInputDialog(this, "Enter your DSN");
		source = "jdbc:odbc:" + source;

		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection(source);

			b1.setBackground(Color.green);
			b1.setText("Connected");

			JOptionPane.showMessageDialog(this, "Connected to " + source);

		}

		catch (ClassNotFoundException ex) {  JOptionPane.showMessageDialog(this, ex.getMessage());  }

		catch (SQLException ex)			 {   JOptionPane.showMessageDialog(this, ex.getMessage());  }

	}//connect

///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public Connection getConnection()		//Returns a reference to our Connection object
	{
	  return con;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public String getConnectionInfo()		//Returns a String of the data source we are connected to
	{
		String s = "";

		try {    s = con.getMetaData().getURL();   }

		catch(Exception e) { System.out.println("Problem with connection");}

		return s;
	}

}//class