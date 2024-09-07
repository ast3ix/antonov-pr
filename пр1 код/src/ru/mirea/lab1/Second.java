package ru.mirea.lab1;
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        System.out.println("Укажите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] massive = new int[n];
        System.out.println("Введите значения элементов массива: ");
        for (int i = 0; i < n; i++) {
            massive[i] = sc.nextInt();
        }
        int sum = 0;
        int j = 0;
        while (j < n) {
            sum += massive[j];
            j++;
        }
        System.out.println("Сумма всех элементов массива = " + sum);
        int min = massive[0];
        int max = massive[0];
        for (int i = 0; i < n; i++) {
            if (massive[i] < min) {
                min = massive[i];
            }
        }
        System.out.println("Минимальный элемент = " + min);
        for (int i = 0; i < n; i++) {
            if (massive[i] > max) {
                max = massive[i];
            }
        }
        System.out.println("Максимальный элемент = " + max);
    }
}