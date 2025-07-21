package org.javaguru.student_vasilii_khvan.lesson_4.level_3.task_1;

import java.util.Scanner;

class BiggestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int biggest = number1;
        if (number2 > biggest) {
            biggest = number2;
        }
        if (number3 > biggest) {
            biggest = number3;
        }
        System.out.println(biggest);
    }
}

