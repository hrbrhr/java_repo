package org.javaguru.student_elena_tiutiunnikova.lesson_4.homework.level_2_intern;

import java.util.Scanner;

class SmallerNumber {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int number1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе целое число: ");
        int number2 = scanner2.nextInt();

        if ( number1 < number2 ) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }

    }
}
