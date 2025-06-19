package org.javaguru.student_alexey_yakovlev.lesson_8.lessoncode;

class SchoolDairyTest {

    public static void main(String[] args) {
        SchoolDairyTest schoolDairyTest = new SchoolDairyTest();
        schoolDairyTest.test1();
        schoolDairyTest.test2();
        schoolDairyTest.test3();
        schoolDairyTest.test4();
        schoolDairyTest.test5();

        schoolDairyTest.test6();
        schoolDairyTest.test7();
        schoolDairyTest.test8();
        schoolDairyTest.test9();
        schoolDairyTest.test10();

        schoolDairyTest.test11();
        schoolDairyTest.test12();
        schoolDairyTest.test13();
        schoolDairyTest.test14();
        schoolDairyTest.test15();

        schoolDairyTest.test16();
        schoolDairyTest.test17();
        schoolDairyTest.test18();
        schoolDairyTest.test19();
        schoolDairyTest.test20();
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


    public void test6() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Biology", 5);
        int realResult = schoolDairy.findMinMark("Biology");

        if (realResult == 5) {
            System.out.println("Test 6 = OK");
        } else {
            System.out.println("Test 6 = FAIL");
        }
    }

    public void test7() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Biology", 5);
        schoolDairy.addMark("Biology", 4);
        int realResult = schoolDairy.findMinMark("Biology");
        if (realResult == 4) {
            System.out.println("Test 7 = OK");
        } else {
            System.out.println("Test 7 = FAIL");
        }
    }

    public void test8() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Biology", 5);
        schoolDairy.addMark("Biology", 5);
        int realResult = schoolDairy.findMinMark("Biology");
        if (realResult == 5) {
            System.out.println("Test 8 = OK");
        } else {
            System.out.println("Test 8 = FAIL");
        }
    }

    public void test9() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Biology", 0);
        int realResult = schoolDairy.findMinMark("Biology");
        if (realResult == 0) {
            System.out.println("Test 9 = OK");
        } else {
            System.out.println("Test 9 = FAIL");
        }
    }

    public void test10() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Biology", 5);
        schoolDairy.addMark("Eng", 10);
        int realResult = schoolDairy.findMinMark("Biology");
        if (realResult == 5) {
            System.out.println("Test 10 = OK");
        } else {
            System.out.println("Test 10 = FAIL");
        }
    }

    public void test11() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 5);
        double realResult = schoolDairy.findAvgMark("Math");
        if (realResult == 5) {
            System.out.println("Test 11 = OK");
        } else {
            System.out.println("Test 11 = FAIL");
        }
    }

    public void test12() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 5);
        schoolDairy.addMark("Math", 4);
        double realResult = schoolDairy.findAvgMark("Math");
        if ((realResult - 4.5) < 0.0001) {
            System.out.println("Test 12 = OK");
        } else {
            System.out.println("Test 12 = FAIL");
        }
    }

    public void test13() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 5);
        schoolDairy.addMark("Math", 5);
        double realResult = schoolDairy.findAvgMark("Math");
        if ((realResult - 5) < 0.0001) {
            System.out.println("Test 13 = OK");
        } else {
            System.out.println("Test 13 = FAIL");
        }
    }

    public void test14() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 0);
        double realResult = schoolDairy.findAvgMark("Math");
        if (realResult == 0) {
            System.out.println("Test 14 = OK");
        } else {
            System.out.println("Test 14 = FAIL");
        }
    }

    public void test15() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 5);
        schoolDairy.addMark("Eng", 10);
        double realResult = schoolDairy.findAvgMark("Math");
        if ((realResult - 5) < 0.0001) {
            System.out.println("Test 15 = OK");
        } else {
            System.out.println("Test 15 = FAIL");
        }
    }

    public void test16() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 5);
        double realResult = schoolDairy.findTotalAvgMark();
        if ((realResult - 5) < 0.0001) {
            System.out.println("Test 16 = OK");
        } else {
            System.out.println("Test 16 = FAIL");
        }
    }

    public void test17() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 5);
        schoolDairy.addMark("Math", 4);
        double realResult = schoolDairy.findTotalAvgMark();
        if ((realResult - 4.5) < 0.0001) {
            System.out.println("Test 17 = OK");
        } else {
            System.out.println("Test 17 = FAIL");
        }
    }

    public void test18() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 5);
        schoolDairy.addMark("Math", 5);
        double realResult = schoolDairy.findTotalAvgMark();
        if ((realResult - 5) < 0.0001) {
            System.out.println("Test 18 = OK");
        } else {
            System.out.println("Test 18 = FAIL");
        }
    }

    public void test19() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 0);
        double realResult = schoolDairy.findTotalAvgMark();
        if (realResult == 0) {
            System.out.println("Test 19 = OK");
        } else {
            System.out.println("Test 19 = FAIL");
        }
    }

    public void test20() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 5);
        schoolDairy.addMark("Eng", 10);
        double realResult = schoolDairy.findTotalAvgMark();
        if ((realResult - 7.5) < 0.0001) {
            System.out.println("Test 20 = OK");
        } else {
            System.out.println("Test 20 = FAIL");
        }
    }

}
