package org.javaguru.student_grigoriy_emiliyanov.lesson_3_oop_first_look.lessoncode;

public class Question {
    private String text;
    private boolean answer;

    public Question(String text, boolean answer) {
        this.text = text;
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public boolean getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Question: " + this.text + "\n" +
                "Answer: " + this.answer;
    }
}
