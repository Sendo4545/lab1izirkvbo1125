package ru.mirea.lab10;

import ru.mirea.lab9.Students;

import java.util.Comparator;

public class SortingStudentsByGPA {
    private Student[] iDNumber;
    public void setArray(Student[] students){
        this.iDNumber = students;
    }
    public void outArray() {
        for (Student s : iDNumber) {
            System.out.println(s);
        }
    }
    public void quickSort(int low, int high, Comparator<Student> comp) {
        if (low < high) {
            int pivotIndex = partition(low, high, comp);
            quickSort(low, pivotIndex - 1, comp);
            quickSort(pivotIndex + 1, high, comp);
        }
    }

    private int partition(int low, int high, Comparator<Student> comp) {
        Student pivot = iDNumber[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (comp.compare(iDNumber[j], pivot) < 0) {
                i++;
                Student temp = iDNumber[i];
                iDNumber[i] = iDNumber[j];
                iDNumber[j] = temp;
            }
        }
        Student temp = iDNumber[i + 1];
        iDNumber[i + 1] = iDNumber[high];
        iDNumber[high] = temp;
        return i + 1;
    }
    public void mergeSort(int left, int right, Comparator<Student> comp) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(left, mid, comp);
            mergeSort(mid + 1, right, comp);
            merge(left, mid, right, comp);
        }
    }
    private void merge(int left, int mid, int right, Comparator<Student> comp) {
        int n1 = mid - left + 1;
        int n2 = right - left - n1 + 1; // Точный размер правой части

        Student[] leftArr = new Student[n1];
        Student[] rightArr = new Student[n2];

        for (int i = 0; i < n1; i++) leftArr[i] = iDNumber[left + i];
        for (int j = 0; j < n2; j++) rightArr[j] = iDNumber[mid + 1 + j];

        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (comp.compare(leftArr[i], rightArr[j]) <= 0) {
                iDNumber[k++] = leftArr[i++];

            } else {
                iDNumber[k++] = rightArr[j++];
            }
        }
        while (i < n1) iDNumber[k++] = leftArr[i++];
        while (j < n2) iDNumber[k++] = rightArr[j++];
    }
    public static Student[] mergeTwoLists(Student[] list1, Student[] list2, Comparator<Student> comp) {
        Student[] combined = new Student[list1.length + list2.length];
        int i = 0, j = 0, k = 0;
        while (i < list1.length && j < list2.length) {
            if (comp.compare(list1[i], list2[j]) <= 0) {
                combined[k++] = list1[i++];
            } else {
                combined[k++] = list2[j++];
            }
        }
        while (i < list1.length) combined[k++] = list1[i++];
        while (j < list2.length) combined[k++] = list2[j++];
        return combined;
    }
    public static void main(String[] args){
        SortingStudentsByGPA tester = new SortingStudentsByGPA();
        Student[] students = {
                new Student("Артур", "Изирбеков", "ИИИ", 2, "КВБО-1125", 4.5),
                new Student("Дима", "Сухов", "ИИТ", 1, "ВВБО-1225", 4.8),
                new Student("Стас", "Провкин", "ПИ", 3, "КСБО-1525", 3.5),
                new Student("Ваня", "Соломатин", "ИВТ", 2, "ИКБО-1425", 4.0)
        };
        tester.setArray(students);
        tester.outArray();
        System.out.println();
        tester.quickSort(0,students.length -1,new StudentGPAComparator());
        tester.outArray();
        tester.mergeSort(0,students.length -1,new StudentLastNameComparator());
        System.out.println();
        tester.outArray();
        System.out.println();
        Student[] list1 = {
                new Student("Иван", "Иванов", "ИВТ", 2, "КВБО-1125", 4.9),
                new Student("Петр", "Петров", "ПИ", 2, "КВБО-1125", 4.1)
        };
        Student[] list2 = {
                new Student("Александр", "Александров", "ИИТ", 2, "ИКБО-1225", 4.7),
                new Student("Борис", "Борисович", "ИВТ", 2, "ИКБО-1225", 3.8)
        };
        Student [] merged = mergeTwoLists(list1,list2, new StudentLastNameComparator());
        for (Student s : merged){
            System.out.println(s);
        }
    }

}
