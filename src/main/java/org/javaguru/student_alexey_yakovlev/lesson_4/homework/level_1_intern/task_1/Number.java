package org.javaguru.student_alexey_yakovlev.lesson_4.homework.level_1_intern.task_1;

class Number {

    String foundDay(int num) {
        String day = "";
        if (num == 1) {
            day = "Monday";
        } else if (num == 2) {
            day = "Tuesday";
        } else if (num == 3) {
            day = "Wednesday";
        } else if (num == 4) {
            day = "Thursday";
        } else if (num == 5) {
            day = "Friday";
        } else if (num == 6) {
            day = "Saturday";
        } else if (num == 7) {
            day = "Sunday";
        }
        return day;
    }
}
