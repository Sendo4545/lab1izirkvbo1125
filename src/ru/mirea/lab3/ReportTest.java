package ru.mirea.lab3;

public class ReportTest {
    public static void main(String[] args){
        Employee[] staff = {new Employee("Изирбеков Артур Маратович", 80000.00),new Employee("Нориаки Какеин Анатольевич", 70000.20), new Employee("Илья Yatoro Мулярчук", 120000.00)};
        Report.generateReport(staff);
    }
}
