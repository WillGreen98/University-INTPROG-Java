package inClass.dvd_PoorCode;

/**
 * @author Will
 * In Class Week 21
 * 
 * Poor code example -> Coupling & Cohesion 
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
