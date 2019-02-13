/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.Pizza;
import java.util.Date;
/**
 *
 * @author ramneet
 */
public class NewClass {
    public static void main(String args[]){
    Date sysDate = new Date ();
String sysDateStr = sysDate.toString ();
String []a=sysDateStr.split(" ");
String p=""+a[1]+a[2]+a[5];
System.out.println(""+p);


    }
    
}
