package org.javaguru.student_elena_tiutiunnikova.lesson_5.lessoncode;

class CalculatorApp {
    public static void main(String[] args) {
    Calculator calculator = new Calculator();

    int number1 = 1;
    int number2 = 2;
    int number3 = 2;

    boolean isEvenResult1 = calculator.isEven(number1);
    boolean isEvenResult2 = calculator.isEven(number2);
    boolean isEvenResult3 = calculator.isEven(number3);

    System.out.println("isEven result1 = " + isEvenResult1);
    System.out.println("isEven result2 = " + isEvenResult2);
    System.out.println("isEven result3 = " + isEvenResult3);


    Calculator calculatorOdd = new Calculator();

    boolean isOddResult1 = calculatorOdd.isOdd(number1);
    boolean isOddResult2 = calculatorOdd.isOdd(number2);
    boolean isOddResult3 = calculatorOdd.isOdd(number3);

    System.out.println("isOdd result1 = " + isOddResult1);
    System.out.println("isOdd result2 = " + isOddResult2);
    System.out.println("isOdd result3 = " + isOddResult3);

    Calculator averagev1 = new Calculator();
    int average1 = calculator.averagev1(number1,number2);
    System.out.println("Average = " + average1);

    Calculator averagev2 = new Calculator();
    double average2 = calculator.averagev2(number1, number2);
    System.out.println("Average = " + average2);

    Calculator max = new Calculator();
    int number4 = 10;
    int number5 = 2;
    int max1 = calculator.findMaxNumber(number4,number5);
    System.out.println("Max = " + max1);


    Calculator max3 = new Calculator();
    int number6 = 25;
    int number7 = 2;
    int number8 = 10;
    int maxv3 = calculator.findMax3Number(number6, number7, number8);
    System.out.println("Max = " + maxv3);
 //test: 10.2.25 2.10.25 25.2.10

    }
}
