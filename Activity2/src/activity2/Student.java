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
public class Student extends Person {

    private String major = new String();

    public Student(String name, int year, String major) {
        
        super(name, year);
        this.major = major;
        
    }
    
    public String toString(){
        
        return "Student "+super.toString()+", Major= "+major;
        
    }
}
