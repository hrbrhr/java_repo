package org.javaguru.student_anastassija.lesson_4;

import java.util.Scanner;

public class NumberIsPositive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();

        boolean isPositive = number > 0;

        /*if (number > 0) {
           System.out.println("Number is positive!");
        }*/
        if (isPositive) {
            System.out.println("Number is positive!");
        }
    }

}
