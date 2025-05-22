package org.javaguru.student_aleksey_volokitin.lesson_4_plus_if_statement.lessoncode_plus.task_2_plus;

import java.util.Scanner;

class IsNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        boolean isNegative = number < 0;

        System.out.println("Number is negative: " + isNegative);
    }
}
