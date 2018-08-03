package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;
import main.Sqlite;
import java.util.*;



public class Application {
    public static void main(String[] args) {

        University university = new University("CH.U.I.");

        university.setStudent();

        Internship internship = new Internship("Interlink");
        internship.setStudent(university);

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }

}
