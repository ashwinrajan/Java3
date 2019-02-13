/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Ashwin Rajan
 */
public class Sum {

    private String num1 = null;
    private String num2 = null;
    private String total = null;

    public void setNum1(String n1) {
        num1 = n1;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum2(String n2) {
        num2 = n2;
    }

    public String getNum2() {
        return num2;
    }

    public String getTotal() {

        return Integer.toString(Integer.parseInt(num1) + Integer.parseInt(num2));
    }
}
