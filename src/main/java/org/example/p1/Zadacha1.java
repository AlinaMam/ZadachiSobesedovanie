package org.example.p1;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class Zadacha1 {
    private static final String LINE1 = "Java";
    private static final String LINE2 = "Java language";
    public static final String LINE3 = "Hello hello world world hola amigos todo el mundo";
    public static final String LINE4 = "Madam";

    public static void main(String[] args) {
       /* System.out.println(reverseLine(LINE1));
        System.out.println(reverseLine(LINE2));
        System.out.println(reverseLine1(LINE1));*/
//        reverse();
//        reverse2();
        /*countWords(LINE3);
        countWords1(LINE3);
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> map1 = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        map1.put(1, "one");
        map1.put(2, "two");
        map1.put(3, "three");
        map1.put(4, "four");
        map1.put(5, "five");
        showFeyValueMap(map);
        showFeyValueMap(map1);
        isSimple();*/
//        isSimple1();
/*        System.out.println(palindrom(LINE4));
        fibonachchi();*/

        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list, "Hola", "amigos", "mi", "amor");
        Collections.addAll(list1, 23, 35, 56, 28);
        arrayList(list);
        arrayList(list1);
        getSymbols(LINE3);
    }

    public static String reverseLine(String line) {
        StringBuilder builder = new StringBuilder();
        char[] chars = line.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            builder.append(chars[i]);
        }
        return builder.toString();
    }

    public static String reverseLine1(String line) {
        StringBuilder sb = new StringBuilder(line);
        return sb.reverse().toString();
    }

    public static void reverse() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1ое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите 2ое число: ");
        int num2 = scanner.nextInt();

        System.out.println("1ое число: " + num1 + ", " + "2ое число: " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("1ое число: " + num1 + ", " + "2ое число: " + num2);
    }

    public static void reverse2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1ое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите 2ое число: ");
        int num2 = scanner.nextInt();

        System.out.println("1ое число: " + num1 + ", " + "2ое число: " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("1ое число: " + num1 + ", " + "2ое число: " + num2);
    }

    public static void countWords(String line) {
        if (line.isEmpty() || line.isBlank()) {
            throw new IllegalArgumentException("Строка пустая");
        }
        line = line.toLowerCase();
        Map<String, Integer> map = new HashMap<>();
        String[] buffer = line.split(" ");
        for (int i = 0; i < buffer.length; i++) {
            map.compute(buffer[i], (k, v) -> (v == null) ? 1 : ++v);
        }
        System.out.println(map);
    }

    public static void countWords1(String line) {
        if (line.isEmpty() || line.isBlank()) {
            throw new IllegalArgumentException("Строка пустая");
        }
        int count = 0;
        line = line.toLowerCase();
        Map<String, Integer> map = new HashMap<>();
        String[] buffer = line.split(" ");
        for (int i = 0; i < buffer.length; i++) {
            if (map.containsKey(buffer[i])) {
                int num = map.get(buffer[i]);
                map.put(buffer[i], num + 1);
            } else {
                map.put(buffer[i], 1);
            }
        }
        System.out.println(map);
    }

    public static void showFeyValueMap(Map<?, ?> map) {
        for (Map.Entry<?, ?> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " -> " + pair.getValue());
        }
    }

    public static void isSimple() {
        for (int i = 2; i < 50; i++) {
            boolean isSimple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                System.out.println(i);
            }
        }
    }

    public static void isSimple1() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        boolean isSimple = true;
        for (int i = 1; i < num / 2; i++) {
            int temp = num % i;
            if (temp == 0) {
                isSimple = false;
                break;

            }
        }
        if (isSimple) {
            System.out.println(num + " простое число");
        } else {
            System.out.println(num + " не простое число");
        }
    }

    public static boolean palindrom(String line) {
        line = line.toLowerCase();
        StringBuilder builder = new StringBuilder();
        char[] chars = line.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            builder.append(chars[i]);
        }
        boolean isPalindrom = false;
        if (line.equals(new String(builder))) {
            isPalindrom = true;
        }
        System.out.println(builder.toString());
        return isPalindrom;
    }

    public static void fibonachchi() {
        int[] array = new int[30];
        array[0] = 1;
        array[1] = 1;
        for (int i = 3; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
            System.out.println(array[i]);
        }
    }

    public static void arrayList(List<?> list) {
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void getSymbols(String line) {
        line = line.toLowerCase();
        char[] chars = line.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.compute(chars[i], (k, v) -> (v == null) ? 1 : ++v);
        }
        for (var pair : map.entrySet()) {
            if (pair.getValue() > 1) {
                System.out.println(pair.getKey() + " -> " + pair.getValue());
            }
        }
    }
}
