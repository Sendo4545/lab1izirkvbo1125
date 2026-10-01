package ru.mirea.lab13;

public class Shirt {
    private final String id, model, color, size;
    public Shirt(String id, String model, String color, String size) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.size = size;
    }
    @Override
    public String toString() {
        return
                "ID: " + id + "\n" +
                "Модель: " + model + "\n" +
                "Цвет: " + color + "\n" +
                "Размер: " + size + "\n";
    }
    public static void main(String[] args){
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt [] Shirst = new Shirt[shirts.length];
        for (int i = 0; i < shirts.length;i++){
            String[] token = shirts[i].split(",");
            Shirst[i] = new Shirt(token[0],token[1],token[2],token[3]);
        }
        for (Shirt s : Shirst){
            System.out.println(s);
        }
    }
}
