package org.javaguru.student_artjoms_babicevs.lesson_4.level_2.task_2;

import java.util.Scanner;

public class MinOffTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add first number:");
        int firstNumber = scanner.nextInt();

        System.out.print("Add second number:");
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber) {
            System.out.println("Less number:" + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("Less number: " + secondNumber);
        } else {
            System.out.println("Numbers are equal");
        }
    }





}






