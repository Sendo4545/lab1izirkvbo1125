package ru.mirea.lab24;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex c1 = factory.createComplex(4,2);
        Complex c2 = factory.createComplex(5,-6);
        Complex c3 = factory.createComplex();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
