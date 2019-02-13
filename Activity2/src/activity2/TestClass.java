/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;

/**
 *
 * @author Ashwin Rajan
 */
public class TestClass {

    public static void main(String[] args) {
        // TODO code application logic here

        Person person1 = new Person("John Halks", 1959);
        Student student1 = new Student("Ashwin Rajan", 1992, "Computer Engineering");
        Instructor instructor1 = new Instructor("Satyendra Narayan", 1969, 65000);
        
        System.out.println(person1);
        
        
        System.out.println(student1);
        
        
        System.out.println(instructor1);
        
    }

}
