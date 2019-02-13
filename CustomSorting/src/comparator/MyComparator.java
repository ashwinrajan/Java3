/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;

/**
 *
 * @author Ashwin Rajan
 */
import java.util.*;

class MyComparator implements Comparator {

    public int compare(Object a, Object b) {
        Person pa = (Person) a;
        Person pb = (Person) b;
        return pa.getAge() - pb.getAge();
    }
}
