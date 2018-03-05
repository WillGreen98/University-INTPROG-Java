package inClass.dvd_FixedCode;

/**
 * @author Will
 * In Class Week 21
 * 
 * Fixed code example -> Coupling & Cohesion 
 */

public class DVD {
    public String dvd1Name;
    public String dvd2Name;
    public String dvd1Director;
    public String dvd2Director;
    public int dvd1ReleaseYear;
    public int dvd2ReleaseYear;

    public DVD() {
        dvd1Name = "Guardians of the Galaxy";
        dvd2Name = "Legally Blonde";
        dvd1Director = "James Gunn";
        dvd2Director = "Robert Luketic";
        dvd1ReleaseYear = 2014;
        dvd2ReleaseYear = 2001;
    }

    public void printDVD1Info() {
        System.out.print(dvd1Name + ".  ");
        System.out.print("Directed by: " + dvd1Director + ".  ");
        System.out.println(" Released in " + dvd1ReleaseYear);
    }

    public void printDVD2Info() {
        System.out.print(dvd2Name + ".  ");
        System.out.print("Directed by: " + dvd2Director + ".  ");
        System.out.println(" Released in " + dvd2ReleaseYear);
    }

    public double multiplyNumbers(double[] nums) {
        double total = 1;

        for(double num : nums) {
            total *= num;
        }

        return total;
    }

    public void printCarRegistration(String reg) {
        System.out.println("Registration is: " + reg);
    }
    
    public static void main(String[] args) {
        DVDCollection dvdCollection = new DVDCollection();
        dvdCollection.printDVDInfo();
    }
}
