package ru.mirea.lab11;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Task1 {
    public static void main(String[] args) {
        String developer = "Иванов";
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2026);
        cal.set(Calendar.MONTH,Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH,24);
        cal.set(Calendar.HOUR_OF_DAY,9);
        cal.set(Calendar.MINUTE,25);
        cal.set(Calendar.SECOND,12);
        Date assigmentDate = cal.getTime();
        Date submissionDate = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Разработчик: " + developer);
        System.out.println("Дата получения задания: " + sdf.format(assigmentDate));
        System.out.println("Дата сдачи задания: " + sdf.format(submissionDate));
    }
}
