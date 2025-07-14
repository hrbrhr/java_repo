package org.javaguru.student_evgeniy_shendelev.lesson_4.homework.level_6.task_1;

import java.util.Scanner;

class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 12");
        int num = scanner.nextInt();
        if (num > 0 && num < 13) {
            switch (num) {
                case 1, 2, 12 -> System.out.println("Winter");
                case 3, 4, 5 -> System.out.println("Spring");
                case 6, 7, 8 -> System.out.println("Summer");
                case 9, 10, 11 -> System.out.println("Autumn");
            }
        } else {
            System.out.println("Введено не верное число. Запустите программу заново");
        }
    }
}
