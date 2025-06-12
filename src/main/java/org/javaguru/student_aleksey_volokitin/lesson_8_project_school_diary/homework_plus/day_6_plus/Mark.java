package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework_plus.day_6_plus;

class Mark {
    String date;
    int markGrade;

    public Mark(String date, int markGrade) {
        this.date = date;
        this.markGrade = markGrade;
    }

    public String getDate() { return date; }
    public int getMark()    { return markGrade; }

    public void setDate(String newDate) { this.date = newDate; }
    public void setMark(int newMarkGrade)             { this.markGrade = newMarkGrade; }
}
