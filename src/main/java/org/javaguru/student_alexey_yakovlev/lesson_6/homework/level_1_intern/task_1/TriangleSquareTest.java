package org.javaguru.student_alexey_yakovlev.lesson_6.homework.level_1_intern.task_1;

class TriangleSquareTest {

    public static void main(String[] args) {
        TriangleSquareTest triangleSquareTest = new TriangleSquareTest();
        triangleSquareTest.test1();
        triangleSquareTest.test2();

    }

    public void test1() {
        TriangleSquare triangleSquare = new TriangleSquare();

        double realResult = triangleSquare.calculateSemiPerimeter(4, 3, 5);
        checkResult(realResult, 6, "test1");
    }

    public void test2() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realResult = triangleSquare.calculateSquare(4, 3, 5);
        checkResult(realResult, 6, "test2");
    }

    private void checkResult(double realResult, double expectedResult, String numberTest) {
        if (Math.abs(realResult - expectedResult) < 0.000001) {
            System.out.println(numberTest + ": TEST OK!");
        } else {
            System.out.println(numberTest + ": TEST FAIL! expected = " + expectedResult + " but realResult = " + realResult);
        }
    }


}
