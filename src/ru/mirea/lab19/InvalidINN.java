package ru.mirea.lab19;
import java.lang.Exception;
public class InvalidINN extends Exception {
    public InvalidINN(String message) {
        super(message);
    }
}
