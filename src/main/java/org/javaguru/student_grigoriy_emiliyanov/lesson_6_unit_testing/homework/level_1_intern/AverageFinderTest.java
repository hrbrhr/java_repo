package org.javaguru.student_grigoriy_emiliyanov.lesson_6_unit_testing.homework.level_1_intern;

class AverageFinderTest {
    public static void main(String[] args) {
        AverageFinderTest suite = new AverageFinderTest();
        suite.test();
    }

    private void test() {
        AverageFinder averageFinder = new AverageFinder();
        double actualResult = averageFinder.findAverage(10, 11);
        double expectedResult = 10.5;
        if (Math.abs(expectedResult - actualResult) < 0.01) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }
}
