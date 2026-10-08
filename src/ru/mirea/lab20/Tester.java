package ru.mirea.lab20;

public class Tester {
    public static void main(String[] args) {
        Dog dog = new Dog("Гена");
        GenericTriple<String, Dog, Integer> triple = new GenericTriple<>("Тест", dog, 42);
        System.out.println(triple.getT());
        System.out.println(triple.getV());
        System.out.println(triple.getK());
        triple.PrintClasses();

    }
}
