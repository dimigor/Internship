package institution.interlink;

import person.Student;
import institution.University;

import java.util.ArrayList;
import java.util.List;

public class Internship {

    private String name;
    List<Student> studentList = new ArrayList<>();


    public Internship(String name)
    {
        this.name = name;
    }

    public void setStudent(University university) {


        //if the student knowledge level is above average then add it to internship
        for (Student std : university.getStudentList())
        {
            if (std.getKnowledge().getLevel() > university.averageLevelOfKnowledge())
            {
                studentList.add(std);
            }
        }

    }

    public String getStudents()
    {
        return studentList.toString();
    }


}
