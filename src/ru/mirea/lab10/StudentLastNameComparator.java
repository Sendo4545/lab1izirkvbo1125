package ru.mirea.lab10;
import java.util.Comparator;
public class StudentLastNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        return s1.getLastName().compareTo(s2.getLastName());
    }
}
