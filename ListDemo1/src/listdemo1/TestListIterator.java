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
	Using ListIterator

	public interface ListIterator extends Iterator
*/
import java.util.*;

class TestListIterator
{
    public static void main(String args[])
    {
        ArrayList myLinkedList = new ArrayList();

        myLinkedList.add("Item 0");
        myLinkedList.add("Item 1");
        myLinkedList.add("Item 2");
        myLinkedList.add("Item 3");
        myLinkedList.add("Item 4");
        myLinkedList.add("Item 5");
        myLinkedList.add("Item 6");

        ListIterator myListIterator = myLinkedList.listIterator();

        while(myListIterator.hasNext())
        {
			//Replaces the element at the specified position in this list with the specified element
          //  myListIterator.set("This is " + myListIterator.next());
          System.out.println(myListIterator.next());
        }

        while(myListIterator.hasPrevious())
        {
            System.out.println(myListIterator.previous());
        }
    }

}
/*
	You have two types of iterator (i.e., ListIterator and Iterator).
	Which one will you choose? and Why?

	What is Enumerator?
*/
