package org.javaguru.student_aleksey_volokitin.lesson_6_unit_testing.homework_plus.level_3_plus;

class SquareEquationTest {
    private double thresholdValue = 0.000001d;

    public static void main(String[] args) {
        SquareEquationTest test = new SquareEquationTest();
        test.testDiscriminant();
        test.testDiscriminant2();
        test.testExistingSquareRoot();
        test.testExistingSquareRoot2();
        test.testFindFirstRoot();
        test.testFindFirstRoot2();
        test.testSecondRoot();
        test.testSecondRoot2();
    }

    // 1. a = 2, b = -4, c =  2: D =   0, корни - есть, корень 1 =  1, корень 2 = 1.
    // 2. a = 2, b = -1, c =  1: D =  -7, корни -  нет.
    // 1. a = 1, b = -4, c = -5: D =  36, корни - есть, корень 1 = -1, корень 2 = 5.

    void testDiscriminant() {
        SquareEquation squareEquation = new SquareEquation();
        int a = 2;
        int b = -4;
        int c = 2;
        String testTitle = "Test 1: calculate discriminant";
        double expectedResult = 0.0d;
        double result = squareEquation.discriminant(a, b, c);
        printResult(expectedResult, result, testTitle);
    }

    void testDiscriminant2() {
        SquareEquation squareEquation = new SquareEquation();
        int a = 2;
        int b = -1;
        int c = 1;
        String testTitle = "Test 2: calculate discriminant";
        double expectedResult = -7;
        double result = squareEquation.discriminant(a, b, c);
        printResult(expectedResult, result, testTitle);
    }

    void testExistingSquareRoot() {
        SquareEquation squareEquation = new SquareEquation();
        int a = 1;
        int b = -4;
        int c = -5;
        String testTitle = "Test 3: existing roots";
        boolean expectedResult = true;
        boolean result = squareEquation.isSquareRoot(a, b, c);
        printBooleanResult(expectedResult, result, testTitle);
    }

    void testExistingSquareRoot2() {
        SquareEquation squareEquation = new SquareEquation();
        int a = 2;
        int b = -1;
        int c = 1;
        String testTitle = "Test 4: existing roots";
        boolean expectedResult = false;
        boolean result = squareEquation.isSquareRoot(a, b, c);
        printBooleanResult(expectedResult, result, testTitle);
    }

    void testFindFirstRoot() {
        SquareEquation squareEquation = new SquareEquation();
        int a = 2;
        int b = -4;
        int c = 2;
        String testTitle = "Test 5: calculate first root";
        double expectedResult = 1;
        double result = squareEquation.firstRoot(a, b, c);
        printResult(expectedResult, result, testTitle);
    }

    void testFindFirstRoot2() {
        SquareEquation squareEquation = new SquareEquation();
        int a = 1;
        int b = -4;
        int c = -5;
        String testTitle = "Test 6: calculate first root";
        double expectedResult = -1;
        double result = squareEquation.firstRoot(a, b, c);
        printResult(expectedResult, result, testTitle);
    }

    void testSecondRoot() {
        SquareEquation squareEquation = new SquareEquation();
        int a = 2;
        int b = -4;
        int c = 2;
        String testTitle = "Test 7: calculate second root";
        double expectedResult = 1;
        double result = squareEquation.secondRoot(a, b, c);
        printResult(expectedResult, result, testTitle);
    }

    void testSecondRoot2() {
        SquareEquation squareEquation = new SquareEquation();
        int a = 1;
        int b = -4;
        int c = -5;
        String testTitle = "Test 8: calculate second root";
        double expectedResult = 5;
        double result = squareEquation.secondRoot(a, b, c);
        printResult(expectedResult, result, testTitle);
    }

    void printResult (double expectedResult, double result, String testTitle) {
        if (Math.abs(expectedResult - result) < thresholdValue) {
            System.out.println(testTitle + " - OK");
        }
        else {
            System.out.println(testTitle + " - FAIL");
        }
    }

    void printBooleanResult (boolean expectedResult, boolean result, String testTitle) {
        if (expectedResult == result) {
            System.out.println(testTitle + " - OK");
        }
        else {
            System.out.println(testTitle + " - FAIL");
        }
    }
}
