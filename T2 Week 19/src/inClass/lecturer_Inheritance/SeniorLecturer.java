package inClass.lecturer_Inheritance;

/**
 * @author Will
 * In Class Week 19
 */

public class SeniorLecturer extends Lecturer {
    private String unitResponsibility;

    /**
     * Constructor for objects of class SeniorLecturer
     */
    public SeniorLecturer(String lectName, int lectPhone, String officeNum, String unit) {
        super(lectName, lectPhone, officeNum);
        unitResponsibility = unit;
    }

    public void printInformation() {
        super.printInformation();
        System.out.println("Responsible for: " + unitResponsibility);
    }

    public void printingPrivateInstanceVariableDemo() {
        //System.out.println("Name: " + name);
    }
}
