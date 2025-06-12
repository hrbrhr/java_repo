package org.javaguru.student_elena_tiutiunnikova.lesson_6.homework.level_1_intern.task_2;

class AverageFinderTest {
    public static void main(String[] args) {
    AverageFinderTest test = new AverageFinderTest();
    test.test1();
    test.test2();
    }

    // 1, 2 -> 1,5
    public void test1 () {
        int num1 = 1;
        int num2 = 2;

        AverageFinder averageFinder = new AverageFinder();
        double realResult = averageFinder.findAverage(num1, num2);

        if (Math.abs(realResult - 1.5 ) < 0.001) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    // 4, 2 -> 3
    public void test2 () {
        int num1 = 4;
        int num2 = 2;

        AverageFinder averageFinder = new AverageFinder();
        double realResult = averageFinder.findAverage(num1, num2);

        if (Math.abs(realResult - 3 ) < 0.001) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }


}
