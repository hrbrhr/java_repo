package org.javaguru.student_grigoriy_emiliyanov.lesson_3_oop_first_look.homework.level_3_junior;

public class Chapter {
    private String title;
    private String text;

    public Chapter(String title, String text) {
        this.title = title;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Text: " + text + "\n";
    }
}
