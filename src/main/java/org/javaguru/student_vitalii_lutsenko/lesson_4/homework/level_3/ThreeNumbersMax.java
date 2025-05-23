package org.javaguru.student_vitalii_lutsenko.lesson_4.homework.level_3;

import java.util.Scanner;

class ThreeNumbersMax {

    private static int max(int number1, int number2) {

        return (number1 > number2) ? number1 : number2;
    }

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter number3: ");
        int number3 = scanner.nextInt();

        int maxNumber = max(number1,number2);
        maxNumber = max(maxNumber,number3);

        System.out.println("Max number = " + maxNumber);


    }
}
