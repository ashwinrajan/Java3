/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanClass;


/**
 *
 * @author Jenish
 */
public class Bean
{
  private String name = "Name";
  private String ssn = "SSN";
  private String balance = "Balance" ;
  private String preferred = "Preferred";

  public void setName(String n)
  {
    name = n;
  }
  public String getName()
  {
    return name;
  }
  
  public void setSSN(String s)
  {
    ssn = s;
  }
  public String getSSN()
  {
    return ssn;
  }
  
  public void setBalance(String b)
  {
    balance = b;
  }
  public String getBalance()
  {
    return balance;
  }
  
  public void setOption(String p)
  {
    preferred = p;
  }
  public String getOption()
  {
    return preferred;
  }
}
