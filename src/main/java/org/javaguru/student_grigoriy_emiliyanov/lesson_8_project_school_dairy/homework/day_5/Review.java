package org.javaguru.student_grigoriy_emiliyanov.lesson_8_project_school_dairy.homework.day_5;

import java.util.Objects;


/**
 * Represents a review
 */
public class Review {
    String author;
    String text;
    int mark;

    public Review(String author, String text, int mark) {
        this.author = author;
        this.text = text;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                ", mark=" + mark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return mark == review.mark && Objects.equals(author, review.author) && Objects.equals(text, review.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, text, mark);
    }
}
