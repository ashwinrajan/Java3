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
public class Instructor extends Person {

    private int salary;

    public Instructor(String name, int year, int salary) {
        
        super(name, year);
        this.salary = salary;
        
    }
    
    public String toString(){
        
        return "Instructor's "+super.toString()+", Salary= "+salary;
        
    }
}
