package org.javaguru.student_vitalii_lutsenko.lesson_6.homework.task_1;


class TriangleSquareTestMentorVersion {

    public static void main(String[] args) {
        TriangleSquareTestMentorVersion test = new TriangleSquareTestMentorVersion();
        test.shouldCalculateSemiPerimeter();
        test.shouldCalculateSquare();
    }

    public void shouldCalculateSemiPerimeter() {
       TriangleSquare triangleSquare = new TriangleSquare();
        double semiPerimeter = triangleSquare.calculateSemiPerimeter(4, 3, 5);
        checkResult(semiPerimeter, 6.0, "shouldCalculateSemiPerimeter");
    }

    public void shouldCalculateSquare() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double square = triangleSquare.calculateSquare(4, 3, 5);
        checkResult(square, 6.0, "shouldCalculateSquare");
    }

    private void checkResult(double realResult, double expectedResult, String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL! expected = " + expectedResult + " but realResult = " + realResult);
        }
    }
    //Это универсальный метод сравнения результатов, который:

    //даёт понятный вывод на консоль,

   // использует допуск threshold (это обязательно для double),

    //упрощает повторное использование кода.



}
