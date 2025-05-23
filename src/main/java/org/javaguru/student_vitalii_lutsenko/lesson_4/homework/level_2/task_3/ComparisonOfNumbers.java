package org.javaguru.student_vitalii_lutsenko.lesson_4.homework.level_2.task_3;


import java.util.Scanner;

class ComparisonOfNumbers {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integers number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter integers number2: ");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Numbers are equals");
        } else if (number1 != number2) {
            System.out.println("Numbers are different");
        }
    }

}
