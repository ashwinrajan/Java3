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

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class TableInfo extends JFrame implements ActionListener
{
	private JButton cmdConnect = new JButton("Connect");
	private JButton cmdTables  = new JButton("Table Info");
	private JButton cmdColumns  = new JButton("Column Info");

	private JPanel p1 = new JPanel();

	private JLabel status = new JLabel("Not connected to a data source");

	private Connection con;

	String reservoir= "";
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////

	public TableInfo()
	{
		setTitle("Sales");
		setSize(500,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();

		p1.add(cmdConnect);
		p1.add(cmdTables);
		p1.add(cmdColumns);

		c.add(p1, "North");
		c.add(status, "South");

		cmdConnect.addActionListener(this);
		cmdTables.addActionListener(this);
		cmdColumns.addActionListener(this);

		show();

	}//constructor

///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();


		if(source==cmdConnect) 				{  connect(); 		}

		if(source==cmdTables) 				{  getTableInfo();  }

		if(source==cmdColumns)				{  getColumnInfo();	}


	}//action

///////////////////////////////////////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void getTableInfo()
	{
		String[ ] info ={"TABLE"};
		/*  we can also use the following arguments in this array for getting more information:

			"TABLE", "VIEW", "SYSTEM TABLE", "GLOBAL TEMPORARY", "LOCAL TEMPORARY", "ALIAS", "SYNONYM".    */

		try
		{

			DatabaseMetaData metaDataObject = con.getMetaData();

			ResultSet results = metaDataObject.getTables( null, null, null ,info);


			while(results.next())
			{
       			reservoir = reservoir + (results.getString("TABLE_NAME") + "\n");

       			/* The getString argument could also take one of the following arguments:

       			TABLE_TYPE,  REMARKS ,  TABLE_CAT , TABLE_SCHEM

       			*/
			}

			JOptionPane.showMessageDialog(this, reservoir);
			reservoir = "";

		}//try

		catch(SQLException ex) { status.setText(ex.getMessage()); }


	}//getTableInfo
///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void getColumnInfo()
	{
		String table = JOptionPane.showInputDialog(this, "Enter a table name");

		try
		{
			DatabaseMetaData metaDataObject = con.getMetaData();

			ResultSet results = metaDataObject.getColumns(null,null,table,null);

			while(results.next())
			{
        		reservoir = reservoir + ("  " + results.getString("COLUMN_NAME") + "     "
        									  + results.getString("TYPE_NAME") + "\n");

			}//while

			JOptionPane.showMessageDialog(this, reservoir);
			reservoir = "";
		}//try

		catch(SQLException ex) { status.setText(ex.getMessage()); }


	}//getColumnInfo




	public void connect()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			String source = "jdbc:odbc:Sales";
			con = DriverManager.getConnection(source);

			status.setForeground(Color.red);
			status.setText("Connected to " + source);

		}

		catch (ClassNotFoundException e) {  System.out.println("Driver not found");  }

		catch (SQLException e)			 {  System.out.println(e);                   }

	}//connect

///////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String args[]) {  new TableInfo();   }

}//class
