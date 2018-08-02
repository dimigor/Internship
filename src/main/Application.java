package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;
import java.util.*;



public class Application {
    public static void main(String[] args) {

        University university = new University("CH.U.I.");



        university.addStudent(new Student("Andrew Kostenko", new Knowledge(2)));
        university.addStudent(new Student("Julia Veselkina", new Knowledge(4)));
        university.addStudent(new Student("Maria Perechrest", new Knowledge(3)));
        university.addStudent(new Student("Olga Voron", new Knowledge(2)));
        university.addStudent(new Student("Ostap Ivanov", new Knowledge(3)));


        Internship internship = new Internship("Interlink");





        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }




}
