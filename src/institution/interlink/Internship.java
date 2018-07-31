package institution.interlink;

import person.Student;

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
}
