package org.javaguru.student_alexey_yakovlev.lesson_4.lessoncode;

import java.util.Scanner;

class Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        int num = scanner.nextInt();

        boolean isNegative = num < 0;
        System.out.println("Число отрицательное: " + isNegative);

    }
}
