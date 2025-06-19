package org.javaguru.student_evgenii_pashtaev.lesson_8.lessoncode;

public class SchoolDairyTest {

    public static void main(String[] args) {
        SchoolDairyTest test = new SchoolDairyTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
    }

    public void test1() {
        SchoolDairy dairy = new SchoolDairy();
        dairy.addMark("Math", 5);
        int result = dairy.findMaxMark("Math");
        if (result == 5) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAILED");
        }
    }

    public void test2() {
        SchoolDairy dairy = new SchoolDairy();
        dairy.addMark("Math", 5);
        dairy.addMark("Math", 10);
        int result = dairy.findMaxMark("Math");
        if (result == 10) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAILED");
        }
    }

    public void test3() {
        SchoolDairy dairy = new SchoolDairy();
        dairy.addMark("Math", 5);
        dairy.addMark("Math", 9);
        dairy.addMark("English", 9);
        int result = dairy.findMaxMark("Math");
        if (result == 9) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAILED");
        }
    }

    public void test4() {
        SchoolDairy dairy = new SchoolDairy();
        dairy.addMark("Math", 5);
        dairy.addMark("Math", 9);
        dairy.addMark("English", 9);
        int result = dairy.findMinMark("Math");
        if (result == 5.0) {
            System.out.println("Test 4 = OK");
        } else {
            System.out.println("Test 4 = FAILED");
        }
    }

    public void test5() {
        SchoolDairy dairy = new SchoolDairy();
        dairy.addMark("Math", 5);
        dairy.addMark("Math", 10);
        dairy.addMark("English", 9);
        double result = dairy.findMidMark("Math");
        if (result < 7.6 && result >= 7.5 ) {
            System.out.println("Test 5 = OK");
        } else {
            System.out.println("Test 5 = FAILED");
        }
    }

    public void test6() {
        SchoolDairy dairy = new SchoolDairy();
        dairy.addMark("Math", 5);
        dairy.addMark("Math", 10);
        dairy.addMark("English", 9);
        double result = dairy.findMidMarkAll("Math");
        if (result < 8.1 && result >= 8 ) {
            System.out.println("Test 6 = OK");
        } else {
            System.out.println("Test 6 = FAILED");
        }
    }
}