package inClass;

/**
 * @author Will
 * In Class Week 16
 */

public class Mutator_LecturerDirectory {	
    private String name;
    private int phoneNumber;
    private String office;
    private int numProjectStudents;

    public Mutator_LecturerDirectory(String lecturerName, int lecturerPhone, String officeNo) {
        // initialise instance variables
        name = lecturerName;
        phoneNumber = lecturerPhone;
        office = officeNo;
        numProjectStudents = 0;
    }
    
    // Mutator Method 
    public String getName() {
    		return name;
    }

    public void addProjectStudent() {
        numProjectStudents += 1;
    }
    
    public int calculateProjectStudentHours(int numWeeks) {
        int numProjectHours = (numProjectStudents * 2) * numWeeks;
        
        return numProjectHours;
    }
}