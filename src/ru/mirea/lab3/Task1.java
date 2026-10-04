package ru.mirea.lab3;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args){
        int size = 5;
        double[] array1 = new double[size];
        for (int i = 0; i < size; i++) {
            array1[i] = Math.random() * 100; 
        }
        System.out.println("Массив 1 до сортировки:");
        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Массив 1 после сортировки:");
        System.out.println(Arrays.toString(array1) + "\n");

        Random random = new Random();
        double[] array2 = new double[size];
        for (int i = 0; i < size; i++) {
            array2[i] = random.nextDouble() * 100;
        }
        System.out.println("Массив 2 до сортировки:");
        System.out.println(Arrays.toString(array2));

        Arrays.sort(array2);
        System.out.println("Массив 2 после сортировки:");
        System.out.println(Arrays.toString(array2));
    }
}
