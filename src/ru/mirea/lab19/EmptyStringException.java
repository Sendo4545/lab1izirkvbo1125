package ru.mirea.lab19;
import java.lang.Exception;
public class EmptyStringException extends IllegalArgumentException {
    public EmptyStringException(String message) {
        super(message);
    }
}
