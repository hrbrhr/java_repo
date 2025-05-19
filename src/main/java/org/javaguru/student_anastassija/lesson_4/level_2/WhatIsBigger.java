package org.javaguru.student_anastassija.lesson_4.level_2;

import java.util.Scanner;

public class WhatIsBigger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me first integer:");
        int number1 = scanner.nextInt();

        System.out.println("Please give me second integer:");
        int number2 = scanner.nextInt();

        boolean Bigger1 = number1 >= number2;

        if (Bigger1) {
            System.out.println("The biggest is: " + number1);
        } else {
            System.out.println("The biggest is: " + number2);
        }
    }
}
