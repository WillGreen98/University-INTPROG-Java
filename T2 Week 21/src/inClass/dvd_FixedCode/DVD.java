package inClass.dvd_FixedCode;

/**
 * @author Will
 * In Class Week 21
 * 
 * Fixed code example -> Coupling & Cohesion 
 */

public class DVD {    
    private String name;
    private String director;
    private int rel_Year;
    
    public DVD(String name, String director, int rel_Year) {        
        this.name = name;
        this.director = director;
        this.rel_Year = rel_Year; 
    }
    
    public String getName() {
		return name;
	}
    
	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getRel_Year() {
		return rel_Year;
	}

	public void setRel_Year(int rel_Year) {
		this.rel_Year = rel_Year;
	}

	public void printDVDInfo() {
        System.out.print(getName() + ".  ");
        System.out.print("Directed by: " + getDirector() + ".  ");
        System.out.println(" Released in " + getRel_Year());
    }

    public static void main(String[] args) {
        DVDCollection dvdCollection = new DVDCollection();
        dvdCollection.printDVDInfo();
    }
}
