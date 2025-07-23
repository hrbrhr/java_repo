package org.javaguru.student_grigorii_emelyanov.lesson_5_methods.homework.level_6_middle;

import java.util.ArrayList;
import java.util.List;

class StudentGradeJournal {
    List<Integer> grades = new ArrayList<>();

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "StudentGradeJournal{" +
                "grades=" + grades +
                '}';
    }
}
