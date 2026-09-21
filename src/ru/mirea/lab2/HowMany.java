package ru.mirea.lab2;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String input = scanner.nextLine().trim();
        if (input.isEmpty()) {
            System.out.println("Колиство слов = 0");
        } else {
            String[] words = input.split("\\s+");
            System.out.println("Количество слов = " + words.length);
        }

        scanner.close();
    }
}
