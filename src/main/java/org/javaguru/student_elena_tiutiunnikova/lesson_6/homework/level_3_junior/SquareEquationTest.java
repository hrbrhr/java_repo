package org.javaguru.student_elena_tiutiunnikova.lesson_6.homework.level_3_junior;

import javax.naming.NameNotFoundException;

class SquareEquationTest {

    public static void main(String[] args) {
    SquareEquationTest test = new SquareEquationTest();
    test.discriminantTest1();
    test.discriminantTest2();

    test.isSquareRootTest1();
    test.isSquareRootTest2();

    test.firstRootTest();
    test.secondRootTest();
   }

    // a 1, b 4, c 3 -> 4
    public void discriminantTest1 () {
    double realResult = new SquareEquation().discriminant(1, 4, 3);
    if (Math.abs(realResult) - 4.0 < 0.001) {
        System.out.println("Test discriminant 1 = OK");
    } else {
        System.out.println("Test discriminant 1 = FAIL");
    }
    }

    // a 3, b 5, c 10 -> -95
    public void discriminantTest2 () {
        double realResult = new SquareEquation().discriminant(3, 5, 10);
        if (Math.abs(realResult - (-95.0)) < 0.0001) {
            System.out.println("Test discriminant 2 = OK");
        } else {
            System.out.println("Test discriminant 2 = FAIL");
        }
    }

    // a 1, b 4, c 3 -> 4 true
    public void isSquareRootTest1 () {
        boolean realResult = new SquareEquation().isSquareRoot(1,4,3);
        if (realResult == true) {
            System.out.println("Test isSquareRoot 1 = OK");
        } else {
            System.out.println("Test isSquareRoot 1 = FAIL");
        }
    }

    // a 3, b 5, c 10 -> 4 false
    public void isSquareRootTest2 () {
        boolean realResult = new SquareEquation().isSquareRoot(3,5,10);
        if (realResult == false) {
            System.out.println("Test isSquareRoot 2 = OK");
        } else {
            System.out.println("Test isSquareRoot 2 = FAIL");
        }
    }

    // a 1, b 4, c 3 -> -3
    public void firstRootTest () {
        double realResult = new SquareEquation().firstRoot(1,4,3);
        if (Math.abs(realResult - (-3)) < 0.0001) {
            System.out.println("Test firstRoot = OK");
        } else {
            System.out.println("Test firstRoot = FAIL");
        }
    }

    // a 1, b 4, c 3 -> -3
    public void secondRootTest () {
        double realResult = new SquareEquation().secondRoot(1,4,3);
        if (Math.abs(realResult - (-1)) < 0.0001) {
            System.out.println("Test secondRoot = OK");
        } else {
            System.out.println("Test secondRoot = FAIL");
        }
    }

}