package org.javaguru.student_artjoms_babicevs.lesson_2.Level_2.Task_2;

import java.util.Scanner;

class HelloUser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter user name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);
    }

}
