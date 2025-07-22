package org.javaguru.student_grigorii_emelyanov.lesson_4_if_statement.lessoncode.tasks;

import java.util.Scanner;

public class RangeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = scanner.nextInt();
        if ((number >= 1) && (number <= 10)) {
            System.out.println("Number is inside range (1-10]!");
        } else {
            System.out.println("Number is NOT inside range (1-10]!");
        }
    }
}
