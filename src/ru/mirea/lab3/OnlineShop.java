package ru.mirea.lab3;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {"Ноутбук", "Смартфон", "Наушники"};
        double[] pricesInRub = {75000.00, 35000.50, 4500.00};

        System.out.println("Доступные товары:");
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%d. %s — %,.2f руб.%n", (i + 1), products[i], pricesInRub[i]);
        }

        System.out.print("\nВыберите номер товара для покупки");
        int choice = scanner.nextInt();
        if (choice < 1 || choice > products.length) {
            System.out.println("Такого товара нет");
            return;
        }

        double PriceRub = pricesInRub[choice - 1];

        System.out.print("Выберите валюту для оплаты (RUB или USD): ");
        String chosenCurrency = scanner.next().trim();
        if (!chosenCurrency.equalsIgnoreCase("RUB") && !chosenCurrency.equalsIgnoreCase("USD")) {
            System.out.println("Данная валюта не поддерживается");
            return;
        }

        double finalPriceConverted = Converter.convert(PriceRub, "RUB", chosenCurrency);


        System.out.printf("Выбранный товар: %s%n", products[choice - 1]);
        System.out.println("Итого к оплате: " + finalPriceConverted);

        scanner.close();
    }
}