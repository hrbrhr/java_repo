package org.javaguru.student_vitalii_lutsenko.lesson_2.llevel_2;

import java.util.Scanner;

class Name_Hello {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You can login!");
        String name = scanner.next();

        System.out.println("Hello  " + name);

    }
}
