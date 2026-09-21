package ru.mirea.lab2;
import java.util.Scanner;
import java.util.Random;

public class Poker {
    public static void main(String[] args){
        String[] suits = {"Пики", "Черви", "Бубны", "Трефы"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = scanner.nextInt();
        if (n < 1 || n * 5 > 52) {
            System.out.println("Неверное количество игроков или карт на всех не хватит!");
            return;
        }
        String[] deck = new String[52];
        int ind = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[ind++] = rank + " " + suit;
            }
        }
        Random random = new Random();
        for (int i = 0; i < 52; i++) {
            int r = i + random.nextInt(52 - i);
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        int cardind = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Игрок " + i + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println("  " + deck[cardind++]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
