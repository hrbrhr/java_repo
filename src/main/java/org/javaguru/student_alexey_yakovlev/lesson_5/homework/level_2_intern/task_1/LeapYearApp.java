package org.javaguru.student_alexey_yakovlev.lesson_5.homework.level_2_intern.task_1;

class LeapYearApp {

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();

        int year1 = 2000;
        int year2 = 2020;
        int year3 = 2022;
        int year4 = 2025;
        int year5 = 1900;

        System.out.println(leapYear.detectYear(year1));
        System.out.println(leapYear.detectYear(year2));
        System.out.println(leapYear.detectYear(year3));
        System.out.println(leapYear.detectYear(year4));
        System.out.println(leapYear.detectYear(year5));

    }
}
