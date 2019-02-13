/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package film.assignment;

import java.util.*;

/**
 *
 * @author Ashwin Rajan
 */
public class Film implements Comparable {

    private String titleOfFilm;
    private int lengthOfFilm;

    public Film() {
        titleOfFilm="";
        lengthOfFilm=0;
    }

    public Film(String titleOfFilm, int lengthOfFilm) {

        this.titleOfFilm = titleOfFilm;
        this.lengthOfFilm = lengthOfFilm;

    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Film f = (Film) obj;
        return titleOfFilm.equals(f.titleOfFilm) && lengthOfFilm == f.lengthOfFilm;
    }

    public int compareTo(Object obj) {
        Film f = (Film) obj;

        return this.titleOfFilm.compareTo(f.titleOfFilm);

    }

    public int getLengthOfFilm() {
        return lengthOfFilm;
    }

    public String getTitleOfFilm() {

        return titleOfFilm;

    }

    public String toString() {
        return "Film: " + titleOfFilm + " and Film Length: " + lengthOfFilm;
    }
}
