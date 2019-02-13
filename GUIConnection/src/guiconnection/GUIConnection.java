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
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class GUIConnection extends JFrame
{
	private Connection con;
	private MakeConnectionPanel cPanel = new MakeConnectionPanel();

///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public GUIConnection()
	{
		setTitle("Java Database Connectivity");
		setSize(200,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.add(cPanel, "North");
		show();

	}//constructor

///////////////////////////////////////////////////////////////////////////////////////////////////////////
public static void main(String args[ ])
{
	new GUIConnection();
}

}//class