package org.javaguru.student_elena_tiutiunnikova.lesson_4.lessoncode;

import java.util.Scanner;

public class IsNegativeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        boolean isNegative = number <0;
        System.out.println("Число отрицательное = " + isNegative);

        boolean isPositive = number >0;
        System.out.println("Число положительное = " + isPositive);
    }
}
