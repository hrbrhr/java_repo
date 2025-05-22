package org.javaguru.student_elena_tiutiunnikova.lesson_2.level_2_intern;

import java.util.Scanner;

class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter user name:");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

    }
}
