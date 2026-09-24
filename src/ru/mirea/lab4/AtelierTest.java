package ru.mirea.lab4;

public class AtelierTest {
    public static void main(String[] args){
        Clothes[] wardrobe = new Clothes[]{
                new Tshirt(Sizes.XXS,1200,"чёрный"),
                new Pants(Sizes.L,1500,"белый"),
                new Skirt(Sizes.S, 2000, "красный"),
                new Tie(Sizes.XS,2500, "синий")
        };
        Atelier atelier = new Atelier();
        atelier.dressMan(wardrobe);
        atelier.dressWomen(wardrobe);
    }
}
