package org.javaguru.student_grigoriy_emiliyanov.project_0_first_method_creation;

class GradeCalculatorApplication {
    public static void main(String[] args) {
        GradeCalculator gradeCalculator = new GradeCalculator();
        int[] marks = new int[] {100, 76, 23, 11, 67, 88};
        for (int mark : marks) {
            System.out.println(mark + " -> " + gradeCalculator.calculateGrade(mark));
        }
    }
}
