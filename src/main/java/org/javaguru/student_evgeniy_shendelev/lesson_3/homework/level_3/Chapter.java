package org.javaguru.student_evgeniy_shendelev.lesson_3.homework.level_3;

public class Chapter {
    private String name;
    private String text;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
