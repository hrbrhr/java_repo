package org.javaguru.student_elena_tiutiunnikova.lesson_6.homework.level_1_intern;

class TriangleSquareTest {

    public static void main(String[] args) {
        TriangleSquareTest test = new TriangleSquareTest();
        test.testCalculateSemiPerimeter();
        test.testCalculateSquare();
    }

    //полупериметр стороны стороны 2х3х3 => 4
    public void testCalculateSemiPerimeter () {
    int a = 2;
    int b = 3;
    int c = 3;

    TriangleSquare triangleSquare = new TriangleSquare();
    double realResult = triangleSquare.calculateSemiPerimeter( a, b, c );

    if (Math.abs(realResult - 4.0) < 0.00001) {
        System.out.println("Test Semi Perimeter = OK");
    } else {
        System.out.println("Test Semi Perimeter = FAIL");
        }
    }


    //площадь 2 3 3 => 2.828
    public void testCalculateSquare () {
        int a = 2;
        int b = 3;
        int c = 3;

        TriangleSquare triangleSquare = new TriangleSquare();
        double realResult = triangleSquare.calculateSquare( a, b, c );

        if (Math.abs(realResult - 2.828) < 0.001) {
            System.out.println("Test Semi Perimeter = OK");
        } else {
            System.out.println("Test Semi Perimeter = FAIL");
        }
    }

}
