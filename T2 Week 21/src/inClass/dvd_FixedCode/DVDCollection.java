package inClass.dvd_FixedCode;

/**
 * @author Will
 * In Class Week 21
 * 
 * Fixed code example -> Coupling & Cohesion 
 */

public class DVDCollection {
    public DVD dvds;

    public DVDCollection() {
        dvds = new DVD();
    }

    public void printDVDInfo() {
        dvds.printDVD1Info();
        dvds.printDVD2Info();

        dvds.dvd1Name = "Guardians of the Galaxy Vol 2";
        dvds.dvd1ReleaseYear = 2017;

        dvds.printDVD1Info();

    }
}
