package org.javaguru.student_anastassija.lesson_4;

import java.util.Scanner;

public class IsNegativeNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = scanner.nextInt();
        //int number = Integer.parseInt(scanner.nextLine());

        // <, <=, >, >=, ==, !=

        boolean isNegative = number < 0;
        System.out.println("Number is negative = " + isNegative);

        boolean isPositive = number > 0;
        System.out.println("Number is positive = " + isPositive);

        boolean isZero = number == 0;
        System.out.println("Number is zero = " + isZero);

        boolean isNotZero = number != 0;
        System.out.println("Number is not zero = " + isNotZero);

    }
}
