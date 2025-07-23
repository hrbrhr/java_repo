package org.javaguru.student_grigoriy_emiliyanov.lesson_3_oop_first_look.lessoncode;

public class Questionnaire {
    private String responderName;
    private Question question1;
    private Question question2;

    public Questionnaire(String responderName, Question question1, Question question2) {
        this.responderName = responderName;
        this.question1 = question1;
        this.question2 = question2;
    }

    public String getResponderName() {
        return responderName;
    }

    public Question getQuestion1() {
        return question1;
    }

    public Question getQuestion2() {
        return question2;
    }
}
