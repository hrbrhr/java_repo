package org.javaguru.student_anastassija.lesson_5.level_2;

public class LeapYearApplication {

    public static void main(String[] args) {

        LeapYear leapYear = new LeapYear();

        System.out.println(leapYear.detect(1983));
        System.out.println(leapYear.detect(2008));
        System.out.println(leapYear.detect(2013));
        System.out.println(leapYear.detect(1973));
        System.out.println(leapYear.detect(1961));
        System.out.println(leapYear.detect(1951));
    }
}
