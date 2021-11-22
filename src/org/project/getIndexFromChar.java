package org.project;

import java.util.Scanner;

public class getIndexFromChar {

    public static char[] getScanner () {              // Ввод символов
        System.out.println("Введите символы без пробела: ");
        Scanner scanner = new Scanner(System.in);
        char[] charArr = scanner.next().toCharArray();
        return charArr;
    }

    public static void getIndexFromChar (char[] array) {      // Получение индексов символов
        int[] intArr = new int[array.length];
        System.out.println("Соответствующие значения таблицы ascii DEC: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Символ " + array[i] + ": DEC ASCII - ");
            intArr[i] = array[i];
            System.out.println(intArr[i]);
        }
    }

    public static void main(String[] args) {
        getIndexFromChar(getScanner());
    }

}