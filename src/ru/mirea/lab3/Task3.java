package ru.mirea.lab3;
import java.util.Random;

public class Task3 {
    public static void main(String[] args){
        int[] array = new int[4];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(90) + 10;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        boolean isIncreasing = true;
        for (int i = 1; i < array.length; i ++){
            if(array[i] <= array[i-1]){
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив НЕ является строго возрастающей последовательностью.");
        }
    }
}
