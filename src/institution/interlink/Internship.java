package institution.interlink;

import person.Student;
import institution.University;

import java.util.ArrayList;
import java.util.List;

public class Internship {

    private String name;
    List<Student> studentList = new ArrayList<>();


    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        studentList.add(student);
    }

    public String getStudents() {
        return studentList.toString();
    }

    public void average(University university) {
        //Calculating the amount of students knowledge level
        int sum = 0;
        for (Student std : university.getStudentList()) {
            sum += std.getKnowledge().getLevel();

        }

        //Calculating of the average
        int avg = sum / university.getStudentList().size();

        //if the student knowledge level is above average then add it to internship
        for (Student std : university.getStudentList()) {
            if (std.getKnowledge().getLevel() > avg) {
                this.setStudent(std);
            }
        }
    }
}
