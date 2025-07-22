package org.javaguru.student_grigorii_emelyanov.lesson_2_variables_and_data_types.homework.level_2_intern;

import java.util.Scanner;

//        Написать консольную программу, которая запрашивает
//                имя пользователя и выводит на консоль текст:
//
//                Hello имя пользователя!
class HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println("Hello " + name + "!");
    }
}
