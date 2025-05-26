package org.javaguru.student_alexey_yakovlev.project_0_first_method_creation;


class GradeCalculatorApplication {

    public static void main(String[] args) {
        GradeCalculator gradeCalculator = new GradeCalculator();

        int mark1 = 50;
        int mark2 = 90;

        System.out.println(gradeCalculator.calculateGrade(mark1));
        System.out.println(gradeCalculator.calculateGrade(mark2));

    }
}
