package org.javaguru.student_alexey_yakovlev.lesson_6.homework.level_3_junior.task_1;

class SquareEquationTest {

    public static void main(String[] args) {
        SquareEquationTest squareEquationTest = new SquareEquationTest();
        squareEquationTest.test1Discriminant();
        squareEquationTest.test2SquareRoot();
        squareEquationTest.test3FirstRoot();
        squareEquationTest.test4SecondRoot();

    }

    public void test1Discriminant() {
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.discriminant(2, 5, 3);

        if (Math.abs(realResult - 1.0) < 0.00001) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test2SquareRoot() {
        SquareEquation squareEquation = new SquareEquation();
        boolean realResult = squareEquation.isSquareRoot(2, 5, 3);

        if (realResult == true) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void test3FirstRoot() {
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.discriminant(2, 5, 3);
//        System.out.println(squareEquation.firstRoot(2, 5, 3));

        if ((Math.abs(realResult) - 1.5) < 0.00001) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

    public void test4SecondRoot() {
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.discriminant(2, 5, 3);
//        System.out.println(squareEquation.firstRoot(2, 5, 3));

        if ((Math.abs(realResult) - 1.5) < 0.00001) {
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = FAIL");
        }
    }


}
