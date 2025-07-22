package org.javaguru.student_grigorii_emelyanov.lesson_2_variables_and_data_types.homework.level_3_junior;

import java.util.Scanner;
//Напишите программу, которая запрашивает у пользователя целое число
//        и печатает на консоль таблицу умножения.
//
//        Test Data:
//        Input a number: 8
//
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        ...
//        8 x 10 = 80
class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
