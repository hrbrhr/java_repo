package org.javaguru.student_elena_tiutiunnikova.project_0_first_method_creation;

import java.util.Scanner;

class GradeCalculatorApplication {
        public static void main(String[] args) {

            int mark1 = 34;
            int mark2 = 45;
            int mark3 = 91;
            int mark4 = 101;

            GradeCalculator gradeCalculator = new GradeCalculator();
            String grade1 =gradeCalculator.calculateGrade(mark1);
            String grade2 =gradeCalculator.calculateGrade(mark2);
            String grade3 =gradeCalculator.calculateGrade(mark3);
            String grade4 =gradeCalculator.calculateGrade(mark4);

            System.out.println("Оценка: " + grade1);
            System.out.println("Оценка: " + grade2);
            System.out.println("Оценка: " + grade3);
            System.out.println("Оценка: " + grade4);

        }

    }

