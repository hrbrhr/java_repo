package org.javaguru.student_vitalii_lutsenko.project_0.task_2;

import java.util.Scanner;

class GradeCalculatorApplication {

    public static void main(String[] args) {
        // запросите оценку с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mark (0 - 100):");
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
        } else {
            System.out.println("Invalid");
        }

    }

}
