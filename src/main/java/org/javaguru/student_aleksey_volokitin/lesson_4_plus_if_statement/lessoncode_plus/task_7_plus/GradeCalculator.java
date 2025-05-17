package org.javaguru.student_aleksey_volokitin.lesson_4_plus_if_statement.lessoncode_plus.task_7_plus;

class GradeCalculator {
    String calculateGrade(int number) {
        String grade = "";

        if (isRangeAFrom90To100(number)) {
            grade = "A";
        } else if (isRangeBFrom80To89(number)) {
            grade = "B";
        } else if (isRangeCFrom70To79(number)) {
            grade = "C";
        } else if (isRangeDFrom60To69(number)) {
            grade = "D";
        } else if (isRangeFFrom0To59(number)) {
            grade = "F";
        }
        return grade;
    }
    boolean isRangeAFrom90To100(int number) {
        return (number >= 90) && (number <= 100);
    }
    boolean isRangeBFrom80To89(int number) {
        return (number >= 80) && (number <= 89);
    }
    boolean isRangeCFrom70To79(int number) {
        return (number >= 70) && (number <= 79);
    }
    boolean isRangeDFrom60To69(int number) {
        return (number >= 60) && (number <= 69);
    }
    boolean isRangeFFrom0To59(int number) {
        return (number >= 0) && (number <= 59);
    }
}

