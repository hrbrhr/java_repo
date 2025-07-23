package org.javaguru.student_grigoriy_emiliyanov.lesson_2_variables_and_data_types.homework.level_3_junior;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя
//        три целых числа и выводит их среднее арифметическое
//        (складывает все числа и делит на их количество).
//
//        Примечание: обратите внимание, что результат может быть дробным числом.
class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your first integer: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input your second integer: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Input your third integer: ");
        int thirdNumber = scanner.nextInt();
        double average = (firstNumber + secondNumber + thirdNumber) / 3.0;
        System.out.println("The average is: " + average);
    }
}
