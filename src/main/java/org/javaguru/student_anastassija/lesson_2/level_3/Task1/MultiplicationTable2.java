package org.javaguru.student_anastassija.lesson_2.level_3.Task1;

import java.util.Scanner;

public class MultiplicationTable2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number ");

        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) System.out.println(number + " * " + i + " = " + number * i);
        scanner.close();

    }

}
