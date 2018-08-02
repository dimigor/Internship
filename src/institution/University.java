package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private List<Student> studentList = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        studentList.add(student);
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
