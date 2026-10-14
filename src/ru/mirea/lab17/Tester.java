package ru.mirea.lab17;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1. Добавить студента в картотеку");
            System.out.println("2. Удалить студента по имени");
            System.out.println("3. Вывести студента по имени");
            System.out.println("4. Проверить картотеку на пустоту");
            System.out.println("5. Полностью очистить картотеку");
            System.out.println("6. Выйти из программы");
            System.out.print("Выберите пункт меню: ");

            String button = scanner.nextLine();
            switch (button){
                case "1":
                    Student newStudent = new Student();
                    newStudent.readFromConsole();
                    list.addStudent(newStudent);
                    break;
                case "2":
                    String nametoremove = scanner.nextLine();
                    if (list.removeStudent(nametoremove)){
                        System.out.println("Студент успешно удален.");
                    }else{
                        System.out.println("Студент не найден.");
                    }
                    break;
                case "3":
                    System.out.println("Введите имя студента");
                    String name = scanner.nextLine();
                    list.display(name);
                    break;
                case "4":
                    if (list.isEmpty()) {
                        System.out.println("Результат проверки: Картотека пуста.");
                    } else {
                        System.out.println("Результат проверки: В картотеке есть записи.");
                    }
                    break;
                case "5":
                    list.clear();
                    break;
                case "6":
                    return;
                default:
                    System.out.println("Неправильный ввод");
            }
        }
    }
}
