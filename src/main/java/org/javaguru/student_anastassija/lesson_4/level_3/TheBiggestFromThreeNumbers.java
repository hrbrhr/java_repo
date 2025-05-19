package org.javaguru.student_anastassija.lesson_4.level_3;

import java.util.Scanner;

public class TheBiggestFromThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me first integer:");
        int number1 = scanner.nextInt();

        System.out.println("Please give me second integer:");
        int number2 = scanner.nextInt();

        System.out.println("Please give me third integer:");
        int number3 = scanner.nextInt();

        boolean Bigger1 = (number1 >= number2) && (number1 >= number3);
        boolean Bigger2 = (number2 >= number1) && (number2 >= number3);
        boolean Bigger3 = (number3 >= number1) && (number3 >= number2);

        if (Bigger1) {
            System.out.println("The biggest is: " + number1);
        } else if (Bigger2) {
            System.out.println("The biggest is: " + number2);
        } else if (Bigger3) {
            System.out.println("The biggest is: " + number3);
        }
    }
}
