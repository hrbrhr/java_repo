package org.javaguru.student_grigoriy_emiliyanov.lesson_3_oop_first_look.lessoncode;

public class Mark {
    private String studentFirstName;
    private String studentLastName;
    private String subject;
    private String grade;

    public Mark(String studentFirstName, String studentLastName, String subject, String grade) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.subject = subject;
        this.grade = grade;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public String getSubject() {
        return subject;
    }

    public String getGrade() {
        return grade;
    }
}
