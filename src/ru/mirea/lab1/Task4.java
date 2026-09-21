package ru.mirea.lab1;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        Scanner sc = new
                Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Введите " + size + " целых чисел:");
        for (int i = 0; i < size; i++){
            nums[i] = sc.nextInt();
        }
        int sum1 = 0;
        int sum2 = 0;
        int maxx = -30;
        int mini = 1000;
        int i = 0;
        int j = 0;
        while(i < size){
            sum1 += nums[i];
            i++;
        }
        do{
            sum2 += nums[j];
            j++;
        }while(j < size);
        for (int m = 0; m < size; m++) {
            if (nums[m] > maxx) {
                maxx = nums[m];
            }
            if (nums[m] < mini) {
                mini = nums[m];
            }
        }
        System.out.println("\n--- Результаты ---");
        System.out.println("Сумма (через while): " + sum1);
        System.out.println("Сумма (через do-while): " + sum2);
        System.out.println("Максимальный элемент: " + maxx);
        System.out.println("Минимальный элемент: " + mini);
        sc.close();
    }
}
