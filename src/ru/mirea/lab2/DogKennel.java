package ru.mirea.lab2;
import java.util.ArrayList;

public class DogKennel {
    private Dog[] kennel = new Dog[50];
    private int dogCount = 0;
    public void addDogs(Dog... newDogs) {
        for (Dog d : newDogs) {
            kennel.add(d);
        }
    }
    public void printDogs() {
        System.out.println("Список собак в питомнике:");
        for (Dog d : kennel) {
            System.out.println(d);
        }
    }
    public static void main(String[] args) {
        DogKennel kennel = new DogKennel();
        Dog d1 = new Dog("Рекс", 3);
        Dog d2 = new Dog("Тузик", 5);

        kennel.addDogs(d1, d2);
        kennel.printDogs();
    }
}
