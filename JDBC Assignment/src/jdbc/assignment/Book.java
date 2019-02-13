/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jdbc.assignment;

/**
 *
 * @author Ashwin Rajan
 */
public class Book {
     
    /**
     * Declaring Variables.
     */
    private String code;
    private String title;
    private double price;
    
    /**
     * Creating a Book constructor with no argument and initializing with null .
     */
    public Book(){
        
        this.code="";
        this.title="";
        this.price=0.0;
        
    }
    
    /**
     * Creating a Book constructor with three argument and sets all the variables.
     * @param code book code of the book
     * @param title book title of the book
     * @param price book price of the book
     */
    public Book(String code, String title, double price){
        
        this.setCode(code);
        this.setTitle(title);
        this.setPrice(price);
        
    }
        
    /**
     * Creating a method that returns BookCode.
     * @return the BookCode
     */
    public String getCode(){
        
        return this.code;
        
    }
       
    /**
     * Creating a method that returns BookTitle.
     * @return the BookTitle
     */
    public String getTitle(){
        
        return this.title;
        
    }
    
    /**
     * Creating a method that returns BookPrice.
     * @return the BookPrice
     */
    public double getPrice(){
        
        return this.price;
        
    }
    
    /**
     * Creating a method that sets BookCode.
     */
    public void setCode(String code) {

        this.code = code;
    }
    
    /**
     * Creating a method that sets BookTitle.
     */
    public void setTitle(String title) {

        this.title = title;
    }
    
    /**
     * Creating a method that sets BookPrice.
     */
    public void setPrice(double price) {

        this.price = price;
    }
    
    /**
     * Creating a method that return a string representation of the object Book.
     * @return a string representation of the object Book
     */
    public String toString() {
        
        return "Code: "+code+"\nTitle: "+title+"\nPrice: "+price;
        
    }

}
