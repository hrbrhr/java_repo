package org.javaguru.student_grigoriy_emiliyanov.lesson_6_unit_testing.homework.level_1_intern;

class TriangleSquareTest {
    public static void main(String[] args) {
        TriangleSquareTest testSuite = new TriangleSquareTest();
        testSuite.testSemiPerimeter();
        testSuite.testArea();
    }

    private void testArea() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double actualResult = triangleSquare.calculateSquare(10, 12, 7);
        double expectedResult = 34.978;
        if (Math.abs(expectedResult - actualResult) < 0.01) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }

    private void testSemiPerimeter() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double actualResult = triangleSquare.calculateSemiPerimeter(10, 12, 7);
        double expectedResult = (10 + 12 + 7) / 2.0;
        if (Math.abs(expectedResult - actualResult) < 0.01) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }
}
