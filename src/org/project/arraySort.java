package org.project;

public class arraySort {

    public static int[] getRandomIntArray() {      // Генерация рандомного массива чисел
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static int[] getArraySort(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {               //Сортировка массива
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        getArraySort(getRandomIntArray());
    }
}
