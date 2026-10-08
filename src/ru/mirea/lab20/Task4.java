package ru.mirea.lab20;

public class Task4 {
    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 9, 1, 6};
        MinMax<Integer> minMaxInt = new MinMax<>(intArray);
        System.out.println("Минимум в массиве: " + minMaxInt.findMin());
        System.out.println("Максимум в массиве: " + minMaxInt.findMax());

        System.out.println("Сложение: " + Calculator.sum(10, 5.5));
        System.out.println("Умножение: " + Calculator.multiply(3, 2.5));
        System.out.println("Вычитание: " + Calculator.subtraction(15, 5));
        System.out.println("Деление: " + Calculator.divide(10, 4));
    }
}
