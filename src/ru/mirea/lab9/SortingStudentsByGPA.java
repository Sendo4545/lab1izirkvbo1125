package ru.mirea.lab9;
import java.util.Comparator;
public class SortingStudentsByGPA implements Comparator<Students>{
    @Override
    public int compare(Students s1, Students s2){
        return Double.compare(s2.getGrade(), s1.getGrade());
    }
    public static void quickSort(Students[] array, int low, int high,Comparator<Students> comp){
        if (low < high) {
            int pivotIndex = partition(array, low, high, comp);
            quickSort(array, low, pivotIndex - 1, comp);
            quickSort(array, pivotIndex + 1, high, comp);
        }
    }
    private static int partition(Students[] array, int low, int high, Comparator<Students> comp) {
        Students pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (comp.compare(array[j], pivot) <= 0) {
                i++;
                Students temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        Students temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
    public static void main(String[] args){
        Students [] students = {
                new Students("Артур",27,4.5),
                new Students("Дима",44,4.8),
                new Students("Стас",15,3.5),
                new Students("Ваня",20,4.0),
                new Students("Паша",21,5.0),
        };
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        quickSort(students,0,students.length-1,comparator);
        for (Students s : students) System.out.println(s);
    }
}
