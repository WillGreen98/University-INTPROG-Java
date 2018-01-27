package inClass;

/**
 * @author Will
 * In Class Week 15
 */

public class LecturerDirectory {
    private String name;
    private int phoneNumber;
    private String office;
    private int numProjectStudents;

    public LecturerDirectory(String lecturerName, int lecturerPhone, String officeNo) {
        // initialise instance variables
        name = lecturerName;
        phoneNumber = lecturerPhone;
        office = officeNo;
        numProjectStudents = 0;
    }

    public void addProjectStudent() {
        numProjectStudents += 1;
    }
    
    public int calculateProjectStudentHours(int numWeeks) {
        int numProjectHours = (numProjectStudents * 2) * numWeeks;
        
        return numProjectHours;
    }
}
