package org.javaguru.student_alexey_yakovlev.lesson_4.lessoncode;

import java.util.Scanner;

class PositiveNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Число " + number + " отрицательное!");
        }
        if (number > 0) {
            System.out.println("Число " + number + " положительное!");
        }

    }
}
