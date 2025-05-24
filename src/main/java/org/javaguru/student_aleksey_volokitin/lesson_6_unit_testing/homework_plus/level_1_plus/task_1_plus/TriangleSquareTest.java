package org.javaguru.student_aleksey_volokitin.lesson_6_unit_testing.homework_plus.level_1_plus.task_1_plus;

class TriangleSquareTest {
    public static void main(String[] args) {
        TriangleSquareTest triangleSquareTest = new TriangleSquareTest();
        triangleSquareTest.test1();
        triangleSquareTest.test2();
        triangleSquareTest.test3();
        triangleSquareTest.test4();
        triangleSquareTest.test5();
        triangleSquareTest.test6();

    }

    void test1() {
        int a = 3;
        int b = 4;
        int c = 5;

        double expectedResultSemiPerimeter = 6.0;

        TriangleSquare triangleSquare1 = new TriangleSquare();
        double semiPerimeter = triangleSquare1.calculateSemiPerimeter(a, b, c);

        if (semiPerimeter == expectedResultSemiPerimeter) {
            System.out.println("Test 1 - OK");
        } else {
            System.out.println("Test 1 - FAIL");
        }
    }

    void test2() {
        int a = 6;
        int b = 5;
        int c = 2;

        double expectedResultSemiPerimeter = 6.5;

        TriangleSquare triangleSquare1 = new TriangleSquare();
        double semiPerimeter = triangleSquare1.calculateSemiPerimeter(a, b, c);

        if (semiPerimeter == expectedResultSemiPerimeter) {
            System.out.println("Test 2 - OK");
        } else {
            System.out.println("Test 2 - FAIL");
        }
    }

    void test3() {
        int a = 6;
        int b = 5;
        int c = 2;

        double expectedResultSemiPerimeter = 6.0;

        TriangleSquare triangleSquare1 = new TriangleSquare();
        double semiPerimeter = triangleSquare1.calculateSemiPerimeter(a, b, c);

        if (semiPerimeter != expectedResultSemiPerimeter) {
            System.out.println("Test 3 - OK");
        } else {
            System.out.println("Test 3 - FAIL");
        }
    }

    void test4() {
        int a = 3;
        int b = 4;
        int c = 5;

        double expectedResultTriangleSquare = 6.0;

        TriangleSquare triangleSquare1 = new TriangleSquare();
        double triangleSquare = triangleSquare1.calculateSquare(a, b, c);

        if (triangleSquare == expectedResultTriangleSquare) {
            System.out.println("Test 4 - OK");
        } else {
            System.out.println("Test 4 - FAIL");
        }
    }

    void test5() {
        int a = 6;
        int b = 5;
        int c = 2;

        double expectedResultTriangleSquare = 4.683748498798798;

        TriangleSquare triangleSquare1 = new TriangleSquare();
        double triangleSquare = triangleSquare1.calculateSquare(a, b, c);

        if (triangleSquare == expectedResultTriangleSquare) {
            System.out.println("Test 5 - OK");
        } else {
            System.out.println("Test 5 - FAIL");
        }
    }

    void test6() {
        int a = 6;
        int b = 5;
        int c = 2;

        double expectedResultTriangleSquare = 4.68;

        TriangleSquare triangleSquare1 = new TriangleSquare();
        double triangleSquare = triangleSquare1.calculateSquare(a, b, c);

        if (triangleSquare != expectedResultTriangleSquare) {
            System.out.println("Test 6 - OK");
        } else {
            System.out.println("Test 6 - FAIL");
        }
    }
}
