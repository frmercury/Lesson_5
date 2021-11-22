package org.project;

import java.util.Scanner;

public class getArrayDuplicates {

    public static int[] getScanner() {                              // Ввод массива
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Введите следующее значение массива: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void getArrayDuplicates(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {               //Сортировка массива
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        System.out.println("Duplicates:");                          //Вывод дубликатов массива
        int last_index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && last_index != arr[j]) {
                    last_index = arr[j];
                    System.out.println(arr[j]);
                }
            }
        }
    }
    public static void main (String[] args){
        getArrayDuplicates(getScanner());
    }
}