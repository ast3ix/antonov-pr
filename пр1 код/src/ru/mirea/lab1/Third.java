package ru.mirea.lab1;
import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        for (int i = 1; i < args.length; i++) {
            System.out.println("Аргумент с индексом " + i + ": " + args[i]);
        }
    }
}