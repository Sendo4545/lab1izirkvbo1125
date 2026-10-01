package ru.mirea.lab11;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год (например, 2026): ");
        int year = scanner.nextInt();
        System.out.print("Введите номер месяца (1 - 12): ");
        int month = scanner.nextInt() -1 ;
        System.out.print("Введите день месяца (1 - 31): ");
        int day = scanner.nextInt();
        System.out.print("Введите часы: ");
        int hour = scanner.nextInt();
        System.out.print("Введите минуты: ");
        int minutes = scanner.nextInt();
        System.out.print("Введите секунды: ");
        int seconds = scanner.nextInt();
        Calendar userCalendar = new GregorianCalendar(year, month, day,hour,minutes,seconds);
        Date userDate = userCalendar.getTime();
        Date cur = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss");
        System.out.println("\nВаша дата: " + sdf.format(userDate));
        System.out.println("Текущее время системы: " + sdf.format(cur));
        if (userDate.before(cur)){
            System.out.println("Введенная вами дата находится в ПРОШЛОМ относительно системного времени.");
        } else if (userDate.after(cur)) {
            System.out.println("Введенная вами дата находится в БУДУЩЕМ относительно системного времени.");
        }
        else{
            System.out.println("Введенная дата совпадает с системным временем.");
        }
        scanner.close();
    }

}
