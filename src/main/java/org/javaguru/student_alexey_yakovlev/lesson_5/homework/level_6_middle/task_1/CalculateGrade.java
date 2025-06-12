package org.javaguru.student_alexey_yakovlev.lesson_5.homework.level_6_middle.task_1;

class CalculateGrade {

    double averageGrade(StudentReportCard studentReportCard) {
        return (studentReportCard.getPhysicsGrade()
                + studentReportCard.getMathGrade()
                + studentReportCard.getSportGrade()) / (double) 3;

    }

}
