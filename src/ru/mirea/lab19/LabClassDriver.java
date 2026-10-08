package ru.mirea.lab19;

public class LabClassDriver {
    public static void main(String[] args) {
        LabClass lab = new LabClass();
        lab.addStudent(new Student("Изирбеков А.М",4.5));
        lab.addStudent(new Student("Изирбеков М.К",5.0));
        lab.addStudent(new Student("Иванов И.И",3.0));
        LabClassUI UI = new LabClassUI(lab);
        UI.menuLoop();
    }
}
