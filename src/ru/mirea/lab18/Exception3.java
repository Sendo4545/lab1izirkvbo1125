package ru.mirea.lab18;
import java.util.Scanner;
public class Exception3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        //} catch (Exception e){
            //System.out.println("General exception caught");
            } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введенная строка не является целым числом!");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль недопустимо!");
        }
    }
}
