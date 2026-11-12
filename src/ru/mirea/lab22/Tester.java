package ru.mirea.lab22;

public class Tester {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int passed = 0;
        int failed = 0;
        try {
            double res = calc.RPN("2 3 +");
            if (res == 5.0) { System.out.println("Тест 1: пройден"); passed++; }
            else { System.out.println("Тест 1: провален"); failed++; }
        } catch (Exception e) { System.out.println("Тест 1: ошибка (" + e.getMessage() + ")"); failed++; }
        try {
            double res = calc.RPN("2 3 * 4 5 * +");
            if (res == 26.0) { System.out.println("Тест 2: пройден"); passed++; }
            else { System.out.println("Тест 2: провален"); failed++; }
        } catch (Exception e) { System.out.println("Тест 2: ошибка"); failed++; }
        try {
            calc.RPN("1 2 + *");
            System.out.println("Тест 3 : провал (ошибка пропущена)");
            failed++;
        } catch (Calc.EmptyStackException e) {
            System.out.println("Тест 3 : пройден. Перехвачено: " + e.getMessage());
            passed++;
        } catch (Exception e) {
            System.out.println("Тест 3: провал. Не то исключение: " + e.getClass().getName());
            failed++;
        }
        try {
            calc.RPN("5 0 /");
            System.out.println("Тест 4 : провал");
            failed++;
        } catch (ArithmeticException e) {
            System.out.println("Тест 4 : пройден. Перехвачено: " + e.getMessage());
            passed++;
        } catch (Exception e) {
            System.out.println("Тест 4: провал. Не то исключение: " + e.getClass().getName());
            failed++;
        }
        try {
            calc.RPN("5 5 5 +");
            System.out.println("Тест 5 : провал");
            System.out.println(calc.RPN("5 5 5 +"));
            failed++;
        } catch (IllegalArgumentException e) {
            System.out.println("Тест 5: пройден. Перехвачено: " + e.getMessage());
            passed++;
        } catch (Exception e) {
            System.out.println("Тест 5: провал. Не то исключение: " + e.getClass().getName());
            failed++;
        }
        System.out.println("Всего тестов пройдено: " + passed);
        System.out.println("Всего тестов провалено: " + failed);
    }
}
