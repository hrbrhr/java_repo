package org.javaguru.student_vasilii_khvan.lesson_4.level_1.task_2;

import java.util.Scanner;

class Even {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
