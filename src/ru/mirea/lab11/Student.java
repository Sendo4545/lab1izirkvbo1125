package ru.mirea.lab11;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int iDNumber;
    private double grade;

    public Student(String firstName, String lastName, Date birthDate,int iDNumber, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.iDNumber = iDNumber;
        this.grade = grade;
    }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getIDNumber() { return iDNumber; }
    public double getGrade() { return grade; }
    public String getFormattedBirthDate(String formatType){
        String pattern;
        switch (formatType.toLowerCase()){
            case "short":
                pattern = "dd.MM.yy";
                break;
            case "medium":
                pattern = "dd MMM yyyy";
                break;
            case "full":
                pattern = "EEEE, d MMMM yyyy";
                break;
            default:
                pattern = "dd.MM.yyyy";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(birthDate);
    }

    @Override
    public String toString(){
        return lastName + " " + firstName + " родился " + getFormattedBirthDate("full");
    }
}
