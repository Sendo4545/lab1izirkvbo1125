package ru.mirea.lab2;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args){
        String[] array = {"1", "2", "3", "4", "5"};
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
