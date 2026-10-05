package ru.mirea.lab6;

public class Magazines implements Printable {
    private final int number;
    private final String name;
    public Magazines(String name,int number){
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.printf("Журнал: %s (Выпуск №%d)\n", name, number);
    }
}
