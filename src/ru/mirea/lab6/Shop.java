package ru.mirea.lab6;

public class Shop implements Printable{
    private final String name;
    private final String address;
    public Shop(String name, String address){
        this.name = name;
        this.address = address;
    }

    @Override
    public void print() {
        System.out.printf("Магазин: %s по адресу %s\n", name, address);
    }
}
