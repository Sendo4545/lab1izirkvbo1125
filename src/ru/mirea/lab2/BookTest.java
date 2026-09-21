package ru.mirea.lab2;

public class BookTest {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf(3);
        shelf.addBook(new Book("Пушкин", "Капитанская дочка", 1836));
        shelf.addBook(new Book("Толстой", "Война и мир", 1869));
        shelf.addBook(new Book("Достоевский", "Преступление и наказание", 1866));

        System.out.println("Самая ранняя книга: " + shelf.getEarliestBook());
        System.out.println("Самая поздняя книга: " + shelf.getLatestBook());

        shelf.sortBooksByYear();
        shelf.printShelf();
    }
}

