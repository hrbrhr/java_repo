package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_6_plus.task_1_plus;

class Mark {
    private String date;
    private int markGrade;

    public Mark(String date, int markGrade) {
        this.date = date;
        this.markGrade = markGrade;
    }

    public String getDate() { return date; }
    public int getMark()    { return markGrade; }

    public void setDate(String newDate) { this.date = newDate; }
    public void setMark(int newMarkGrade)             { this.markGrade = newMarkGrade; }
}
