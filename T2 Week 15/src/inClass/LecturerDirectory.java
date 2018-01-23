package inClass;

/**
 * @author Will
 * In Class Week 15 - Examples
 */

public class LecturerDirectory {
	private String name;
	private String office;
	private int phoneNumber;
	private int numProjects_Students;
	
	public LecturerDirectory(String lectName, String lectOffice, int lectPhone, int projects) {
		name = lectName;
		office = lectOffice;
		phoneNumber = lectPhone;
		numProjects_Students = 0;
	}
	
	public void addProjectStudent() {
		numProjects_Students += 1;
	} 
	
	public int calculateProjectStudentHours(int numWeeks) {
		int numHours = (numProjects_Students * 2) * numWeeks;
		
		return numHours;
	}
}