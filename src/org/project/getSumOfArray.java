package org.project;

public class getSumOfArray {
    public static void main(String[] args) {
        System.out.println(getSumOfArray(getRandomIntArray()));
    }
    public static int[] getRandomIntArray() {      // Генерация рандомного массива чисел
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }
    public static int getSumOfArray (int[] array) {  // Сумма элементов массива
        int sum = 0;
        for ( int num: array) {
            sum = sum + num;
        }
        return sum;
    }
}