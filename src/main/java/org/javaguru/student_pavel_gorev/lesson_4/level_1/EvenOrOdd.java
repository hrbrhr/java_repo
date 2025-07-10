package org.javaguru.student_pavel_gorev.lesson_4.level_1;

import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число чётное.");
        } else {
            System.out.println("Число нечётное.");
        }

        scanner.close();
    }
}