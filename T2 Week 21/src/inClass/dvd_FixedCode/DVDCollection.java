package inClass.dvd_FixedCode;

import java.util.ArrayList;

/**
 * @author Will
 * In Class Week 21
 * 
 * Fixed code example -> Coupling & Cohesion 
 */

public class DVDCollection {
	ArrayList<DVD> dvd_Al = new ArrayList<DVD>();
    DVD Guardians = new DVD("Guardians Of The Galaxy", "James Gunn", 2014);
	DVD L_Blond = new DVD("Leagally Blond", "Robert Luketic", 2001);
	
    public DVDCollection() {
    		dvd_Al.add(Guardians);
    		dvd_Al.add(L_Blond);
    }

    public void printDVDInfo() {
        for(DVD d: dvd_Al) {
        		d.printDVDInfo();
        }
    }
}
