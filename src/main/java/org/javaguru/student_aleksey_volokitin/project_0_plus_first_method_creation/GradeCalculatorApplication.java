package org.javaguru.student_aleksey_volokitin.project_0_plus_first_method_creation;

class GradeCalculatorApplication {
    public static void main(String[] args) {

        int mark1 = 95;
        int mark2 = 55;
        int mark3 = 86;
        int mark4 = 74;
        int mark5 = 62;

        GradeCalculator gradeCalculator = new GradeCalculator();
        String grade1 = gradeCalculator.calculateGrade(mark1);
        String grade2 = gradeCalculator.calculateGrade(mark2);
        String grade3 = gradeCalculator.calculateGrade(mark3);
        String grade4 = gradeCalculator.calculateGrade(mark4);
        String grade5 = gradeCalculator.calculateGrade(mark5);

        System.out.println(grade1);
        System.out.println(grade2);
        System.out.println(grade3);
        System.out.println(grade4);
        System.out.println(grade5);
    }
}
