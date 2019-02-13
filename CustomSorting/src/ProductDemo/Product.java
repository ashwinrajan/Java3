/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ProductDemo;

import java.util.Comparator;

/**
 *
 * @author Ashwin Rajan
 */
// Product.java

public class Product implements Comparator
{
    private String description;

    public Product()
    {
	
    }
    
    public Product(String d)
    {
		description = d;
    }

    public String toString()
    {
		//return "Product[description=\"" + description + "\"]";
		return getClass().getName() + "[description=\"" + description + "\"]";
    }



    public boolean equals(Object obj)
            
    {
		// check if identical objects
		if (this == obj) return true;

	// must be false if the parameter is null
	if (obj == null || this ==null) return false;

	// must be false if objects have different classes
	if (getClass() != obj.getClass()) return false;

	// now we can cast and do something specific
	Product p = (Product)obj;
	return description.equals(p.description);
    }


    public int compare(Object obj,Object obj1)
    {
		Product p = (Product) obj;
                Product p1 = (Product) obj1;
		return  p1.description.compareTo(p.description);//invokes compareTo() from String class
    }

    public String getDescription()
    {
		return description;
	}
}
