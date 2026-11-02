package ru.mirea.lab28;
import java.util.HashSet;
import java.util.TreeSet;
public class task1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Джава");
        set.add("Хэши");
        set.add("Дерево");
        System.out.println("Оригинальный HashSet: " + set);
        TreeSet<String> treeSet = new TreeSet<String>(set);
        System.out.println("Новый TreeSet: "+ treeSet);

    }
}
