package org.javaguru.student_alexey_yakovlev.lesson_4.lessoncode;

import java.util.Scanner;

class TwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два целых числа: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Число " + num1 + " больше числа " + num2);
        } else {
            System.out.println("Число " + num2 + " больше числа " + num1);
        }
    }
}
