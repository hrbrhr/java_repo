package org.javaguru.student_aleksey_volokitin.lesson_6_plus_unit_testing.lessoncode_plus.task_5_plus;

class LeapYear {
    boolean isLeap (int year) {
        /*
        Год является високосным, если выполняется одно из следующих условий:
            - Год делится на 4, но не делится на 100.
            - Год делится на 400.
        Иначе год не високосный.
      */
        return ((year % 4 == 0) && (year % 100 !=0)) || (year % 400 == 0);
    }
}
