package ru.mirea.lab1;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        System.out.println("Укажите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] massive = new int[n];
        System.out.println("Введите значения элементов массива: ");
        for(int i=0; i<n; i++) {
            massive[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += massive[i];
        }
        System.out.println("Сумма всех элементов массива = " + sum);
         double avg = (double) sum / n;
        System.out.println("Среднее арифметическое = " + avg);
    }
}
