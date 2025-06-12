package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.lessoncode_plus.task_8_plus;

import java.util.Scanner;

class RequestNumberFromUser {
    int execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the number: ");
        int number = scanner.nextInt();
        return number;
    }

    int executeWithText(String textOfQuestion) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(textOfQuestion);
        int number = scanner.nextInt();
        return number;
    }
}
