package org.javaguru.student_anastassija.lesson_4;

public class GradeCalculatorApplication {

    public static void main(String[] args) {

        GradeCalculator calculator = new GradeCalculator();

        String grade1 = calculator.calculateGrade(100);
        String grade2 = calculator.calculateGrade(56);
        String grade3 = calculator.calculateGrade(23);
        String grade4 = calculator.calculateGrade(80);
        String grade5 = calculator.calculateGrade(10);
        String grade6 = calculator.calculateGrade(89);

        System.out.println("Grade 1 = " + grade1 );
        System.out.println("Grade 2 = " + grade2 );
        System.out.println("Grade 3 = " + grade3 );
        System.out.println("Grade 4 = " + grade4 );
        System.out.println("Grade 5 = " + grade5 );
        System.out.println("Grade 6 = " + grade6 );

    }
}
