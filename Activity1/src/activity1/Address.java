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
public class Address {
    
    private String streetNum = new String();
    private String streetName = new String();
    private String cityName = new String();
    private String provinceName = new String();
    private String postalCode = new String();
    private final String COUNTRY = "Canada";

    public Address() {

        streetNum = "";
        streetName = "";
        cityName = "";
        provinceName = "";
        postalCode = "";


    }
    
    public Address(String streetNum, String streetName, String cityName, String provinceName, String postalCode) {

        this.streetNum = streetNum;
        this.streetName = streetName;
        this.cityName = cityName;
        this.provinceName = provinceName;
        this.postalCode = postalCode;


    }
    
    @Override
    public String toString() {
        
        return "\r\nStreet Number: "+this.streetNum+"\r\nStreet Name: "+this.streetName+"\r\nCity Name: "+this.cityName+"\r\nProvince Name: "+this.provinceName
                +"\r\nPostal Code: "+this.postalCode+"\r\nCountry: "+COUNTRY;
        
    }

}
