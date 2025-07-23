package org.javaguru.student_vasilii_khvan.lesson_5.level_2.task_1;

class LeapYearDetector {

    boolean isDividedBy4(int year) {
        return year % 4 == 0;
    }

    boolean isDividedBy100(int year) {
        return year % 100 == 0;
    }

    boolean isDividedBy400(int year) {
        return year % 400 == 0;
    }

    String detect(int year) {
        if ((isDividedBy4(year) && !isDividedBy100(year)) || isDividedBy400(year)) {
            return "Leap Year";
        } else {
            return "Common Year";
        }
    }
}
