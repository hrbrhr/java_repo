package org.javaguru.student_evgeniy_shendelev.lesson_2.homework.level_3.taks_1;

import java.util.Scanner;

public class MultipleTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напиши число от 1 до 9");
        int num;
        while (true) {
            num = scanner.nextInt();
            if (num < 1 || num > 9) {
                System.out.println("Вы ввели не верное число");
            } else {
                break;
            }
        }
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " * " + num + " = " + (i * num));
        }

    }
}
