package ru.mirea.lab2;
import java.util.Scanner;

public class Shop {
    private String[] computers = new String[100];
    private int count = 0;

    public void addComputer(String brand, String model, double price) {
        if (count >= computers.length) {
            System.out.println("Магазин переполнен, нет свободных мест!");
            return;
        }
        String compInfo = brand + " " + model + " (" + price + " руб.)";
        computers[count] = compInfo;
        count++;
        System.out.println("Компьютер успешно добавлен: " + compInfo);
    }

    public void removeComputer(String brand, String model) {
        int indexToRemove = -1;
        String searchKey = (brand + " " + model).toLowerCase();

        // Ищем, под каким индексом лежит нужный компьютер
        for (int i = 0; i < count; i++) {
            if (computers[i].toLowerCase().startsWith(searchKey)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < count - 1; i++) {
                computers[i] = computers[i + 1];
            }
            computers[count - 1] = null;
            count--;
            System.out.println("Компьютер успешно удален.");
        } else {
            System.out.println("Компьютер не найден.");
        }
    }

    // Метод поиска компьютера
    public String findComputer(String brand, String model) {
        String searchKey = (brand + " " + model).toLowerCase();
        for (int i = 0; i < count; i++) {
            if (computers[i].toLowerCase().startsWith(searchKey)) {
                return computers[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        System.out.print("Сколько компьютеров добавить в магазин? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Введите бренд: ");
            String brand = scanner.nextLine();
            System.out.print("Введите модель: ");
            String model = scanner.nextLine();
            System.out.print("Введите цену: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

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

