package inClass.lecturerDirectory_mutator;

/**
 * @author Will
 * In Class Week 16
 */

public class LecturerTest {
	public static void main(String[] args) {
		Mutator_LecturerDirectory lecturer = new Mutator_LecturerDirectory("Claire", 6463, "BK1.04b");
	       
       System.out.println("Lecturer name: " + lecturer.getName());
       
       System.out.println("Lecturer name before change: " + lecturer.getName());
       lecturer.setName("Bob");
       System.out.println("Lecturer name after change: " + lecturer.getName());
       
       System.out.println("Number of project students before change: " + lecturer.getStudentProjects());
       lecturer.setNumProjectStudent(4);
       System.out.println("Number of project students after change: " + lecturer.getStudentProjects());
       lecturer.setNumProjectStudent(-4);
       System.out.println("Number of project students after invalid change attempt: " + lecturer.getStudentProjects());
       lecturer.setNumProjectStudent(10);
       System.out.println("Number of project students after invalid change attempt: " + lecturer.getStudentProjects());
	}
}
