package org.javaguru.student_alexey_yakovlev.lesson_8.lessoncode;

class SchoolDairyTest {

    public static void main(String[] args) {
        SchoolDairyTest schoolDairyTest = new SchoolDairyTest();
        schoolDairyTest.test1();
        schoolDairyTest.test2();
        schoolDairyTest.test3();
        schoolDairyTest.test4();
        schoolDairyTest.test5();
    }

    public void test1() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 5);
        int realResult = schoolDairy.findMaxMark("Math");

        if (realResult == 5) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    public void test2() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 5);
        schoolDairy.addMark("Math", 4);
        int realResult = schoolDairy.findMaxMark("Math");
        if (realResult == 5) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

    public void test3() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 5);
        schoolDairy.addMark("Math", 5);
        int realResult = schoolDairy.findMaxMark("Math");
        if (realResult == 5) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }

    public void test4() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 0);
        int realResult = schoolDairy.findMaxMark("Math");
        if (realResult == 0) {
            System.out.println("Test 4 = OK");
        } else {
            System.out.println("Test 4 = FAIL");
        }
    }

    public void test5() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 5);
        schoolDairy.addMark("Eng", 10);
        int realResult = schoolDairy.findMaxMark("Math");
        if (realResult == 5) {
            System.out.println("Test 5 = OK");
        } else {
            System.out.println("Test 5 = FAIL");
        }
    }

}
