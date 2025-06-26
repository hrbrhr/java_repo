package org.javaguru.student_vitalii_lutsenko.lesson_4.classwork;

import java.util.Scanner;

public class If {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");

        int number = scanner.nextInt();
        boolean isPositive = number > 0;

        if(isPositive){
            System.out.println("Number is positive = " + isPositive);

        }

    }
}
