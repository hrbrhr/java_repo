package org.javaguru.student_grigorii_emelyanov.lesson_4_if_statement.lessoncode.tasks;

import java.util.Scanner;

public class MarkDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you mark:");
        int mark = scanner.nextInt();

        if ((mark >= 90) && (mark <= 100)) {
            System.out.println("A");
        } else if ((mark >= 80) && (mark <= 89)) {
            System.out.println("B");
        } else if ((mark >= 70) && (mark <= 79)) {
            System.out.println("C");
        } else if ((mark >= 60) && (mark <= 69)) {
            System.out.println("D");
        } else if ((mark >= 0) && (mark <= 59)) {
            System.out.println("F");
        }
    }
}
