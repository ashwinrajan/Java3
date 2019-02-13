/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ProductDemo;

/**
 *
 * @author Ashwin Rajan
 */
import java.util.*;

public class TestProduct
 {
	 public static void main(String[] args)
	 {
		 ArrayList myList = new ArrayList();

		 myList.add(new ProductDemo.Product("IBMThinkPad"));
		 myList.add(new ProductDemo.Product("Widget"));
		 myList.add(new ProductDemo.Product("Gadget"));
		 myList.add(new ProductDemo.Product("Device"));

		System.out.println("Printing from myList \n");

		 for(Iterator i = myList.iterator(); i.hasNext(); )
		 	System.out.println(i.next());

	 // Create a reverse order comparator
   Comparator r = Collections.reverseOrder();

    // Sort list by using the comparator
  //  Collections.sort(myList, r);

	//Sorting list in an increasing order
	Collections.sort(myList);

   // Get iterator
    Iterator i = myList.iterator();

    System.out.println("\n List sorted in reverse: \n");
    while(i.hasNext())
      System.out.println(i.next());

    System.out.println();

    Collections.shuffle(myList);

    // display randomized list
    i = myList.iterator();
    System.out.println("\n List shuffled: \n");
    while(i.hasNext())
      System.out.println(i.next() + " ");
    System.out.println();

    System.out.println("Minimum: " + Collections.min(myList));
    System.out.println("Maximum: " + Collections.max(myList));

		}//end of main
	}// end of TestProduct