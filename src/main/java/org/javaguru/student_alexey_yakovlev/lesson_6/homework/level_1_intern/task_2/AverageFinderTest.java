package org.javaguru.student_alexey_yakovlev.lesson_6.homework.level_1_intern.task_2;

class AverageFinderTest {

    public static void main(String[] args) {
        AverageFinderTest averageFinderTest = new AverageFinderTest();
        averageFinderTest.test1();
        averageFinderTest.test2();
    }

    // 5, 7 -> 6
    public void test1() {
        AverageFinder averageFinder = new AverageFinder();
        int num1 = 5;
        int num2 = 7;

        int realResult = averageFinder.findAverage(num1, num2);
        if (realResult == 6) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    // 5, 4 -> 4
    public void test2() {
        AverageFinder averageFinder = new AverageFinder();
        int num1 = 5;
        int num2 = 4;

        int realResult = averageFinder.findAverage(num1, num2);
        if (realResult == 4) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }
}
