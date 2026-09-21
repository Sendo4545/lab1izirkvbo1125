package ru.mirea.lab2;

public class DogKennel {
    private Dog[] kennel = new Dog[50];
    private int dogCount = 0;
    public void addDogs(Dog... newDogs) {
        for (Dog d : newDogs) {
            if (dogCount >= kennel.length) {
                System.out.println("Питомник переполнен! Не удалось добавить: " + d.getName());
                break;
            }
            kennel[dogCount] = d;
            dogCount++;
        }
    }
    public void printDogs() {
        System.out.println("Список собак в питомнике (Всего: " + dogCount + "):");
        for (int i = 0; i < dogCount; i++) {
            System.out.println(kennel[i]);
        }
    }

    public static void main(String[] args) {
        DogKennel kennel = new DogKennel();

        Dog d1 = new Dog("Рекс", 3);
        Dog d2 = new Dog("Шарик", 5);
        Dog d3 = new Dog("Бобик", 2);
        kennel.addDogs(d1, d2, d3);
        kennel.printDogs();
    }
}