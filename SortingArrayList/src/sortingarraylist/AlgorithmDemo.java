/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingarraylist;

/**
 *
 * @author Ashwin Rajan
 */
// Demonstrate various algorithms.
import java.util.*;

class AlgorithmDemo {

    public static void main(String args[]) {

        // Create and initialize linked list
        ArrayList myList = new ArrayList();
        myList.add(new Integer(-8));
        myList.add(new Integer(20));
        myList.add(new Integer(-20));
        myList.add(new Integer(8));

        // Create a reverse order comparator
        Comparator r = Collections.reverseOrder();

        // Sort list by using the comparator
        Collections.sort(myList, r);

        // Get iterator
        Iterator i = myList.iterator();

        System.out.print("List sorted in reverse: ");
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }

        System.out.println();

        Collections.shuffle(myList);

        // display randomized list
        i = myList.iterator();
        System.out.print("List shuffled: ");
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();

        System.out.println("Minimum: " + Collections.min(myList));
        System.out.println("Maximum: " + Collections.max(myList));
    }
}
