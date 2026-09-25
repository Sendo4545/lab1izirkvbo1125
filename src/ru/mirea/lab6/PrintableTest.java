package ru.mirea.lab6;

public class PrintableTest {
    public static void main(String[] args) {
        Printable[] items = new Printable[]{
                new Book("Булгаков М.А", "Мастер и Маргарита", 1967),
                new Book("Харлан Эллисон","У меня нет рта, но я должен кричать",1967),
                new Magazines("Наука и жизнь",9),
                new Shop("Читай-город","ул. Перерва, 43 к1"),
        };
        for (Printable item : items){
            item.print();
        }

    }
}
