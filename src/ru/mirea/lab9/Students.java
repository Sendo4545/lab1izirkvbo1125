package ru.mirea.lab9;

public class Students implements Comparable<Students> {
    private String StName;
    private int id;
    private double grade;
    public Students(String StName, int id, double grade){
        this.StName = StName;
        this.id = id;
        this.grade = grade;
    }
    public String getStName(){
        return StName;
    }
    public int getId(){
        return id;
    }
    public double getGrade(){
        return grade;
    }
    @Override
    public int compareTo(Students other) {
        return Integer.compare(this.id, other.id);
    }
    @Override
    public String toString(){
        return String.format("Студент %s : id - %d, балл - %.1f", StName,id,grade);
    }
}
