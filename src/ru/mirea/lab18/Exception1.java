package ru.mirea.lab18;


public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
    public void exceptionDemoDouble() {
        // При делении 2.0 / 0.0 исключение НЕ выбрасывается!
        System.out.println(2.0 / 0.0);
    }
}




