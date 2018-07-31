package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;
import java.util.*;



public class Application {
    public static void main(String[] args) {

        University university = new University("CH.U.I.");

        Dictionary dict = new Hashtable();
        Sqlite sqlite = new Sqlite();
        //Get all data from database in Dictionary
        dict = sqlite.select();

        //if database is not empty, we will get database data, else we will get standart data
        if ( dict.isEmpty() == false )
        {
            Object obj;
            int level;
            String name;
            for ( Enumeration e = dict.keys(); e.hasMoreElements();)
            {
                obj = e.nextElement();
                name = (String) obj;
                level = (int) dict.get(obj);

                university.addStudent(new Student(name, new Knowledge(level)));

            }
        }else

            {
                university.addStudent(new Student("Andrew Kostenko", new Knowledge(2)));
                university.addStudent(new Student("Julia Veselkina", new Knowledge(4)));
                university.addStudent(new Student("Maria Perechrest", new Knowledge(3)));
                university.addStudent(new Student("Olga Voron", new Knowledge(2)));
                university.addStudent(new Student("Ostap Ivanov", new Knowledge(3)));
            }




        Internship internship = new Internship("Interlink");



        //Calculating the amount of students knowledge level
        int sum =0;
        for (Student std: university.getStudentList()){
            sum += std.getKnowledge().getLevel();

        }

        //Calculating of the average
        int avg = sum/university.getStudentList().size();

        //if the student knowledge level is above average then add it to internship
        for (Student std: university.getStudentList()){
            if(std.getKnowledge().getLevel()>avg){
                internship.setStudent(std);
            }
        }

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }




}
