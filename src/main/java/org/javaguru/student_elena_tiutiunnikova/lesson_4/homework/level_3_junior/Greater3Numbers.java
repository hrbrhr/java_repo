package org.javaguru.student_elena_tiutiunnikova.lesson_4.homework.level_3_junior;

import java.util.Scanner;

class Greater3Numbers {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int number1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе целое число: ");
        int number2 = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите третье целое число: ");
        int number3 = scanner3.nextInt();

        if (number1>number2) {
            if (number1>number3) {
                System.out.println(number1);
            } else {
                System.out.println(number3);
            }
        } else if (number2<number3) {
            System.out.println(number3);
        } else if (number2>number3) {
            System.out.println(number2);
        } else {
            System.out.println(number2);
        }

    }
}
