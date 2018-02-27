package inClass.lecturer_Inheritance;

/**
 * @author Will
 * In Class Week 19
 */

import java.util.*;

public class LecturerDirectory {
    private ArrayList<Lecturer> lecturers;

    public LecturerDirectory() {
        lecturers = new ArrayList<Lecturer>();
    }

    public void addLecturer(Lecturer newLecturer) {
        lecturers.add(newLecturer);
    }

    public void removeLecturer(int index) {
        lecturers.remove(index);
    }

    public Lecturer getLecturer(int index) {
        return lecturers.get(index);
    }

    public void addProjectStudents(int index, int numStudents) {
        lecturers.get(index).setNumProjectStudents(numStudents);
    }

    public void printLecturerInformation() {
        for (Lecturer lect : lecturers) {
            lect.printInformation();
        }
    }

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

    public void printLecturerInformationWhile() {
        int index = 0;

        while (index < lecturers.size()) {
            lecturers.get(index).printInformation();
            index++;
        }
    }

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

    public Lecturer findLecturerAlt(String lectName) {
        int index = 0;

        Lecturer currentLecturer;
        String currentLecturerName;

        while (index < lecturers.size()) {
            currentLecturer = lecturers.get(index);
            currentLecturerName = currentLecturer.getName();

            if (currentLecturerName.equals(lectName)) {
                return currentLecturer;
            }

            index++;
        }

        return null;
    }

    public void printLecturerInfoByName(String lectName) {
        Lecturer lecturer = findLecturerAlt(lectName);

        if (lecturer == null) {
            System.out.println(lectName + " not found");
        } else {
            lecturer.printInformation();
        }
    }

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
