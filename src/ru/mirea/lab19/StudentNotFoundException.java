package ru.mirea.lab19;
import java.lang.Exception;
public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
