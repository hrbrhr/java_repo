package org.javaguru.student_elena_tiutiunnikova.lesson_5.homework.level_2_intern;

class LeapYear {
    boolean leapYear (int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
}
