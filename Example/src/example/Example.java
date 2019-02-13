/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package example;

import java.util.*;

/**
 *
 * @author Ashwin Rajan
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashSet hs = new HashSet();
        
        hs.add("bob");
        hs.add("house");
        hs.add("maria");
        System.out.println(hs);
        
        System.out.println(hs.contains("maria"));
        
        
        
        ArrayList arraylist = new ArrayList();
        
        arraylist.add(5);
        arraylist.add(10);
        arraylist.add(1);
        arraylist.add(3);
        
        System.out.println(arraylist);
        
        for(int i = 0; i< arraylist.size(); i++){
            
            System.out.println(arraylist.get(i));
        }
        
        
        Iterator itr = arraylist.iterator();
        
        while(itr.hasNext()){
            
            System.out.println(itr.next());
        }
        
        ListIterator itr2 = arraylist.listIterator(arraylist.size());
        
        while(itr2.hasPrevious()){
        
            
            System.out.println(itr2.previous());
            
        }
        
        Collections.sort(arraylist);
        System.out.println(arraylist);
        
        
        System.out.println(Collections.binarySearch(arraylist,5));
        
    }

}
