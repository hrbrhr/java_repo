package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.lessoncode_plus.task_1_5_plus;

class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int number1 = 14;
        int number2 = 5;
        int number3 = 9;
        boolean isEvenResult = calculator.isEven(number1);
        boolean isOddResult = calculator.isOdd(number1);
        double averageNumber = calculator.findAverage(number1, number2);
        int maxOfTwoNumbers = calculator.findMaxOfTwoNumbers(number1, number2);
        int maxOfThreeNumbers = calculator.findMaxOfThreeNumbers(number1, number2, number3);

        System.out.println(number1 + " is even: " + isEvenResult);
        System.out.println(number1 + " is odd: " + isOddResult);
        System.out.println("Average of numbers " + number1 +
                           " and " + number2 +
                           " is: " + averageNumber);
        System.out.println("Max of numbers " + number1 +
                           " and " + number2 +
                           " is: " + maxOfTwoNumbers);
        System.out.println("Max of numbers " + number1 +
                ", " + number2 +
                ", " + number3 +
                " is: " + maxOfThreeNumbers);
    }
}
