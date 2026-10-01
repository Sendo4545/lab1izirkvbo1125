package ru.mirea.lab11;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
public class Task5 {
    public static void main(String[] args) {
        int operationsCount = 5000;
        Student testStudent = new Student("Артур", "Изирбеков", new Date(), 25, 5.0);
        Student findStudent = new Student("Дмитрий", "Сухов", new Date(), 13, 5.0);
        long startTime = System.nanoTime();
        Student[] array = new Student[operationsCount];
        Arrays.fill(array, testStudent);
        long arrayAddTime = System.nanoTime() - startTime;
        array[operationsCount / 2] = findStudent;
        long startArraySearch = System.nanoTime();
        for (Student s : array) {
            if (s.getLastName().equals("Сухов")) {
                break;
            }
        }
        long arraySearchTime = System.nanoTime() - startArraySearch;
        long startArrayDelete = System.nanoTime();
        int deleteIndex = operationsCount / 2;
        for (int i = deleteIndex; i < operationsCount - 1; i++) {
            array[i] = array[i + 1];
        }
        array[operationsCount - 1] = null;
        long arrayDeleteTime = System.nanoTime() - startArrayDelete;
        LinkedList<Student> linkedList = new LinkedList<>();
        long startListAdd = System.nanoTime();
        for (int i = 0; i < operationsCount; i++) {
            linkedList.add(testStudent);
        }
        long listAddTime = System.nanoTime() - startListAdd;
        linkedList.set(operationsCount / 2, findStudent);
        long startListSearch = System.nanoTime();
        for (Student s : linkedList) {
            if (s.getLastName().equals("Сухов")) {
                break;
            }
        }
        long listSearchTime = System.nanoTime() - startListSearch;
        long startListDelete = System.nanoTime();
        linkedList.remove(operationsCount / 2);
        long listDeleteTime = System.nanoTime() - startListDelete;
        System.out.println("РЕЗУЛЬТАТЫ ЗАМЕРОВ (в наносекундах)");
        System.out.printf("%-20s | %-18s | %-18s%n", "Операция", "Обычный Массив", "Встроенный LinkedList");
        System.out.printf("%-20s | %,18d | %,18d%n", "Добавление (Add)", arrayAddTime, listAddTime);
        System.out.printf("%-20s | %,18d | %,18d%n", "Поиск (Search)", arraySearchTime, listSearchTime);
        System.out.printf("%-20s | %,18d | %,18d%n", "Удаление (Delete)", arrayDeleteTime, listDeleteTime);

    }
}
