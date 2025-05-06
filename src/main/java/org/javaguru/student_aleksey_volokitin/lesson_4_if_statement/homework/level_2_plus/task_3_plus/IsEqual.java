package org.javaguru.student_aleksey_volokitin.lesson_4_if_statement.homework.level_2_plus.task_3_plus;

import java.util.Scanner;

class IsEqual
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int number2 = scanner.nextInt();
        if (number1 != number2)
        {
            System.out.println("The numbers is not equal");
        }
        else
        {
            System.out.println("The numbers are equal");
        }
        scanner.close();
    }
}
