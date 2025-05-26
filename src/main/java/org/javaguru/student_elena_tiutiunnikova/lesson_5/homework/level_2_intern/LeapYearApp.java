package org.javaguru.student_elena_tiutiunnikova.lesson_5.homework.level_2_intern;

class LeapYearApp {
    public static void main(String[] args) {

        LeapYear leapYear = new LeapYear();
        int year1 = 2024;
        if (leapYear.leapYear(year1)) {
            System.out.println("Год високосный.");}
        else { System.out.println("Год НЕ високосный.");
        }

    }
}
