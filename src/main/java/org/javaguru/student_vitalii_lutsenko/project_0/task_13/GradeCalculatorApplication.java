package org.javaguru.student_vitalii_lutsenko.project_0.task_13;

import java.util.Scanner;

class GradeCalculatorApplication {

    public static void main(String[] args) {
        // запросите оценку с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mark (0 - 100):");
        int mark = scanner.nextInt();
        GradeCalculator calculator = new GradeCalculator();
        String grade = calculator.calculatorGrade(mark);
        System.out.println(grade);

    }

}
