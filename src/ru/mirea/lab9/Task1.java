package ru.mirea.lab9;

public class Task1 {
    public static void InsertionSort(Students[] list){
        for (int i = 1; i < list.length; i++){
            Students student = list[i];
            int j = i - 1;
            while (j >= 0 && list[j].getId() > student.getId()){
                list[j + 1] = list[j];
                j --;
            }
            list[j+1] = student;
        }
    }

    public static void main(String[] args) {
        Students [] students = {
                new Students("Артур",27,4.5),
                new Students("Дима",44,4.8),
                new Students("Стас",15,3.5)
        };
        InsertionSort(students);
        for (Students s : students){
            System.out.println(s);
        }
    }
}
