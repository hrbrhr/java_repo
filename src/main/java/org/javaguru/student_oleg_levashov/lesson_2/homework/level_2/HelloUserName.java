package org.javaguru.student_oleg_levashov.lesson_2.homework.level_2;

import java.util.Scanner;

class HelloUserName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "!");

    }
}
