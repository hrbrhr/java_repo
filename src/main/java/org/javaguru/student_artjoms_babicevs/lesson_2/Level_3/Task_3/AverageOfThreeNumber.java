package org.javaguru.student_artjoms_babicevs.lesson_2.Level_3.Task_3;

import java.util.Scanner;

class AverageOfThreeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1 number: ");
        int number1 = scanner.nextInt();
        System.out.println("Please enter 2 number: ");
        int number2 = scanner.nextInt();
        System.out.println("Please enter 3 number: ");
        int number3 = scanner.nextInt();

        double average = (double) (number1 + number2 + number3) / 3;
        System.out.println("Average = " + average);
    }

}
