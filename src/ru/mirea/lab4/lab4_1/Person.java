package ru.mirea.lab4.lab4_1;

public class Person {
    private String fullname;
    private int age;
    public Person() {
        this.fullname = "Неизвестный";
        this.age = 18;
    }
    public Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }
    public void move(){
        System.out.println(fullname + " двигается.");
    }
    public void talk(){
        System.out.println(fullname + " говорит.");
    }
}
