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

public class Person  implements Comparable
{
	private String firstName;
	private String lastName;
	private int age;

    public Person(String firstName, String lastName, int years)
    {
		this.firstName = firstName;
		this.lastName = lastName;
		age = years;
    }

    public boolean equals(Object obj)
    {
		if (obj == null || getClass() != obj.getClass())
			return false;

		Person p = (Person) obj;
		return lastName.equals(p.lastName) && firstName.equals(p.firstName) && age == p.age;
    }

    public int compareTo(Object obj)
    {
		Person p = (Person)obj;
		return this.firstName.compareTo(p.firstName) ;//not a recursive call. calls compareto method of string class
                
                //return (this.age - p.age);
                
                //return new Integer(age).compareTo(new Integer(p.age));
    }

    public String toString()
    {
		return getClass().getName() + "[First Name=\t" + firstName + "\t" + "Last Name=" + lastName + "\t" + "age=" + age + "]" + "\n";
    }

    public int getAge()
    {
		return age;
	}
}// Person
