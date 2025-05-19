package org.javaguru.student_aleksey_volokitin.lesson_4_if_statement.homework_plus.level_2_plus.task_2_plus;

import java.util.Scanner;

class MinOfTwo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int number2 = scanner.nextInt();
        if (number1 < number2)
        {
            System.out.println("Number 1 is less than number 2");
        }
        else if (number2 < number1)
        {
            System.out.println("Number 2 is less than number 1");
        }
        else
        {
            System.out.println("Number 1 and 2 are equal");
        }
        scanner.close();
    }
}
