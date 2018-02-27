package inClass.lecturer_Inheritance;

/**
 * @author Will
 * In Class Week 19
 */

public class Lecturer {
    /** instance variables */
    private String name;
    private int phoneNumber;
    private String office;
    private int numProjectStudents;

    /** constructor */
    public Lecturer(String lectName, int lectPhone, String officeNum) {
        /** initialise instance variables */
        name = lectName;
        phoneNumber = lectPhone;
        office = officeNum;
        numProjectStudents = 0;
    }

    /** accessor method for name */
    public String getName() {
        return name;
    }

    /** mutator method for name */
    public void setName(String newName) {
        name = newName;
    }

    /** accessor method for numProjectStudents */
    public int getNumProjectStudents() {
        return numProjectStudents;
    }

    /** mutator method for numProjectStudents */
    public void setNumProjectStudents(int newNumStudents) {
        if (newNumStudents < 0) /** number of students cannot be negative */
        {
            System.out.println("Number of project students cannot be less than 0");
        } else if (newNumStudents > 6) /** number of students cannot be more than 6 */
        {
            System.out.println("Number of project students cannot be more than 6");
        } else {
            numProjectStudents = newNumStudents;
        }
    }

    /** method to calculate the number of hours spent on project students over the entered number of weeks*/
    public int calculateProjectStudentHours(int numWeeks) {
        int numHours = (numProjectStudents * 2) * numWeeks;

        return numHours;
    }

    public void printInformation() {
        String printString = "Lecturer Information";
        printString += "\nName: " + name;
        printString += "\nExtension Number: " + phoneNumber;
        printString += "\nOffice Number: " + office;
        printString += "\nProject Students: " + numProjectStudents;

        System.out.println(printString);
    }
}
