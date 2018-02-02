package practical;

/**
 * @author Will
 *
 */

public class Student {
	private String name;
	private String idNumber;
	private String fav_Subject;
	private int creditsPassed;
	
	public Student(String studentID, String studentName, String favSub) {
		idNumber = studentID;
		name = studentName;
		fav_Subject = favSub;
		creditsPassed = 0;
	}
	
	public String getComputerLogin() {
		return "UP" + idNumber;
	} 
	
	public String getId() {
		return idNumber;
	} 
	
	public String getName() {
		return name;
	} 
	
	public void changeName(String newName) {
		name = newName;
	}
	
	public String getSubject() {
		return fav_Subject;
	}
	
	public void updateFav_Sub(String newFav) {
		fav_Subject = newFav;
	}
	
	public int getCredits() {
		return creditsPassed;
	} 
	
	public void addCreditsPassed(int numCred) {
		creditsPassed += numCred;
	}
	
	public boolean GetYoAssWhooped() {
		int creds = getCredits();
		
		if(creds < 120) {
			return false;
		} else {
			return true;
		}
	} 
		
	public void printInfo() {
		System.out.println("==== Student Info ====");
		System.out.println("Student Login: " + getComputerLogin());
		System.out.println("Student ID: " + idNumber);
		System.out.println("Student Name: " + name);
		System.out.println("Credits passed: " + creditsPassed);
		System.out.println(GetYoAssWhooped());
	} 
	
	public static void main(String[] args) {
		Student student1 = new Student("853829", "Will", "Physics");
		
		System.out.println("Student login: " + student1.getComputerLogin());
		
		System.out.println("Student ID: " + student1.getId());
		
		System.out.println("Name before: " + student1.getName());
		student1.changeName("Neo");
		
		System.out.println("Name after: " + student1.getName());
		
		System.out.println("Student's Fav Sub: " + student1.getSubject());
		
		System.out.println("Student Credits: " + student1.getCredits());
		int rand_Cred = (int )(Math.random() * 4000 + 1);
		student1.addCreditsPassed(rand_Cred);
		System.out.println("Student Credits: " + student1.getCredits());
		
		student1.printInfo();
		
	}
}