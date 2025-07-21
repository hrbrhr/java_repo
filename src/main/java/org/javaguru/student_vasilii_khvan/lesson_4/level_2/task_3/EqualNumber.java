package org.javaguru.student_vasilii_khvan.lesson_4.level_2.task_3;

import java.util.Scanner;

class EqualNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 != number2) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Numbers are equals");
        }
    }
}
