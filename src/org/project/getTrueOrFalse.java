package org.project;

import java.util.Scanner;

public class getTrueOrFalse {

    public static void main(String[] args) {
        System.out.println(getScanner());
    }

    public static int getScanner () {              // Ввод целого числа пользователем
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static boolean getTrueOrFalse (int number){ // Проверка на истинность выражения
        return number % 2 == 0;
    }
}