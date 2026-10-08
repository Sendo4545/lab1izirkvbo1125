package ru.mirea.lab19;

public class Student implements Comparable<Student>{
    private final String fullname;
    private final Double grade;
    public Student(String fullname, Double grade) throws EmptyStringException {
        if (fullname == null || fullname.trim().isEmpty()){
            throw new EmptyStringException("Пустая строка!");
        }
        this.fullname = fullname;
        this.grade= grade;

    }
    public String getFullName() { return fullname; }
    public double getGrade() { return grade; }
    @Override
    public int compareTo(Student other) {
        return Double.compare(other.grade, this.grade);
    }
    @Override
    public String toString() {
        return String.format("Студент: %-30s | Средний балл: %.2f", fullname, grade);
    }
}
