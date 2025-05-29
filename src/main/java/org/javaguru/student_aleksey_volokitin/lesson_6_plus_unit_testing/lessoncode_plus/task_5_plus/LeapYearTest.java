package org.javaguru.student_aleksey_volokitin.lesson_6_plus_unit_testing.lessoncode_plus.task_5_plus;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.test1();
        leapYearTest.test2();
        leapYearTest.test3();
        leapYearTest.test4();
    }
    void test1() {
        int year = 2024;
        boolean expectedResult = true;

        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeap(year);
        if (expectedResult == result) {
            System.out.println("Test 1 - OK");
        }
        else {
            System.out.println("Test 1 - FAIL");
        }
    }
    void test2() {
        int year = 2000;
        boolean expectedResult = true;

        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeap(year);
        if (expectedResult == result) {
            System.out.println("Test 2 - OK");
        }
        else {
            System.out.println("Test 2 - FAIL");
        }
    }
    void test3() {
        int year = 1900;
        boolean expectedResult = false;

        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeap(year);
        if (expectedResult == result) {
            System.out.println("Test 3 - OK");
        }
        else {
            System.out.println("Test 3 - FAIL");
        }
    }
    void test4() {
        int year = 2023;
        boolean expectedResult = false;

        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeap(year);
        if (expectedResult == result) {
            System.out.println("Test 4 - OK");
        }
        else {
            System.out.println("Test 4 - FAIL");
        }
    }
}
