package org.javaguru.student_anastassija.lesson_5;

public class CalculatorApplication {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        boolean isEvenResult1 = calculator.isEven(number1);
        boolean isEvenResult2 = calculator.isEven(number2);
        boolean isEvenResult3 = calculator.isEven(number3);

        System.out.println("isEven result1 = " + isEvenResult1);
        System.out.println("isEven result2 = " + isEvenResult2);
        System.out.println("isEven result3 = " + isEvenResult3);

        boolean isOddResult1 = calculator.isOdd(number1);
        boolean isOddResult2 = calculator.isOdd(number2);
        boolean isOddResult3 = calculator.isOdd(number3);

        System.out.println("isEven result1 = " + isOddResult1);
        System.out.println("isEven result2 = " + isOddResult2);
        System.out.println("isEven result3 = " + isOddResult3);

        double isAverageResult1 = calculator.findAverage2(10, 20);
        double isAverageResult2 = calculator.findAverage2(1, 2);

        System.out.println("findAverage result1 = " + isAverageResult1);
        System.out.println("findAverage result2 = " + isAverageResult2);

        int isFindMaxResult1 = calculator.findMax(10, 10);
        int isFindMaxResult2 = calculator.findMax(1, 2);

        System.out.println("findMax result1 = " + isFindMaxResult1);
        System.out.println("findMax result2 = " + isFindMaxResult2);

        int isFindMax2Result1 = calculator.findMax2(10, 25, 15);
        int isFindMax2Result2 = calculator.findMax2(1, 2, 6);

        System.out.println("findMax2 result1 = " + isFindMax2Result1);
        System.out.println("findMax2 result2 = " + isFindMax2Result2);

        int isFindMax2V2Result1 = calculator.findMax2V2(5, 8, 10);
        int isFindMax2V2Result2 = calculator.findMax2V2(2, 5, 9);

        System.out.println("findMax2V2 result1 = " + isFindMax2V2Result1);
        System.out.println("findMax2V2 result2 = " + isFindMax2V2Result2);

    }

}
