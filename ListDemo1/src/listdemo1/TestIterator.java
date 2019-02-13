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
	Using Iterator
*/
import java.util.*;

class TestIterator
{
    public static void main(String args[])
    {
        ArrayList arraylist = new ArrayList();

        arraylist.add("Item 0");
        arraylist.add("Item 1");
        arraylist.add("Item 2");
        arraylist.add("Item 3");
        arraylist.add("Item 4");
        arraylist.add("Item 5");
        arraylist.add("Item 6");

        Iterator iterator = arraylist.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
