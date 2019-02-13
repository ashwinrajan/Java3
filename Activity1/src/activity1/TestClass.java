/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package activity1;

/**
 *
 * @author Ashwin Rajan
 */
public class TestClass {

    public static void main(String[] args) {
        // TODO code application logic here

        String firstname;
        String lastName;
        String initial;
        String streetNum;
        String streetName;
        String cityName;
        String provinceName;
        String postalCode;
        int id;
        
        
        firstname="Ashwin";
        lastName="Rajan";
        streetNum="48";
        streetName="Cannon Crescent";
        cityName="Brampton";
        provinceName="Ontario";
        postalCode="L6Y4L8";
        id=21234;
        
        Name n = new Name(firstname,lastName);
        Address a = new Address (streetNum,streetName,cityName,provinceName,postalCode);
        
        Person person1=new Person(n,a,id);
        
        System.out.println(person1.toString());
        
        


    }
}
