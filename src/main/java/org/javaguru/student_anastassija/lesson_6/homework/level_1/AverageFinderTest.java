package org.javaguru.student_anastassija.lesson_6.homework.level_1;

public class AverageFinderTest {

    public static void main(String[] args) {

        AverageFinderTest test = new AverageFinderTest();
        test.test1();
        test.test2();
        test.test3();

    }
//5,3 -> 4
    public void test1() {
        int num1 = 5;
        int num2 = 3;

        AverageFinder averageFinder = new AverageFinder();
        double result = averageFinder.findAverage(num1,num2);

        if (Math.abs(result - 4.0) < 0.00001) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FALSE");
        }
    }
    //5,6 -> 5.5
    public void test2() {
        int num1 = 5;
        int num2 = 6;

        AverageFinder averageFinder = new AverageFinder();
        double result = averageFinder.findAverage(num1,num2);

        if (Math.abs(result - 5.5) < 0.00001) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FALSE");
        }
    }
//78,45-> 61.5
    public void test3() {
        int num1 = 78;
        int num2 = 45;

        AverageFinder averageFinder = new AverageFinder();
        double result = averageFinder.findAverage(num1,num2);

        if (Math.abs(result - 61.5) < 0.00001) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FALSE");
        }
    }
}
