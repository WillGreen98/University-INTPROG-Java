package inClass.lecturer_Inheritance;

public class Lecturer {
    protected String name;
    protected int phoneNumber;
    protected String office;
    protected int numProjectStudents;

    /**
     * Constructor for objects of class Lecturer
     * 
     * @param lectName the name of the lecturer
     * @param lectPhone the 4 digit extension number for the lecturer
     * @param officeNum the office number of the lecturer (building code and room number)
     */
    public Lecturer(String lectName, int lectPhone, String officeNum) {
        /** initialise instance variables */
        name = lectName;
        phoneNumber = lectPhone;
        office = officeNum;
        numProjectStudents = 0;
    }

    /** 
     * Method to get the name of the lecturer
     * 
     * @return name of lecturer
     */
    public String getName() {
        return name;
    }

    /**
     * Method to change the name of the lecturer
     * 
     * @param newName new name of the lecturer
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * Method to get the number of project students supervised by the lecturer
     * 
     * @return the number of project students supervised
     */
    public int getNumProjectStudents() {
        return numProjectStudents;
    }

    /** 
     * Method to change the number of project students supervised
     * 
     * @param newNumStudents the new number of students supervised
     */
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

    /** 
     * Method to calculate the number of hours spent on project students.  The method 
     * assumes that 2 hours per week is spent per student
     * 
     * @param numWeeks the number of weeks to calculate the hours over
     * @return the number of hours spent on project students
     */
    public int calculateProjectStudentHours(int numWeeks) {
        int numHours = (numProjectStudents * 2) * numWeeks;

        return numHours;
    }

    /**
     * Method to print the information stored about the SeniorLecturer
     */
    public void printInformation() {
        System.out.println("Lecturer Information from Superclass");
        System.out.println("Name: " + name);
        System.out.println("Extension Number: " + phoneNumber);
        System.out.println("Office Number: " + office);
        System.out.println("Project Students: " + numProjectStudents);
    }
}
