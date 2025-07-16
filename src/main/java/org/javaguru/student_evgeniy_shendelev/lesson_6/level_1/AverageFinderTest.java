package org.javaguru.student_evgeniy_shendelev.lesson_6.level_1;

public class AverageFinderTest {
    public static void main(String[] args) {
        AverageFinderTest averageFinderTest = new AverageFinderTest();
        averageFinderTest.averageTest();
        averageFinderTest.averageTestOne();
    }

    public void averageTest() {
        AverageFinder af = new AverageFinder();
        int dataA = 4;
        int dataB = 6;
        double expect = (double) (dataA + dataB) / 2;

        checker(af.findAverage(dataA, dataB), expect);
    }


    public void averageTestOne() {
        AverageFinder af = new AverageFinder();
        int dataA = 7;
        int dataB = 12;
        double expect = (double) (dataA + dataB) / 2;

        checker(af.findAverage(dataA, dataB), expect);
    }

    private void checker(double result, double expect) {
        if (result == expect) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }
}

