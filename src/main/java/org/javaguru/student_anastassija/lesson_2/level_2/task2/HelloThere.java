package org.javaguru.student_anastassija.lesson_2.level_2.task2;

import java.util.Scanner;

public class HelloThere {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter user name: ");
        String username = scanner.nextLine();
        System.out.println("Hello " + username);
    }
}
