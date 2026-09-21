package ru.mirea.lab2;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    // Список для хранения компьютеров
    private ArrayList<String> computers = new ArrayList<>();

    // Метод добавления компьютера
    public void addComputer(String brand, String model, double price) {
        String compInfo = brand + " " + model + " (" + price + " руб.)";
        computers.add(compInfo);
        System.out.println("Компьютер успешно добавлен: " + compInfo);
    }

    // Метод удаления компьютера
    public void removeComputer(String brand, String model) {
        String found = findComputer(brand, model);
        if (found != null) {
            computers.remove(found);
            System.out.println("Компьютер успешно удален.");
        } else {
            System.out.println("Ошибка: Компьютер не найден.");
        }
    }

    // Метод поиска компьютера
    public String findComputer(String brand, String model) {
        String searchKey = (brand + " " + model).toLowerCase();
        for (String comp : computers) {
            if (comp.toLowerCase().startsWith(searchKey)) {
                return comp;
            }
        }
        return null;
    }

    // Главный метод программы
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        System.out.print("Сколько компьютеров добавить в магазин? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        for (int i = 0; i < n; i++) {
            System.out.print("Введите бренд: ");
            String brand = scanner.nextLine();
            System.out.print("Введите модель: ");
            String model = scanner.nextLine();
            System.out.print("Введите цену: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Очистка буфера

            shop.addComputer(brand, model, price);
        }

        System.out.print("Введите бренд ПК: ");
        String searchBrand = scanner.nextLine();
        System.out.print("Введите модель ПК: ");
        String searchModel = scanner.nextLine();
        String result = shop.findComputer(searchBrand, searchModel);
        if (result != null) {
            System.out.println("Результат поиска: " + result);
        } else {
            System.out.println("Такого компьютера нет в магазине.");
        }

        scanner.close();
    }
}

