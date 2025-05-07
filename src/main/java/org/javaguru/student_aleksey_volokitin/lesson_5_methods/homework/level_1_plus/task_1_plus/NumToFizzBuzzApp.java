package org.javaguru.student_aleksey_volokitin.lesson_5_methods.homework.level_1_plus.task_1_plus;

import java.util.Scanner;

class NumToFizzBuzzApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        FizzBuzz toFizzBuzz = new FizzBuzz();

        System.out.println("Convert " + number + " to string: " + toFizzBuzz.convertToString(number));
        scanner.close();
    }
}
