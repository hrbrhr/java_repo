package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.homework_plus.level_2_plus;

class LeapYearApp {
    public static void main(String[] args) {

        LeapYear leapYear = new LeapYear();

        int year1 = 1900; // is not leap year
        System.out.println("Year " + year1 + " is leap: " + leapYear.isLeap(year1));
        int year2 = 2000;// is leap year
        System.out.println("Year " + year2 + " is leap: " + leapYear.isLeap(year2));
        int year3 = 2023;// is not leap year
        System.out.println("Year " + year3 + " is leap: " + leapYear.isLeap(year3));
        int year4 = 2024;// is leap year
        System.out.println("Year " + year4 + " is leap: " + leapYear.isLeap(year4));
    }
}
