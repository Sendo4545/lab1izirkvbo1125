package ru.mirea.lab4.lab4_1;

public class FurnitureShop {
    private Furniture[] shopwindow;
    public FurnitureShop(Furniture[] shopwindow) {
        this.shopwindow = shopwindow;
    }
    public void showCatalog(){
        for (Furniture item : shopwindow){
            System.out.println(item);
        }
    }
}
