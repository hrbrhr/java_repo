package org.javaguru.student_alexey_yakovlev.lesson_5.homework.level_2_intern.task_1;

class LeapYear {

    String detectYear (int year) {
        if (isLeap(year)) {
            return "Year is leap";
        }
        return "This year is not a leap";
    }

    private boolean isLeap(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}
