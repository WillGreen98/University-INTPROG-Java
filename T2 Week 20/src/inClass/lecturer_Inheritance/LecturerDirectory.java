package inClass.lecturer_Inheritance;

import java.util.*;

public class LecturerDirectory {
    private ArrayList<Lecturer> lecturers;

    /**
     * Constructor for objects of class LecturerDirectory
     */
    public LecturerDirectory() {
        lecturers = new ArrayList<Lecturer>();
    }

    /**
     * Method to add a lecturer to the directory
     * 
     * @param newLecturer the new lecturer to add to the list
     */
    public void addLecturer(Lecturer newLecturer) {
        lecturers.add(newLecturer);
    }

    /**
     * Method to remove a lecturer from the directory
     * 
     * @param index the index number of the lecturer to remove from the list
     */
    public void removeLecturer(int index) {
        lecturers.remove(index);
    }

    /**
     * Method to get a lecturer based on their position in the directory
     * 
     * @param index the position of the lecturer in the directory
     * @return the lecturer at the position in the directory
     */
    public Lecturer getLecturer(int index) {
        return lecturers.get(index);
    }

    /**
     * Method to add project students to a particular lecturer
     * 
     * @param index the lecturer position to add project students to
     * @param numStudents the number of students the supervisor will have
     */
    public void addProjectStudents(int index, int numStudents) {
        lecturers.get(index).setNumProjectStudents(numStudents);
    }

    /**
     * Method to print the information for all the lecturers in the directory
     */
    public void printLecturerInformation() {
        for (Lecturer lect : lecturers) {
            lect.printInformation();
        }
    }

    /**
     * Method to print the information for all the lecturers in the directory who have
     * project students
     */
    public void printLecturersWithProjectStudents() {
        int numProjectStudents;
        int count = 0;

        for (Lecturer lect : lecturers) {
            numProjectStudents = lect.getNumProjectStudents();

            if (numProjectStudents != 0) {
                String lectName = lect.getName();
                System.out.println(lectName + " has " + numProjectStudents + " project students");
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No lecturers have project students");
        }
    }

    /**
     * Method to print the information of a lecturer which has been found by their name
     * 
     * @param lectName the name of the lecturer to print the information for
     */
    public void findLecturer(String lectName) {
        boolean found = false;
        int index = 0;

        Lecturer currentLecturer;
        String currentLecturerName;

        while (index < lecturers.size() && !found) {
            currentLecturer = lecturers.get(index);
            currentLecturerName = currentLecturer.getName();

            if (currentLecturerName.equals(lectName)) {
                currentLecturer.printInformation();
                found = true;
            }

            index++;
        }

        if (!found) {
            System.out.println(lectName + " has not been found");
        }
    }

    /**
     * Method to remove a lecturer which has been found using their name
     * 
     * @param the name of the lecturer to remove
     */
    public void removeLecturerByName(String lectName) {
        boolean found = false;
        Iterator<Lecturer> it = lecturers.iterator();

        Lecturer currentLecturer;
        String currentLecturerName;

        while (it.hasNext() && !found) {
            currentLecturer = it.next();
            currentLecturerName = currentLecturer.getName();

            if (currentLecturerName.equals(lectName)) {
                it.remove();
                System.out.println(lectName + " has been removed");
                found = true;
            }
        }

        if (!found) {
            System.out.println(lectName + " has not been found");
        }
    }
}
