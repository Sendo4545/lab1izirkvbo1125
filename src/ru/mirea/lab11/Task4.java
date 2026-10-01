package ru.mirea.lab11;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Task4 {
    public static void main(String[] args){
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
        Calendar userCalendar = new GregorianCalendar(year, month, day, hour, minutes);
        Date userDate = userCalendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm");
        System.out.println("Объект Calendar: " + sdf.format(userCalendar.getTime()));
        System.out.println("Объект Date:     " + userDate.toString());
        scanner.close();
    }

}
