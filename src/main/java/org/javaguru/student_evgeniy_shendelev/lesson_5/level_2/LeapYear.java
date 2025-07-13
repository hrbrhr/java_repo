package org.javaguru.student_evgeniy_shendelev.lesson_5.level_2;

class LeapYear {
    boolean detect(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || year % 400 == 0);
    }
}
