package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.lessoncode.task_13_plus;

class Questionary {
    private int number;
    private String text;
    private boolean answer;

    Questionary() {
        this.number = 0;
        this.text = "Text of question";
        this.answer = true;
    }
    Questionary(int number, String text, boolean answer) {
        this.number = number;
        this.text = text;
        this.answer = answer;
    }
    int getNumber()    { return number; }
    String getText()   { return text; }
    String getAnswer() {
        if (this.answer) {
            return "Yes";
        }
        else {
            return "No";
        }
    }

    void setNumber(int newNumber)     { this.number = newNumber; }
    void setText(String newText)      { this.text = newText; }
    void setAnswer(boolean newAnswer) { this.answer = newAnswer; }
}
