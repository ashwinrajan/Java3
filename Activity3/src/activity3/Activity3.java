/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package activity3;

import java.io.File;
import java.util.*;

/**
 *
 * @author Ashwin Rajan
 */
public class Activity3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        File file = new File("inputFile.txt");
        Scanner scanner = new Scanner(file);
        int count = 0;
        double total = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            StringTokenizer tk = new StringTokenizer(line, " ");
            tk.nextToken();
            tk.nextToken();
            total += Double.parseDouble(tk.nextToken());
            count++;
        }
        System.out.println("Total number of Stores: " + count + " Total Sales: " + total);

    }
    
}
