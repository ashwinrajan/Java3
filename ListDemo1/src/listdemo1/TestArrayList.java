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
	Using ArrayList as container

	java.lang.Object
	  |
	  +--java.util.AbstractCollection
	        |
	        +--java.util.AbstractList
	              |
              +--java.util.ArrayList

public class ArrayList
			  extends AbstractList
			  implements List, RandomAccess, Cloneable, Serializable

Please note the difference between the capacity and size of the list.
*/
import java.util.*;

class TestArrayList
{
    public static void main(String args[])
    {
        //Constructs an empty list with an initial capacity of ten
        ArrayList myArrayList = new ArrayList();
		//Returns the number of elements in the list (i.e. loaded number of element)
        System.out.println("Deafult size of myArrayList is " + myArrayList.size());

        //Appends the specified element to the end of the list
        myArrayList.add("Item 0");
        myArrayList.add("Item 2");
        myArrayList.add("Item 3");
        myArrayList.add("Item 4");
        myArrayList.add("Item 5");
        myArrayList.add("Item 6");

        //Inserts the specified element at the specified position in the list
        myArrayList.set(1, "Item 1");

        System.out.println(myArrayList.toString());

        myArrayList.remove("Item 5");

        System.out.println(myArrayList);

		System.out.println("\n\n");

		/*
		 Constructs a list containing the elements of the specified
		 collection, in the order they are returned by the collection's
		 iterator.
        */
        ArrayList yourArrayList = new ArrayList(myArrayList);
		System.out.println("Size of the yourArrayList is " + yourArrayList.size());
        System.out.println(yourArrayList);

		//Trims the capacity of the ArrayList instance to be the list's current size
        yourArrayList.trimToSize();

        //Obtaining an array from an ArrayList and printing
        System.out.println("Converting in array and printing its elements");
        Object myArray [ ] = yourArrayList.toArray();
        for(int i = 0; i < myArray.length; i++)
        	System.out.println((String)myArray[i]);
    }
}

/*
	You can increase the capacity of an ArrayList manually by calling method
		void ensureCapacity(int cap)
	You might want to do it if you the capacity in adavance.

	This will improve the performance because automatic reallocations
	of capacity are costly in terms time.
*/