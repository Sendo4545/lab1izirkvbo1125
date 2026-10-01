package ru.mirea.lab4.lab4_1;

public abstract class Furniture {
    private String material;
    private double price;
    public Furniture(String material, double price) {
        this.material = material;
        this.price = price;
    }
    public String getMaterial() {return material;}
    public double getPrice() {return price;}
    public abstract String getFurnitureType();

    @Override
    public String toString(){
        return String.format("%s [Материал: %s, цена: %.2f руб", getFurnitureType(), material, price);
    }
}

class Table extends Furniture{
    private int legs;
    public Table(String material, double price, int legs) {
        super(material, price);
        this.legs = legs;
    }
    @Override
    public String getFurnitureType() {
        return "Стол";
    }
    @Override
    public String toString(){
        return super.toString() + ",количество ножек: " + legs + "]";
    }
}
class Chair extends Furniture{
    private boolean withWheels;
    public Chair(String material, double price, boolean withWheels) {
        super(material, price);
        this.withWheels = withWheels;
    }
    @Override
    public String getFurnitureType() {
        return "Стул";
    }
    @Override
    public String toString(){
        return super.toString() + ", " + (withWheels ? "с колёсиками" : "без колёсиков") + "]";
    }
}
