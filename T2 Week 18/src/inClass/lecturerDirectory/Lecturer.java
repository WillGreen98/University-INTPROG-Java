package inClass.lecturerDirectory;

/**
 * @author Will
 * In Class Week 18
 */

public class Lecturer {	
    private String name;
    private int phoneNumber;
    private String office;
    private int numProjectStudents;

    public Lecturer(String lecturerName, int lecturerPhone, String officeNo) {
        name = lecturerName;
        phoneNumber = lecturerPhone;
        office = officeNo;
        numProjectStudents = 0;
    }
    
    // Mutator - Getter Method 
    public String getName() {
    		return name;
    }
    
    public int getStudentProjects() {
    		return numProjectStudents;
    } 
    
    // Mutator - Setter Method 
    public void setName(String newName) {
    		name = newName;
    }
    

    public void setNumProjectStudent(int newNum) {
    		if(newNum < 0) {
    			System.out.println("You cannot have zero students");
		} else if(newNum > 6) {
			System.out.println("You cannot have more than 6 students");
		} else {
			numProjectStudents = newNum;
		}
    }

    public void addProjectStudent() {
        numProjectStudents += 1;
    }
    
    public int calculateProjectStudentHours(int numWeeks) {
        int numProjectHours = (numProjectStudents * 2) * numWeeks;
        
        return numProjectHours;
    }
    
    public void printInfo() {
        String printString = "Lecturer Information";
        printString += "\nName: " + name;
        printString += "\nExtension Number: " + phoneNumber;
        printString += "\nOffice Number: " + office;
        printString += "\nProject Students: " + numProjectStudents;
        
        System.out.println(printString);
    }
}