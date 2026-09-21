package ru.mirea.lab3;

public class Report {
    public static void generateReport(Employee[] employees){
        System.out.printf("%-25s %15s%n", "ФИО Сотрудника", "Зарплата");
        System.out.println("--------------------------------------------");
        for (Employee emp : employees) {
            System.out.printf("%-25s %,15.2f%n", emp.getFullname(), emp.getSalary());
        }
    }
}
