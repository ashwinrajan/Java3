/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package customsorting;

import java.util.*;

public class TestPerson
{

    public static void main(String[ ] args)
    {
	LinkedList <Person>  myPeople = new  LinkedList <Person> ();
		myPeople.add(new Person("Neil", "Jensen", 28));
		myPeople.add(new Person("Pinky", "Schmeichel", 38));
		myPeople.add(new Person("David", "Huckerby", 26));
		myPeople.add(new Person("Ali", "Bernarbia", 34));
		myPeople.add(new Person("Paulo", "Wanchope", 26));
		myPeople.add(new Person("Shaun", "Goater", 32));
		myPeople.add(new Person("Shaun", "Goater", 31));
		myPeople.add(new Person("Shaun", "Goater", 32));
		myPeople.add(new Person("Sean", "Goater", 32));
		myPeople.add(new Person("Nicolas", "Anelka", 23));
		myPeople.add(new Person("Narayan", "Rohitesh", 22));
		myPeople.add(new Person( "Rohitesh", "Narayan", 20));
		myPeople.add(new Person( "Soumil", "Narayan", 15));
		myPeople.add(new Person("Soumya", "Narayan", 20));

		Collections.sort(myPeople);
		System.out.println("Number of elements = " + myPeople.size());

		System.out.println(myPeople);
                
    }
}// TestPerson
