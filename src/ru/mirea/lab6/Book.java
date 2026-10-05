package ru.mirea.lab6;

public class Book implements Printable {
    private final String author;
    private final String name;
    private final int year;
    public Book(String author, String name, int year){
        this.author = author;
        this.name = name;
        this.year = year;
    }
    @Override
    public void print() {
        System.out.println("Книга: " + author + " - " + name + " (" + year + " г.)");
    }
}

