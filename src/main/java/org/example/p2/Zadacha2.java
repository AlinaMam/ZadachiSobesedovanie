package org.example.p2;

import java.util.Arrays;
import java.util.Scanner;

public class Zadacha2 {
    public static final String LINE1 = "Hello hello world world hola amigos todo el mundo";

    public static void main(String[] args) {
       /* int[] array = {3, 6, 21, 34, 53};
        System.out.println(getSecondValue(array));
        System.out.println(getSecondValue1(array));
        getSecondValue2(array);*/
//        isArmstrong();
//        isArmstrong1();
        System.out.println(withOutBlank(LINE1));
        System.out.println(withOutBlank1(LINE1));

    }

    public static int getSecondValue(int[] array) {
        Arrays.sort(array);
        return array[array.length - 2];
    }

    public static int getSecondValue1(int[] array) {
        int min1 = array[0];
        int min2 = array[1];
        for (int i = 2; i < array.length; i++) {
            for (int j = 3; j < i; j++) {
                if (array[i] < array[j]) {
                    min1 = array[i];
                    min2 = array[j];
                } else {
                    min1 = array[j];
                    min2 = array[i];
                }
            }
        }
        return min1;
    }

    public static void getSecondValue2(int[] array) {
        int biggest = array[0];
        int secondBiggest = array[0];
        System.out.println("Полученный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] > biggest) {
                secondBiggest = biggest;
                biggest = array[i];
            } else if (array[i] > secondBiggest && array[i] != biggest) {
                secondBiggest = array[i];
            }
        }
        System.out.println("\nВторое по величине число:" + secondBiggest);
    }

    /*public static void isArmstrong() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое трехзначное число: ");
        String num = scanner.nextLine();
        char[] chars = num.toCharArray();
        System.out.println(Arrays.toString(chars));
        int num1 = Character.getNumericValue(chars[0]);
        int num2 = Character.getNumericValue(chars[1]);
        int num3 = Character.getNumericValue(chars[2]);
        int result = (num1 * num1 * num1) + (num2 * num2 * num2) + (num3 * num3 * num3);
        if (num.equals(String.valueOf(result))) {
            System.out.println(num + " число Армстронга");
        } else {
            System.out.println(num + " не число Армстронга");
        }
    }*/

    public static void isArmstrong1() {
        int num = 371;
        int y = 0;
        int x;
        int currentNum = num;
        while (currentNum > 0) {
            x = num % 10;
            currentNum = currentNum / 10;
            y = y + (x * x * x);
        }
        if (num == y) {
            System.out.println(num + " число Армстронга");

        } else {
            System.out.println(num + " не число Армстронга");
        }
    }

    public static String withOutBlank(String line) {
        line = line.replace(" ", "").trim();
        return line;
    }

    public static String withOutBlank1(String line) {
        line = line.trim();
        StringBuilder sb = new StringBuilder();
        char[] chars = line.toCharArray();
        for (char ch : chars) {
            if (Character.isLetter(ch))
                sb.append(ch);
        }

        return sb.toString();
    }
}

