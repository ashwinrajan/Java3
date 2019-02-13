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
public class Person {
    
    private Name createName;
    private Address createAddress;
    private int id;
    
    public Person() {

        createName = null;
        createAddress = null;
        id = 0;

    }
    
    public Person(Name n,Address a ,int id) {
        
        createName=n;
        createAddress=a;
        this.id=id;
        
        
    }
    
    public int getID(){
        
        return id;
    }
    
    public void setID( int id){
        
        this.id=id;
    }
    
    public String toString() {
        
        return createName.toString()+ createAddress.toString();
        
    }
    
    

}
