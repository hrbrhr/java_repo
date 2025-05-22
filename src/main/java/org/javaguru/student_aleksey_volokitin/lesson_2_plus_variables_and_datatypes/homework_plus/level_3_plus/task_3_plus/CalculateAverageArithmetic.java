package org.javaguru.student_aleksey_volokitin.lesson_2_plus_variables_and_datatypes.homework_plus.level_3_plus.task_3_plus;

import java.util.Scanner;

class CalculateAverageArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input a second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input a third number: ");
        int num3 = scanner.nextInt();

        double averageArithmetic = (num1 + num2 + num3) / 3.0d;
        System.out.println("AverageArithmetic is " + averageArithmetic);
        scanner.close();
    }
}
