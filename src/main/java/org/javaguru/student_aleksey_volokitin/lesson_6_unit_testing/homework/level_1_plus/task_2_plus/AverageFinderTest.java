package org.javaguru.student_aleksey_volokitin.lesson_6_unit_testing.homework.level_1_plus.task_2_plus;

class AverageFinderTest {
    public static void main(String[] args) {
        AverageFinderTest averageFinderTest = new AverageFinderTest();

        averageFinderTest.test1();
        averageFinderTest.test2();

    }
    void test1() {
        int num1 = 2;
        int num2 = 4;
        double expectedResult = 3.0;

        AverageFinder averageFinder = new AverageFinder();
        double result = averageFinder.findAverage(num1, num2);

        if (result == expectedResult) { System.out.println("Test 1 - OK"); }
        else                          { System.out.println("Test 1 - FAIL"); }
    }

    void test2() {
        int num1 = 2;
        int num2 = 3;
        double expectedResult = 2.5;

        AverageFinder averageFinder = new AverageFinder();
        double result = averageFinder.findAverage(num1, num2);

        if (result == expectedResult) { System.out.println("Test 2 - OK"); }
        else                          { System.out.println("Test 2 - FAIL"); }
    }
}
