package ru.mirea.lab4;

public enum Sizes {
    XXS(32){
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    private final int  euroSize;
    private Sizes (int  euroSize) {
        this. euroSize =  euroSize;
    }
    public int getEuroSize(){
        return this.euroSize;
    }
    public String getDescription() {
        return "Взрослый размер";
    }

}
interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWomen();
}
abstract class Clothes {
    private final Sizes size;
    private final double cost;
    private final String color;
    public Clothes(Sizes size, double cost, String color){
        this.size = size;
        this.cost = cost;
        this.color = color;

    }
    public Sizes getSize() { return size; }
    public double getCost() { return cost; }
    public String getColor() { return color; }
}
class Tshirt extends Clothes implements MenClothing, WomenClothing{
    public Tshirt(Sizes size, double cost, String color) {
        super(size, cost, color);
    }
    @Override
    public void dressMan() { System.out.println("Мужская футболка -> " + this); }

    @Override
    public void dressWomen() { System.out.println("Женская футболка -> " + this); }

    @Override
    public String toString() {
        return String.format("Размер: %s (%d, %s), Цена: %.2f руб, Цвет: %s",
                getSize(), getSize().getEuroSize(), getSize().getDescription(), getCost(), getColor());
    }
}
class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() { System.out.println("Мужские штаны -> " + this); }

    @Override
    public void dressWomen() { System.out.println("Женские штаны -> " + this); }

    @Override
    public String toString() {
        return String.format("Размер: %s (%d, %s), Цена: %.2f руб, Цвет: %s",
                getSize(), getSize().getEuroSize(), getSize().getDescription(), getCost(), getColor());
    }
}

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() { System.out.println("Юбка -> " + this); }

    @Override
    public String toString() {
        return String.format("Размер: %s (%d, %s), Цена: %.2f руб, Цвет: %s",
                getSize(), getSize().getEuroSize(), getSize().getDescription(), getCost(), getColor());
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() { System.out.println("Галстук -> " + this); }

    @Override
    public String toString() {
        return String.format("Размер: %s (%d, %s), Цена: %.2f руб, Цвет: %s",
                getSize(), getSize().getEuroSize(), getSize().getDescription(), getCost(), getColor());
    }
}
class Atelier {
    public void dressWomen(Clothes[] clothesArray) {
        System.out.println("ОДЕВАЕМ ЖЕНЩИНУ");
        for (Clothes item : clothesArray) {
            if (item instanceof WomenClothing) {
                ((WomenClothing) item).dressWomen();
            }
        }
    }

    public void dressMan(Clothes[] clothesArray) {
        System.out.println("ОДЕВАЕМ МУЖЧИНУ");
        for (Clothes item : clothesArray) {
            if (item instanceof MenClothing) {
                ((MenClothing) item).dressMan();
            }
        }
    }
}