package org.javaguru.student_alexey_yakovlev.lesson_5.homework.level_6_middle.task_1;

class StudentReportCard {

    private int mathGrade;
    private int sportGrade;
    private int physicsGrade;

    public StudentReportCard(int mathGrade, int sportGrade, int physicsGrade) {
        this.mathGrade = mathGrade;
        this.sportGrade = sportGrade;
        this.physicsGrade = physicsGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public int getSportGrade() {
        return sportGrade;
    }

    public int getPhysicsGrade() {
        return physicsGrade;
    }
}
