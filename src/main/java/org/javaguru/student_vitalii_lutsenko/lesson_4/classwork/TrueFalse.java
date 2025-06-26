package org.javaguru.student_vitalii_lutsenko.lesson_4.classwork;

import java.util.Scanner;

 class TrueFalse {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        boolean isNegative = number < 0 ;
        System.out.println("Number is negative = " + isNegative);

        boolean isPositive = number > 0 ;
        System.out.println("Number is positive = " + isPositive);

        //System.out.println("Number is negative = " + (number < 0));

        boolean isZero = number == 0 ;
        System.out.println("Number is zero = " + isZero);

        boolean isNotZero = number != 0 ;
        System.out.println("Number is notzero = " + isNotZero);


    }
}
