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
	This example creates an array list filled with numbers, and inserts
	new elements into the specified location in the list. The example
	also creates a linked list from the array list, inserts and removes
	the elements from the list. Finally, the example traverses the list
	forward and backward.
*/
import java.util.*;
public class TestListBackForward
{
	public static void main(String[] args)
	{
		ArrayList arrayList = new ArrayList();
		arrayList.add(new Integer(1));
		arrayList.add(new Integer(2));
		arrayList.add(new Integer(3));
		arrayList.add(new Integer(1));
		arrayList.add(new Integer(4));
		arrayList.add(0, new Integer(10));
		arrayList.add(3, new Integer(30));
		System.out.println("A list of integers in the array list:");
		System.out.println(arrayList);

		LinkedList linkedList = new LinkedList(arrayList);
		linkedList.add(1, "red");
		linkedList.removeLast();
		linkedList.addFirst("green");

		System.out.println("Display the linked list forawrd:");
		ListIterator listIterator = linkedList.listIterator();

		while (listIterator.hasNext())
		{
		System.out.print(listIterator.next() + " ");
		}

		System.out.println();
		System.out.println("Display the linked list backward:");

		listIterator = linkedList.listIterator(linkedList.size());
		while (listIterator.hasPrevious())
		{
		System.out.print(listIterator.previous() + " ");
		}
	}
}