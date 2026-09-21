package ru.mirea.lab2;

public class CircleTest {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(5.0);
        Circle2 c2 = new Circle2(7.2);

        System.out.println(c1 + ", Длина = " + String.format("%.2f", c1.Length()));
        System.out.println(c2 + ", Длина = " + String.format("%.2f", c2.Length()));

        int comp = c1.vs(c2);
        if (comp < 0) {
            System.out.println("Первая окружность меньше второй.");
        } else if (comp > 0) {
            System.out.println("Первая окружность больше второй.");
        } else {
            System.out.println("Окружности равны.");
        }
    }
}
