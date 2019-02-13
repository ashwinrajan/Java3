/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package listdemo1;

// This program demonstrates ArrayList usage in Java 5.0 (not 1.4)

import java.util.ArrayList;

public class ListDemo1
{

	public static void main(String[ ] args)
	{

		ArrayList myList = new ArrayList();
		myList.add(1);
		myList.add("hello");
		myList.add(new Object());
		int i = (Integer) myList.get(0);

		String s = (String) myList.get(1);
		Object o = myList.get(2);
		System.out.println(i + " " + s + " " + o);

		for (int j=0; j<myList.size(); ++j)
		    System.out.print(myList.get(j) + " ");
		System.out.println("\n");



//		System.exit(0);  // exit program NOW



		// does "hello" occur? if so, where?
		String searchStr = "hello";
		if ( myList.contains(searchStr) )
			System.out.println("Search string=" + searchStr +
			  " found at index: " + myList.indexOf(searchStr));
		else
			System.out.println("Search string=" + searchStr +
			  " not found.");

		int i1 = 3, i2 = 10;
		int x;
		String aString;
		String myString = "Test String";
		ArrayList myIntList = new ArrayList();
		ArrayList myStrings = new ArrayList();

		//Add ints to the ArrayList (works in Java 5.0 not 1.4)
		myIntList.add(i1);
		myIntList.add(i2);
		myIntList.add(3); // can add a constant

		//Add the strings
		myStrings.add(myString);
		myStrings.add("Hello");

		// Must cast to a string!
		aString = (String) myStrings.get(0);

		//Conversion of Integer to int
		x = (Integer) myIntList.get(1); // (works in Java 5.0 not 1.4)

		System.out.println(aString);
		System.out.println("x = " + x);

		// Change the 1st element from 10 to 22.
		myIntList.set(1, 22); // (works in Java 5.0 not 1.4)

		x = (Integer) myIntList.get(1);

		//Print new value of x
		System.out.println("x = " + x);

		// Size of the integer ArrayList
		System.out.println("Size of int ArrayList: " + myIntList.size());
		System.out.println("Is the list empty? " + myIntList.isEmpty());
		System.out.println("First integer element: " + myIntList.get(0));

		//Remove first element of the list
		myIntList.remove(0);
		System.out.println("First integer element: " + myIntList.get(0));
		System.out.println("Is the list empty? " + myIntList.isEmpty());
		System.out.println("Size of int ArrayList: " + myIntList.size());

		// Clear the int ArrayList
		myIntList.clear();
		System.out.println("Size of int ArrayList: " + myIntList.size());
		System.out.println("Is the list empty? " + myIntList.isEmpty());

	}

}
