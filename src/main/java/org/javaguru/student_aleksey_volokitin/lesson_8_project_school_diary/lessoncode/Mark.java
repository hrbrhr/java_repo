package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.lessoncode;

class Mark {
    String subject;
    int mark;

    public Mark(String subject, int mark) {
        this.subject = subject;
        this.mark = mark;
    }

    public String getSubject() { return subject; }
    public int getMark()    { return mark; }

    public void setSubject(String newSubject) { this.subject = newSubject; }
    public void setMark(int mark)             { this.mark = mark; }
}
