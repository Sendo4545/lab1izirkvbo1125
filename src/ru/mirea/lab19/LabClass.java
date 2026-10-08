package ru.mirea.lab19;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class LabClass {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }
    public List<Student> getStudents() {
        return students;
    }
    public void sortStudents() {
        Collections.sort(students);
    }
    public Student findStudent(String fullname) throws StudentNotFoundException{
        if (fullname == null || fullname.trim().isEmpty()) {
            throw new EmptyStringException("Пустая строка!");
        }
        for (Student s : students) {
            if (s.getFullName().equalsIgnoreCase(fullname.trim())) {
                return s;
            }
        }
        throw new StudentNotFoundException("Студент с ФИО '" + fullname + "' не найден в базе данных.");
    }
}
