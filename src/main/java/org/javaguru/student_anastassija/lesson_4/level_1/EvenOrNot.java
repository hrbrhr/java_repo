package org.javaguru.student_anastassija.lesson_4.level_1;

import java.util.Scanner;

public class EvenOrNot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me integer :");
        int number = scanner.nextInt();

        boolean evenNumber = (number % 2 == 0);

        if (evenNumber) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is NOT even.");
        }



    }
}
