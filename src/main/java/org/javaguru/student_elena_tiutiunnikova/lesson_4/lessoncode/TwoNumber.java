package org.javaguru.student_elena_tiutiunnikova.lesson_4.lessoncode;

import java.util.Scanner;

class TwoNumber {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int number1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе число:");
        int number2 = scanner2.nextInt();

        if (number1 > number2) {
            System.out.println("Большее число = " + number1);
        } else {
            System.out.println("Большее число = " + number2);
        }

    }

}
