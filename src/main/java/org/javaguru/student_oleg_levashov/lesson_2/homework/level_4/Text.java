package org.javaguru.student_oleg_levashov.lesson_2.homework.level_4;

import java.util.Scanner;

class Text {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя пользователя: ");
        String userName = scanner.nextLine();

        System.out.print("Hello, ");
        System.out.print(userName);
        System.out.print("!");


    }
}
