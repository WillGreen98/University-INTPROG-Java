package inClass.lecturer_Inheritance;

public class TestLecturers
{
    public static void main(String[] args)
    {
        LecturerDirectory ld = new LecturerDirectory();
        
        //ld.addLecturer(new Lecturer("Alice", 6463, "BK1.04b"));
        ld.addLecturer(new SeniorLecturer("Bob", 6102, "BK1.04a", "INTPROG"));
       
        
        ld.printLecturerInformation();
        System.out.println();
    }
}
