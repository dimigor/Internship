package institution;

import person.Student;
import main.Sqlite;
import person.consciousness.Knowledge;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private List<Student> studentList = new ArrayList<>();

    public University(String name)
    {
        this.name = name;
    }

    public void setStudent()
    {
        //if database does not exist, we add default students
        if (Sqlite.getStudentFromDatabase(this) == false){

            this.addStudent(new Student("Andrew Kostenko", new Knowledge(2)));
            this.addStudent(new Student("Julia Veselkina", new Knowledge(4)));
            this.addStudent(new Student("Maria Perechrest", new Knowledge(3)));
            this.addStudent(new Student("Olga Voron", new Knowledge(2)));
            this.addStudent(new Student("Ostap Ivanov", new Knowledge(3)));

        }

    }

    public void addStudent(Student student)
    {
        studentList.add(student);
    }

    public List<Student> getStudentList()
    {
        return studentList;
    }
}
