package ru.mirea.lab3;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while (true) {
            System.out.print("Введите размер массива: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.println("Ошибка! Введено неподходящее число. Попробуйте снова.");
        }
        int[] firstArray = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            firstArray[i] = rand.nextInt(n + 1);
        }
        System.out.println("Первый массив: " + Arrays.toString(firstArray));
        int evenCount = 0;
        for (int num : firstArray) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        if (evenCount == 0) {
            System.out.println("Чётных элементов в первом массиве нет.");
        } else {
            // 2. Создаем второй массив точного размера
            int[] secondArray = new int[evenCount];
            int index = 0;
            for (int num : firstArray) {
                if (num % 2 == 0) {
                    secondArray[index] = num;
                    index++; // Сдвигаем указатель для следующего чётного числа
                }
            }
            System.out.println("Второй массив: " + Arrays.toString(secondArray));
        }

    }
}
