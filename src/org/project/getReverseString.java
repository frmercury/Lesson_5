package org.project;

import java.util.Scanner;

public class getReverseString {

    public static char[] getScanner () {              // Ввод строки
        System.out.println("Input string: ");
        Scanner scanner = new Scanner(System.in);
        char[] charArr = scanner.next().toCharArray();
        return charArr;
    }

    public static String getReverseString (char[] array) {
        String reverseString = "";
        for (int i = array.length - 1; i >= 0; i--) {
            reverseString += array[i];
        }
        return reverseString;
    }

    public static void main(String[] args) {
        System.out.println("Reverse string: " + getReverseString(getScanner()));
    }
}
