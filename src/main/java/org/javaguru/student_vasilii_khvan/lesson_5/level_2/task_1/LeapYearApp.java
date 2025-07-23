package org.javaguru.student_vasilii_khvan.lesson_5.level_2.task_1;

class LeapYearApp {

    public static void main(String[] args) {
        LeapYearDetector leapYearDetector = new LeapYearDetector();
        System.out.println(leapYearDetector.detect(1900));
        System.out.println(leapYearDetector.detect(2000));
        System.out.println(leapYearDetector.detect(2012));
        System.out.println(leapYearDetector.detect(1997));
    }
}
