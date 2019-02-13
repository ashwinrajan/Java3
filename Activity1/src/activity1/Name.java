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
public class Name {

    private String firstName= new String();
    private String lastName= new String();
    private String initial= new String();
    
    
    public Name(String firstName,String lastName){
        
        this.firstName=firstName;
        this.lastName=lastName;
        this.initial=null;
        
    }
            
    
    public Name(String firstName,String lastName,String initial)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.initial=initial;
        
    }
    
    public String toString() {
        
        if(initial==null){
            return "First Name:"+ this.firstName+"\r\nLast Name:"+this.lastName;
        }else{
            return "First Name:"+ this.firstName+"\r\nLast Name:"+this.lastName +"\r\nInitial:"+this.initial;
        }
            
        
        
    }
    
}
