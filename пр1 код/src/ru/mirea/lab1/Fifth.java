package ru.mirea.lab1;
import java.util.Scanner;
public class Fifth {
    public static int factorial(int x) {
        int y = 1;
        for (int i = 1; i <= x; i++) {
            y *= i;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println("Введите число для расчета факториала: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial = factorial(number);
        System.out.println("Факториал этого числа равен " + factorial);
    }
}

