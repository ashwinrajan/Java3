/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package film.assignment;

import java.util.*;
/**
 * @author Ashwin Rajan
 */
public class TestFilm {

    static LinkedList<Film> myFilm = new LinkedList<Film>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        for (int i = 1; i <= 10; i++) {

            System.out.println(i + ") Type the Film");
            Scanner in;
            in = new Scanner(System.in);

            String film = in.nextLine();

            System.out.println(i + ")Type the Film Length");
            in = new Scanner(System.in);

            int length = in.nextInt();

            myFilm.add(new Film(film, length));

        }

        Collections.sort(myFilm);
        System.out.println("\nSorted by name:");
        for (int i = 0; i < myFilm.size(); i++) {
            System.out.println(myFilm.get(i));
        }

        Collections.sort(myFilm, new Comparator<Film>() {
            public int compare(Film obj1, Film obj2) {
                int length1 = obj1.getLengthOfFilm();
                int length2 = obj2.getLengthOfFilm();
                if (length1 > length2) {
                    return 1;
                } else if (length1 < length2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        
        System.out.println("\n Sorted by length:");
        for (int i = 0; i < myFilm.size(); i++) {
            System.out.println(myFilm.get(i));
        }

        System.out.println(shortestFilm());
        System.out.println(longestFilm());

    }
    
    public static String shortestFilm(){
        
        return "\nShortest Film: " + myFilm.get(0).getTitleOfFilm()
                + " at " + myFilm.get(0).getLengthOfFilm() + " minutes";
        
    }
    
    public static String longestFilm(){
        
        return "Longest Film: " + myFilm.get(9).getTitleOfFilm()
                + " at " + myFilm.get(9).getLengthOfFilm() + " minutes ";
        
    }
    
}
