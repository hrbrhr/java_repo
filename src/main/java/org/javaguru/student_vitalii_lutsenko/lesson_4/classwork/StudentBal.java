package org.javaguru.student_vitalii_lutsenko.lesson_4.classwork;

import java.util.Scanner;

public class StudentBal {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");

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
