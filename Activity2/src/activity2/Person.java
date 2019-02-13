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
public class Person {

    private String name = new String();
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
     
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        
    }
    
    public String toString() {
        

        return "name=" + name+", Birth Year="+ yearOfBirth;
      
        
    }
}
