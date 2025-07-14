package org.javaguru.student_evgeniy_shendelev.lesson_5.level_2;

class LeapYearDemo {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        for (int i = 0; i < 2025; i++) {
            if (leapYear.detect(i)) {
                System.out.println(i + ": leap");
            }
        }
    }

}
