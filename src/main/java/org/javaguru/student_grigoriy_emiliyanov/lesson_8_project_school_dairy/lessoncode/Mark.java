package org.javaguru.student_grigoriy_emiliyanov.lesson_8_project_school_dairy.lessoncode;

import java.util.Objects;

/**
 * Represents a user mark
 */
class Mark {
    private final String subject;
    private final int mark;

    public Mark(String subject, int mark) {
        this.subject = subject;
        this.mark = mark;
    }

    public String getSubject() {
        return subject;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "subject='" + subject + '\'' +
                ", mark=" + mark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mark mark1 = (Mark) o;
        return mark == mark1.mark && Objects.equals(subject, mark1.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, mark);
    }
}
