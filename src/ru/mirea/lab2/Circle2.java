package ru.mirea.lab2;

public class Circle2 {
    private double radius;

    public Circle2(double radius){
        this.radius = radius;
    }
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
    public double Area() {
        return Math.PI * radius * radius;
    }
    public double Length() {
        return 2 * Math.PI * radius;
    }
    public int vs(Circle2 other) {
        return Double.compare(this.radius, other.radius);
    }
    @Override
    public String toString() {
        return "Окружность [R=" + radius + ", S=" + String.format("%.2f", Area()) + "]";
    }
}
