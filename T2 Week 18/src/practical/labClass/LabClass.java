package practical.labClass;

/**
 * @author Will
 * Practical Week 18
 */

import java.util.ArrayList;
import java.util.Iterator;

public class LabClass {
	private String unit;
	private String instructor;
	private String room;
	private String timeTabled;
	private int maxStudents;
	private int groupNumber;
	private ArrayList<Student> studentList;
	
	public LabClass(String unit, String instructor, String room, String timeTabled, int maxStudents, int groupNumber) {
		this.unit = unit;
		this.instructor = instructor;
		this.room = room;
		this.timeTabled = timeTabled;
		this.maxStudents = maxStudents;
		this.groupNumber = groupNumber;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getTimeTabled() {
		return timeTabled;
	}

	public void setTimeTabled(String timeTabled) {
		this.timeTabled = timeTabled;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public void addStudent(Student newStudent) {
		if(studentList.size() == maxStudents) {
			System.out.println("Class is full");
		} else {
			studentList.add(newStudent);
			System.out.println("Student added to class");
		}
	}
	
	public int getNumberOfEnrolledStudents() {
		return studentList.size();
	}
	
	public void removeStudent_Index(int index) {
		studentList.remove(index);
	}
	
	public void removeStudent_Name(String studentName_Remove) {
		Iterator<Student> student_Iterator = studentList.iterator();
		Student currentStudent;
		String currentStudent_Name;
		boolean found = false;
		
		while(student_Iterator.hasNext()) {
			currentStudent = student_Iterator.next();
			currentStudent_Name = currentStudent.getName();
			
			if(currentStudent_Name.equals(studentName_Remove)) {
				student_Iterator.remove();
				System.out.println(studentName_Remove + " has been removed");
				found = true;
			}
		}
		
		if(!found) {
			System.out.println("Student not in class");
		}
	}
	
	public void findStudent_Name(String StudentName_Search) {
		int index = 0;
		boolean found = false;
		String studentName;
		Student currentStudent;
		
		while(index < studentList.size() && !found) {
			currentStudent = studentList.get(index);
			studentName = currentStudent.getName();
			
			if(studentName.equals(StudentName_Search)) {
				currentStudent.printInfo();
				found = true;
			} else {
				index++;
			}
		}
		
		if(!found) {
			System.out.println("Student not found");
		}
	}
	
	public void printInfo() {
		System.out.println("Unit: " + unit);
		System.out.println("Instructor: " + instructor);
		System.out.println("Room: " + room);
		System.out.println("Time Tabled Session: " + timeTabled);
		System.out.println("Group No. : " + groupNumber);
		System.out.println("Max No. : " + maxStudents);
		System.out.println("Enrolled No. : " + studentList.size());
		
		System.out.println("===== Student List =====");
		for(Student student : studentList) {
			System.out.println(student.getName());
		}
	} 
	
	public static void main(String[] args) {
		LabClass intprog = new LabClass("INTPROG", "Claire", "LG0.14", "Friday 1-3", 50, 4);
		
		intprog.addStudent(new Student("Alice", "123456", "Programming"));
		intprog.printInfo();

		intprog.addStudent(new Student("Bob", "234567", "Programming"));
		intprog.addStudent(new Student("Charlie", "345678", "Programming"));
		intprog.addStudent(new Student("David", "456789", "Programming"));
		intprog.addStudent(new Student("Eve", "567890", "Programming")); // this should produce an error

		intprog.printInfo();

		intprog.findStudent_Name("Charlie");
		intprog.removeStudent_Index(1);
		intprog.printInfo();
		intprog.removeStudent_Name("David");
		intprog.findStudent_Name("David"); // this should produce an error
		intprog.removeStudent_Name("David"); // this should produce an error

	}
}
