package org.javaguru.student_aleksey_volokitin.lesson_4_plus_if_statement.lessoncode_plus.task_6_plus;

import java.util.Scanner;

class IsNumberBetween1And10V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if (!((number < 1) || (number > 10))) {
            System.out.println("Number is inside range (1-10)!");
        } else {
            System.out.println("Number is NOT inside range (1-10)!");
        }
    }
}
