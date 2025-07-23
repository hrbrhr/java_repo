package org.javaguru.student_grigorii_emelyanov.lesson_5_methods.homework.level_6_middle;

class StudentGradeCalculatorDemo {
    public static void main(String[] args) {
        StudentGradeJournal journal1 = new StudentGradeJournal();
        journal1.addGrade(3);
        journal1.addGrade(4);
        journal1.addGrade(5);
        journal1.addGrade(6);
        StudentGradeCalculator calculator = new StudentGradeCalculator();
        System.out.println("Grades: " + journal1);
        System.out.println("Average: " + calculator.calculateAverage(journal1));

        System.out.println();

        StudentGradeJournal journal2 = new StudentGradeJournal();
        journal2.addGrade(10);
        journal2.addGrade(4);
        journal2.addGrade(5);
        journal2.addGrade(6);
        System.out.println("Grades: " + journal2);
        System.out.println("Average: " + calculator.calculateAverage(journal2));
    }
}
