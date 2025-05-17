package org.javaguru.student_anastassija.lesson_4;

import java.util.Scanner;

public class CompareNumbers_scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();

            /*int number1 = 10;
            int number2 = 22;*/
            if (number1 > number2) {
                System.out.println("Biggest number is " + number1);
            } else {
                System.out.println("Biggest number is " + number2);
            }

    }


    }



