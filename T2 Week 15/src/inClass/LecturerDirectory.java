
public class LecturerDirectory
{
    // instance variables
    private String name;
    private int phoneNumber;
    private String office;
    private int numProjectStudents;

    // constructor
    public LecturerDirectory(String lecturerName, int lecturerPhone, String officeNo)
    {
        // initialise instance variables
        name = lecturerName;
        phoneNumber = lecturerPhone;
        office = officeNo;
        numProjectStudents = 0;
    }

    // method to add a project student
    public void addProjectStudent()
    {
        numProjectStudents += 1;
    }
    
    // method to calculate num hours devoted to project students based on the number of weeks entered (assume 2 hours per week per student)
    public int calculateProjectStudentHours(int numWeeks)
    {
        int numProjectHours = (numProjectStudents * 2) * numWeeks;
        
        return numProjectHours;
    }
}
