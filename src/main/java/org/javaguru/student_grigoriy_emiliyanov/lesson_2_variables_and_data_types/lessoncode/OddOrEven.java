package org.javaguru.student_grigoriy_emiliyanov.lesson_2_variables_and_data_types.lessoncode;

import java.util.Scanner;

//Задача "Определение четности числа":
//        Напишите программу, которая запрашивает
//        у пользователя целое число и выводит сообщение,
//        указывающее, является ли число четным или нечетным.
class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }
}
