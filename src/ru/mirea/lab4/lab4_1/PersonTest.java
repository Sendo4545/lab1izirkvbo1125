package ru.mirea.lab4.lab4_1;

public class PersonTest {
    public static void main(String[] args) {
        Person testuser1 = new Person();
        Person testuser2 = new Person("EvilArthas", 35);
        testuser1.talk();
        testuser1.move();
        testuser2.talk();
        testuser2.move();
    }
}
