package ru.mirea.lab3;

public class Circle {
    private Point center;
    private double radius;
    private double length;

    public Circle(double x, double y, double radius) {
        this.center = new Point(x, y);
        this.radius = radius;
        this.length = 2 * Math.PI * radius;
    }

    public double getRadius() { return radius; }

    @Override
    public String toString() {
        return String.format("Окружность[Центр: %s, R: %.2f, Длина: %.2f]", center, radius, length);
    }
}

