package ru.mirea.lab21;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static <E> List<E> converter(E[] array){
        List<E> list = new ArrayList<>();
        for (E e: array) list.add(e);
        return list;
    }
    public static void main(String[] args){
        String[] stringArray = {"Джава", "Дженерики", "Стирание типов"};
        List<String> stringList = converter(stringArray);
        System.out.println("Список строк: " + stringList);
    }

}
