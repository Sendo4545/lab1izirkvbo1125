package ru.mirea.lab4;

public class SeasonTest {
    public static void main(String[] args) {
        Season myfav = Season.Spring;
        System.out.println("Мое любимое время года: " + myfav);
        System.out.println("Температура: " + myfav.getSeasonTemp() + "°C");
        System.out.println("Описание: " + myfav.getDescription());
        SeasonMessage(myfav);
        for (Season season: Season.values()) {
            System.out.printf("%s: средняя температура = %dC. Описание: %s\n", season, season.getSeasonTemp(), season.getDescription());
        }
    }

    public static void SeasonMessage(Season season) {
        switch (season) {
            case Winter: System.out.println("Я люблю зиму!"); break;
            case Summer: System.out.println("Я люблю лето!"); break;
            case Spring: System.out.println("Я люблю весну!"); break;
            case Autumn: System.out.println("Я люблю осень!"); break;
        }
    }

}
