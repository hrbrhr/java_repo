package org.javaguru.student_grigorii_emelyanov.lesson_4_if_statement.lessoncode.tasks;


import java.util.Scanner;

//Если кредитный рейтинг клиента выше 700,
//        процентная ставка составляет 5%.
//
//        Если кредитный рейтинг от 650 до 700,
//        процентная ставка составляет 7%.
//
//        Если кредитный рейтинг ниже 650,
//        процентная ставка составляет 10%.
//
//        Создайте программу, которая принимает кредитный
//        рейтинг клиента и выводит соответствующую процентную ставку.
public class CreditRationDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your credit rating:");
        int creditRating = scanner.nextInt();
       int creditRatio = 0;
        if (creditRating  < 650) {
            creditRatio = 10;
        } else if (creditRating < 700) {
            creditRatio = 7;
        } else {
            creditRatio = 5;
        }
        System.out.println("You credit ratio is: " + creditRatio + " percent." );
    }
}
