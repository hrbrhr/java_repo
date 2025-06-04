package org.javaguru.student_anastassija.lesson_6.homework.level_1;

public class TriangleSquareTest {

    public static void main(String[] args) {

        TriangleSquareTest test = new TriangleSquareTest();
        test.test1();
        test.test2();
    }
// a=2, b=3, c=4
// S = 2.9047375
public void test1() {

    TriangleSquare triangleSquare = new TriangleSquare();
    double realResult = triangleSquare.calculateSquare(2,3,4);

    if (Math.abs(realResult - 2.9047375) < 0.00001){
        System.out.println("TEST 1 = OK");
    } else {
        System.out.println("TEST 1 = FALSE");
    }
}
    // a=1, b=1, c=1
// S = 0.4330127
    public void test2() {

        TriangleSquare triangleSquare = new TriangleSquare();
        double realResult = triangleSquare.calculateSquare(1,1,1);

        if (Math.abs(realResult - 0.4330127) < 0.00001){
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FALSE");
        }
    }
}
