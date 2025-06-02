package org.javaguru.student_pavel_gorev.lesson_2.level_2.task2;

import java.util.Scanner;

class HelloUserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name, please");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + " !=)");
    }
}
