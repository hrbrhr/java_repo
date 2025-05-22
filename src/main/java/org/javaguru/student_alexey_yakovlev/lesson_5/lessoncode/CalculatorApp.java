package org.javaguru.student_alexey_yakovlev.lesson_5.lessoncode;

class CalculatorApp {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        boolean result1 = calculator.isEven(6);
        boolean result2 = calculator.isEven(7);

        System.out.println(result1);
        System.out.println(result2);

        System.out.println();

        boolean result3 = calculator.isOdd(6);
        boolean result4 = calculator.isOdd(7);

        System.out.println(result3);
        System.out.println(result4);

        System.out.println();

        int result5 = calculator.findAverage(6, 7);
        System.out.println(result5);

        System.out.println();

        double result6 = calculator.findAverage2(6, 7);
        System.out.println(result6);

        System.out.println();

        int max1 = calculator.findMax(6, 7);
        System.out.println(max1);

        int max2 = calculator.findMax(7, 6);
        System.out.println(max2);


    }
}
