package org.javaguru.student_vitalii_lutsenko.lesson_4.classwork;


 class GradeCalculatorApplication {

    public static void main(String[] args) {

        GradeCalculator calculator = new GradeCalculator();

        String grade1 = calculator.calculateGrade(101);
        String grade2 = calculator.calculateGrade(90);
        String grade3 = calculator.calculateGrade(80);
        String grade4 = calculator.calculateGrade(77);
        String grade5 = calculator.calculateGrade(34);

        System.out.println("Grade1 = " + grade1);
        System.out.println("Grade2 = " + grade2);
        System.out.println("Grade3 = " + grade3);
        System.out.println("Grade4 = " + grade4);
        System.out.println("Grade5 = " + grade5);

    }
}
