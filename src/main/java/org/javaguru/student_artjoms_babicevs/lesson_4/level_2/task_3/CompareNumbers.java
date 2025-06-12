package org.javaguru.student_artjoms_babicevs.lesson_4.level_2.task_3;

import java.util.Scanner;

public class CompareNumbers {

    public static void
main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number:");
        int number2 = scanner.nextInt();

        if (number1 != number2) {

            System.out.println("Numbers are different");
        } else {

            System.out.print("numbers are equals");
        }

          scanner.close();
    }




}
