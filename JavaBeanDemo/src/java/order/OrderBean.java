package order;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashwin Rajan
 */
/* A JavaBean to hold values from a form request
 */


public class OrderBean
{
  private String name = "Name";
  private String password = "Password";
  private String flavor = "Flavor" ;
  private String[] toppings = {"Toppings"};
  private String place = "Place";

  public void setName(String n)
  {
    name = n;
  }
  public String getName()
  {
    return name;
  }
  public void setPassword(String p)
  {
    password = p;
  }
  public String getPassword()
  {
    return password;
  }
  public void setToppings(String[] t)
  {
    toppings = t;
  }
  public String[] getToppings()
  {
    return toppings;
  }
  public void setFlavor(String f)
  {
    flavor = f;
  }
  public void setPlace(String p)
  {
    place = p;
  }
  public String getPlace()
  {
    return place;
  }
  public String getFlavor()
  {
    return flavor;
  }
}