package org.javaguru.mentor.lesson_4_if_statement.lessoncode.old;

import java.util.Scanner;

class NegativeNumberDetector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        boolean isNegativeNumber = number < 0;
        System.out.println("Number is negative = " + isNegativeNumber);
    }

}
