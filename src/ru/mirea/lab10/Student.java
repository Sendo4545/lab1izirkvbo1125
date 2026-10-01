package ru.mirea.lab10;

public class Student {
    private String firstName;
    private String lastName;
    private String major;
    private int course;
    private String group;
    private double grade;
    public Student(String firstName, String lastName, String major, int course, String group, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.course = course;
        this.group = group;
        this.grade = grade;
    }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
    public int getCourse() { return course; }
    public void setCourse(int course) { this.course = course; }
    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }
    public double getGrade() { return grade; }
    public void setGrade(double grade) { this.grade = grade; }
    @Override
    public String toString(){
        return String.format("%s %s : курс - %d, группа - %s, специальность - %s, балл - %.1f",lastName, firstName, course, group, major, grade);
    }
}
