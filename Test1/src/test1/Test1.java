/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

import java.util.*;

/**
 *
 * @author Ashwin Rajan
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList <String> myList = new ArrayList <String>();
        
        myList.add("Rob");
        myList.add("Gary");
        myList.add("Maurice");
        myList.add("John");
        
        Collections.sort(myList);
        
        System.out.println(myList);
        
        
        
        ArrayList <Double> myList1 = new ArrayList <Double>();
        
        myList1.add(12.2);
        myList1.add(32.12);
        myList1.add(21.1);
        myList1.add(5.2);
        
        Collections.sort(myList1);
        
        System.out.println(myList1);
        
        ArrayList <Integer> myList2 = new ArrayList <Integer>();
        
        myList2.add(12);
        myList2.add(32);
        myList2.add(21);
        myList2.add(5);
        
        Collections.sort(myList2);
        
        System.out.println(myList2);
        
        ArrayList <Boolean> myList3 = new ArrayList <Boolean>();
        
        myList3.add(true);
        myList3.add(true);
        myList3.add(false);
        myList3.add(true);
        
        Collections.sort(myList3);
        
        System.out.println(myList3);
        
    }

}
