package org.javaguru.student_artjoms_babicevs.project_0.task_1;


class GradeCalculatorApplication {

    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();

        int mark1 = 34;
        int mark2 = 45;

        String grade1 = calculator.calculateGrade(mark1);
        String grade2 = calculator.calculateGrade(mark2);

        System.out.println("Grade 1 = " + grade1);
        System.out.println("Grade 2 = " + grade2);
    }

}