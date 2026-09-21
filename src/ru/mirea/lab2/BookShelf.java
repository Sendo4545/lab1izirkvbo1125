package ru.mirea.lab2;
import java.util.Arrays;
import java.util.Comparator;

public class BookShelf {
    private Book[] books;
    private int count;

    public BookShelf(int capacity) {
        this.books = new Book[capacity];
        this.count = 0;
    }

    public void addBook(Book b) {
        if (count < books.length) {
            books[count++] = b;
        }
    }

    public Book getLatestBook() {
        if (count == 0) return null;
        Book latest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > latest.getYear()) {
                latest = books[i];
            }
        }
        return latest;
    }

    public Book getEarliestBook() {
        if (count == 0) return null;
        Book earliest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() < earliest.getYear()) {
                earliest = books[i];
            }
        }
        return earliest;
    }

    public void sortBooksByYear() {
        Arrays.sort(books, 0, count, Comparator.comparingInt(Book::getYear));
    }

    public void printShelf() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
