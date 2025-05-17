package org.javaguru.student_aleksey_volokitin.lesson_4_plus_if_statement.lessoncode_plus.task_5_plus;

import java.util.Scanner;

class MaxOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("Biggest number is " + number1);
        }
        else {
            System.out.println("Biggest number is " + number2);
        }
    }
}
