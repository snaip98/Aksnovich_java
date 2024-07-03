package main.java;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        String a = readLine();
        String b = readLine();
        compareStr(a, b);
    }

    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        return scanner.nextLine();
    }

    public static void compareStr(String a, String b) {
        if (a == null || b == null) {
            throw new RuntimeException("значение null");
        }
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
