package org.javaguru.student_vitalii_lutsenko.lesson_5.classwork;

class CalculatorEvenApplication {

    public static void main(String[] args) {

        CalculatorEven calculator = new CalculatorEven();

        int number1 = 25;
        int number2 = 6;
        int number3 = 12;

        boolean isEvenResult1 = calculator.isEven(number1);
        boolean isEvenResult2 = calculator.isEven(number2);
        boolean isEvenResult3 = calculator.isEven(number3);

        System.out.println("isEven result1 = " + isEvenResult1);
        System.out.println("isEven result2 = " + isEvenResult2);
        System.out.println("isEven result3 = " + isEvenResult3);

        boolean isOddResult1 = calculator.isOdd(number1);
        boolean isOddResult2 = calculator.isOdd(number2);
        boolean isOddResult3 = calculator.isOdd(number3);

        System.out.println("isOdd result1 = " + isOddResult1);
        System.out.println("isOdd result2 = " + isOddResult2);
        System.out.println("isOdd result3 = " + isOddResult3);

        double average1 = calculator.findAverage(number1,number2);
        System.out.println("Average1 = " + average1);

        double average2 = calculator.findAverageV2(number1,number2);
        System.out.println("Average2 = " + average2);

        double maxNumber = calculator.maxNumber(number1,number2);
        System.out.println(" MaxNumber = " + maxNumber);

        double findMax3 = calculator.findMax3(number1,number2,number3);
        System.out.println(" FMaxNumber = " + findMax3);

        double findMaxV2 = calculator.findMaxV2(number1,number2,number3);
        System.out.println(" MaxNumberV2 = " + findMaxV2);


    }

}
