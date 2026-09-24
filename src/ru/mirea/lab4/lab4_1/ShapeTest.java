package ru.mirea.lab4.lab4_1;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.0);
        Shape shape2 = new Rectangle(4.0, 2.0);
        Shape shape3 = new Square(6);
        System.out.println("Тип фигуры: " + shape1.getType());
        System.out.printf("Площадь: %.2f\n", shape1.getArea());
        System.out.printf("Периметр: %.2f\n\n", shape1.getPerimeter());
        System.out.println(shape1);

        System.out.println("Тип фигуры: " + shape2.getType());
        System.out.printf("Площадь: %.2f\n", shape2.getArea());
        System.out.printf("Периметр: %.2f\n\n", shape2.getPerimeter());
        System.out.println(shape2);

        System.out.println("Тип фигуры: " + shape3.getType());
        System.out.printf("Площадь: %.2f\n", shape3.getArea());
        System.out.printf("Периметр: %.2f\n", shape3.getPerimeter());
        System.out.println(shape3);
        }

}
