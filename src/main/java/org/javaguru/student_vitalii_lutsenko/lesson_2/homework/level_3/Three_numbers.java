package org.javaguru.student_vitalii_lutsenko.lesson_2.homework.level_3;


import java.util.Scanner;

class Three_numbers {

    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter number3: ");
        int number3 = scanner.nextInt();

        double average  = (double) (number1 + number2 + number3)/3;
        System.out.println("Average for three numbers = " + average);
        //double average  = (number1 + number2 + number3)/3.0;

    }
}

