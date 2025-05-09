package org.javaguru.student_anastassija.lesson_2.level_3.task3;

import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide first number: ");
        double first = scanner.nextDouble();

        System.out.println("Please provide second number: ");
        double second = scanner.nextDouble();

        System.out.println("Please provide third number: ");
        double third = scanner.nextDouble();

        System.out.println("Arithmetical mean is " + (first + second + third)/3);

    }
}
