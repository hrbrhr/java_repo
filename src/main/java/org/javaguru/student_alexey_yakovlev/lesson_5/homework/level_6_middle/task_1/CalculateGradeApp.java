package org.javaguru.student_alexey_yakovlev.lesson_5.homework.level_6_middle.task_1;

class CalculateGradeApp {

    public static void main(String[] args) {
        CalculateGrade calculateGrade = new CalculateGrade();

        StudentReportCard studentReportCard = new StudentReportCard(8, 7, 5);

        System.out.println(calculateGrade.averageGrade(studentReportCard));
    }
}
