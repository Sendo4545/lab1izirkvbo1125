package ru.mirea.lab3;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int capacity) {
        this.circles = new Circle[capacity];
        this.count = 0;
    }
    public void addCircle(Circle c) {
        if (count < circles.length) {
            circles[count++] = c;
        }
    }
    public Circle Min() {
        if (count == 0) return null;
        Circle min = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() < min.getRadius()) {
                min = circles[i];
            }
        }
        return min;
    }
    public Circle Max() {
        if (count == 0) return null;
        Circle max = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() > max.getRadius()) {
                max = circles[i];
            }
        }
        return max;
    }
    public void sortCircles() {
        Arrays.sort(circles, 0, count, Comparator.comparingDouble(Circle::getRadius));
    }

    public void printCircles() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }
    public static void main(String[] args) {
        Random rand = new Random();
        Tester tester = new Tester(4);

        // Инициализация полей случайными числами
        for (int i = 0; i < 4; i++) {
            double x = rand.nextDouble() * 10;
            double y = rand.nextDouble() * 10;
            double radius = rand.nextDouble() * 5 + 1; // Радиус от 1 до 6
            tester.addCircle(new Circle(x, y, radius));
        }

        tester.printCircles();

        System.out.println("\nСамая маленькая: " + tester.Min());
        System.out.println("Самая большая: " + tester.Max());

        System.out.println("\nОтсортированные окружности:");
        tester.sortCircles();
        tester.printCircles();
    }
}
