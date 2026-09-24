package ru.mirea.lab4.lab4_1;

public class FurnitureTest {
    public static void main(String[] args) {
        Furniture[] items = new Furniture[]{
                new Table("Сосна", 6000, 2),
                new Chair("МДФ",5000,false),
                new Chair("Сталь",10000,true)
        };
        FurnitureShop shop = new FurnitureShop(items);
        shop.showCatalog();

    }
}
