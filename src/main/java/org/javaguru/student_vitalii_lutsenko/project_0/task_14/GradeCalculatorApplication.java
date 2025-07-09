package org.javaguru.student_vitalii_lutsenko.project_0.task_14;


class GradeCalculatorApplication {

    public static void main(String[] args) {
        int mark1 = 34;
        int mark2 = 78;

        GradeCalculator calculator = new GradeCalculator();
        String grade1 = calculator.calculatorGrade(mark1);
        String grade2 = calculator.calculatorGrade(mark2);
        System.out.println(grade1);
        System.out.println(grade2);

    }

}
