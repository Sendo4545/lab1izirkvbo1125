package ru.mirea.lab1;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 9, 23, 7, 4, 18};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.println("Сумма элементов массива = " + sum);
        System.out.println("Среднее арифметическое = " + average);
    }
}

