package org.javaguru.student_aleksey_volokitin.lesson_4_plus_if_statement.lessoncode_plus.task_4_plus;

import java.util.Scanner;

class IsPositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        boolean isPositive = number > 0;

        if (isPositive) {
            System.out.println("Number is positive!");
        }
    }
}
