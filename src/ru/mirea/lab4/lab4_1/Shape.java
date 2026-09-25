package ru.mirea.lab4.lab4_1;

public class Shape {
    private String color;
    private boolean filled;
    public Shape() {
        this.color = "Black";
        this.filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getType() {
        return "Фигура";
    }
    public double getArea() {
        return 0.0;
    }
    public double getPerimeter() {
        return 0.0;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString(){
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
