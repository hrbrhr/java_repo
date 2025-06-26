package org.javaguru.student_vitalii_lutsenko.lesson_4.homework.level_1.task_2;


import java.util.Scanner;

class EvenOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");

        int number = scanner.nextInt();

        if ((number % 2) == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
