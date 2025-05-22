package org.javaguru.student_anastassija.lesson_2.level_4.task1;

import java.util.Scanner;

public class Print {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your favorite colour? ");
        String answer = scanner.nextLine();
        System.out.print("WOW!!! :) " + answer + " is also my favorite one!!");

    }
}
