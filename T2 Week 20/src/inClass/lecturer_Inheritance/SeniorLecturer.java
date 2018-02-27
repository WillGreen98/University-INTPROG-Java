package inClass.lecturer_Inheritance;

public class SeniorLecturer extends Lecturer {
    private String unitResponsibility;

    /**
     * Constructor for objects of class SeniorLecturer
     * 
     * @param lectName the name of the lecturer
     * @param lectPhone the 4 digit extension number for the lecturer
     * @param officeNum the office number of the lecturer (building code and room number)
     * @param unit the unit the lecturer is responsible for
     */
    public SeniorLecturer(String lectName, int lectPhone, String officeNum, String unit) {
        super(lectName, lectPhone, officeNum);
        unitResponsibility = unit;
    }

    /**
     * Method to print the information stored about the SeniorLecturer
     */
    /*public void printInformation()
    {
        System.out.println("Lecturer information from Subclass Method");
        System.out.println("Name: " + name);
        System.out.println("Extension Number: " + phoneNumber);
        System.out.println("Office Number: " + office);
        System.out.println("Project Students: " + numProjectStudents);
        System.out.println("Responsible for: " + unitResponsibility);
    }*/

    /**
     * Method to print the information stored about the SeniorLecturer
     */
    public void printInformation() {
        System.out.println("Subclass Method");
        super.printInformation();
        System.out.println("Additional info from subclass");
        System.out.println("Responsible for: " + unitResponsibility);
    }

}
