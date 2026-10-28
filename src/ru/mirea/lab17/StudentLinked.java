package ru.mirea.lab17;

import java.util.Scanner;

public class StudentLinked {
    private String name;
    private int age;
    public StudentLinked next;
    public StudentLinked prev;

    public StudentLinked() {
        this.name = "";
        this.age = 0;
        this.next = null;
        this.prev = null;
    }
    public void readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя студента: ");
        this.name = scanner.nextLine();

        System.out.print("Введите возраст студента: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число для возраста: ");
            scanner.next();
        }
        this.age = scanner.nextInt();
    }
    public void printToConsole() {
        System.out.println("Студент " + name + " | Возраст: " + age);
    }
    public String getName() {
        return name;
    }
}
