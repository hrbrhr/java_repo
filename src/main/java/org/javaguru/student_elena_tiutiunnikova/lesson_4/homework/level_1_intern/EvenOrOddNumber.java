package org.javaguru.student_elena_tiutiunnikova.lesson_4.homework.level_1_intern;

import java.util.Scanner;

class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число четное.");
        } else {
            System.out.println("Число нечетное.");
        }

    }

}
