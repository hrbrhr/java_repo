package org.javaguru.student_grigoriy_emiliyanov.lesson_6_unit_testing.lessoncode.tasks;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest testSuite = new LeapYearTest();
        testSuite.test1();
        testSuite.test2();
        testSuite.test3();
    }

    private void test1() {
        LeapYear leapYear = new LeapYear();
        int year = 2012;
        if (leapYear.isLeapYear(year)) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }


    private void test2() {
        LeapYear leapYear = new LeapYear();
        int year = 1600;
        if (leapYear.isLeapYear(year)) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }

    private void test3() {
        LeapYear leapYear = new LeapYear();
        int year = 2000;
        if (leapYear.isLeapYear(year)) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }

}
