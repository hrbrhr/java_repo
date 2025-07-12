package org.javaguru.student_evgeniy_shendelev.lesson_4.level_3;

import java.util.Scanner;

public class MaxFromThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три целых числа");
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Введите третье число");
        int c = scanner.nextInt();
        System.out.println(max(max(a, b), c));
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}
