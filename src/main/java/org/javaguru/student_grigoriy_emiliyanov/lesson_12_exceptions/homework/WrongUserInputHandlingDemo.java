package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean correctInput = false;
        int n = 0;
        do {
            System.out.println("Input an integer:");
            try {
                n = Integer.parseInt(scanner.nextLine());
                correctInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Your input is not valid integer");
            }
        } while (!correctInput);
        System.out.println("Your input was: " + n);

    }
}
