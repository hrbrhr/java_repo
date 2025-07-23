package org.javaguru.student_grigoriy_emiliyanov.lesson_6_unit_testing.homework.level_3_junior;

class SquareEquationTest {
    public static void main(String[] args) {
        SquareEquationTest suite = new SquareEquationTest();
        suite.testDiscriminant();
        suite.testIsSquareRootTrue();
        suite.testIsSquareRootFalse();
        suite.testFirstRoot();
        suite.testSecondRoot();
    }

    private void testSecondRoot() {
        SquareEquation equation = new SquareEquation();
        int a = 1;
        int b = -7;
        int c = -17;
        double expected = 8.908;
        checkExpect(expected, equation.secondRoot(a, b, c), "should find second root");
    }

    private void testFirstRoot() {
        SquareEquation equation = new SquareEquation();
        int a = 1;
        int b = -7;
        int c = -17;
        double expected = -1.908;
        checkExpect(expected, equation.firstRoot(a, b, c), "should find first root");
    }

    private void testIsSquareRootTrue() {
        SquareEquation equation = new SquareEquation();
        int a = 1;
        int b = -7;
        int c = -17;
        boolean expected = true;
        checkExpect(expected, equation.isSquareRoot(a, b, c), "should have roots");
    }

    private void testIsSquareRootFalse() {
        SquareEquation equation = new SquareEquation();
        int a = 1;
        int b = -4;
        int c = 5;
        boolean expected = false;
        checkExpect(expected, equation.isSquareRoot(a, b, c), "should not have roots");
    }
    private void testDiscriminant() {
        SquareEquation equation = new SquareEquation();
        int a = 1;
        int b = -7;
        int c = -17;
        double expected = 117;
        checkExpect(expected, equation.discriminant(a, b, c), "Check determinant");
    }


    private void checkExpect(double expected, double real, String testCaseName) {
        double epsilon = 0.001;
        if (Math.abs(expected - real) < epsilon) {
            System.out.println(testCaseName + ": TEST OK!");
        } else {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + real);
        }
    }

    private void checkExpect(int expected, int real, String testCaseName) {
        if (real == expected) {
            System.out.println(testCaseName + ": TEST OK!");
        } else {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + real);
        }
    }

    private void checkExpect(boolean expected, boolean real, String testCaseName) {
        if (real == expected) {
            System.out.println(testCaseName + ": TEST OK!");
        } else {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + real);
        }
    }
}
