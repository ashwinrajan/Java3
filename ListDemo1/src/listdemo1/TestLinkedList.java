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

/*
	Using The LinkedList Class
	java.lang.Object
	  |
	  +--java.util.AbstractCollection
	        |
	        +--java.util.AbstractList
	              |
	              +--java.util.AbstractSequentialList
	                    |
	                    +--java.util.LinkedList

public class LinkedList
		extends AbstractSequentialList
				implements List, Cloneable, Serializabl
*/
import java.util.*;

class TestLinkedList
{
    public static void main(String args[])
    {
		//Constructs an empty list.
        LinkedList myLinkedList= new LinkedList();

		//Appends the specified element to the end of this list
        myLinkedList.add("Item 2");
        myLinkedList.add("Item 3");
        myLinkedList.add("Item 4");
        myLinkedList.add("Item 5");

		//Inserts the given element at the beginning of this list
        myLinkedList.addFirst("Item 0");

        //Appends the given element to the end of this list
        myLinkedList.addLast("Item 6");

		//Inserts the specified element at the specified position in this list
        myLinkedList.add(1, "Item 1");

        System.out.println(myLinkedList);

        myLinkedList.remove("Item 6");

        System.out.println(myLinkedList);

        myLinkedList.removeLast();

        System.out.println(myLinkedList);

		//Replaces the element at the specified position in the list with the specified element
        myLinkedList.set(3, "New Item");

        System.out.println(myLinkedList);

		//Returns true if the list contains the specified element
        if (myLinkedList.contains("Item 1"))
			System.out.println("This is in the list");
		else
			System.out.println("This is not in the list");
    }
}
