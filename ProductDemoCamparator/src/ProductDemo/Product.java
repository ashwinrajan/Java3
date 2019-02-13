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

/**
 *
 * @author Ashwin Rajan
 */
public class Product
{
    private String description;

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
	ProductDemo.Product p = (ProductDemo.Product)obj;
	return description.equals(p.description);
    }



    public String getDescription()
    {
		return description;
	}
}
