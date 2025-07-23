package org.javaguru.student_grigorii_emelyanov.lesson_5_methods.lessoncode;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number1 = scanner.nextInt();
        System.out.println("Is my number event? Answer: " + calculator.isEven(number1));
        System.out.println("Is my number odd? Answer: " + calculator.isOdd(number1));
        System.out.println("Enter your number:");
        int number2 = scanner.nextInt();
        System.out.println("Is my number event? Answer: " + calculator.isEven(number2));
        System.out.println("Is my number odd? Answer: " + calculator.isOdd(number2));
        System.out.println("Enter your number:");
        int number3 = scanner.nextInt();
        System.out.println("Is my number event? Answer: " + calculator.isEven(number2));
        System.out.println("Is my number odd? Answer: " + calculator.isOdd(number2));
        System.out.println();
        System.out.println("Average of " + number1 + " and " + number2 + " is " +  calculator.findAverage(number1, number2));
        System.out.println();
        System.out.println("Average of " + number2 + " and " + number3 + " is " + calculator.findAverage(number2, number3));
    }

}
