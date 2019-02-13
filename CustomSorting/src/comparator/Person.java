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

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int years) {
        this.firstName = firstName;
        this.lastName = lastName;
        age = years;
    }

    public Person() {
        
        
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Person p = (Person) obj;
        return lastName.equals(p.lastName) && firstName.equals(p.firstName) && age == p.age;
    }

    public String toString() {
        return getClass().getName() + "[First Name=\t" + firstName + "\t" + "Last Name=" + lastName + "\t" + "age=" + age + "]" + "\n";
    }

    public int getAge() {
        return age;
    }
}// Person
