package org.javaguru.student_grigorii_emelyanov.lesson_5_methods.homework.level_6_middle;

class StudentGradeCalculator {
    public double calculateAverage(StudentGradeJournal journal) {
        return (double) journal.getGrades().stream().reduce(0, Integer::sum) / journal.getGrades().size();
    }

}
