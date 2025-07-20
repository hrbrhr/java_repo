package org.javaguru.student_vasilii_khvan.lesson_3.level_3;

public class Chapter {
    private String title;
    private String text;

    Chapter(String title, String text) {
        this.title = title;
        this.text = text;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getText() {
        return text;
    }

    void setText(String text) {
        this.text = text;
    }
}
