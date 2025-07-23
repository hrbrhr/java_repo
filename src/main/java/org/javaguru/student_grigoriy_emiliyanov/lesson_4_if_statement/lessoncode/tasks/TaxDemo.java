package org.javaguru.student_grigoriy_emiliyanov.lesson_4_if_statement.lessoncode.tasks;

import java.util.Scanner;

public class TaxDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary amount:");
        int salary = scanner.nextInt();
        double taxRatio = 0;
        if (salary  <  10000) {
            taxRatio = 0.1;
        } else if (salary < 20000) {
            taxRatio = 0.15;
        } else {
            taxRatio = 0.2;
        }
        System.out.println("Tax to pay: " + salary * taxRatio);
    }
}
