package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework.day_5_plus;

class Review {
    private String nick;
    private String text;
    private int grade;

    Review() {

    }
    Review(String nick,
           String text,
           int grade) {
        this.nick = nick;
        this.text = text;
        this.grade = grade;
    }

    String getNick()         { return nick; }
    String getText() { return text; }
    int getGrade()   { return grade; }

    void setNick(String newNick) { this.nick = newNick; }
    void setText(String newText) { this.text = newText; }
    void setGrade(int newGrade) { this.grade = newGrade; }
}
