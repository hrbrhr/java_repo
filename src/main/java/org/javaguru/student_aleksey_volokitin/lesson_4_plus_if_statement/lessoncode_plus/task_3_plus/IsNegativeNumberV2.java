package org.javaguru.student_aleksey_volokitin.lesson_4_plus_if_statement.lessoncode_plus.task_3_plus;

import java.util.Scanner;

class IsNegativeNumberV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        boolean isNegative = number < 0;
        boolean isZero = number == 0;
        boolean isPositive = number > 0;
        System.out.println("Number is negative = " + isNegative);
        System.out.println("Number is zero = " + isZero);
        System.out.println("Number is positive = " + isPositive);
    }
}
