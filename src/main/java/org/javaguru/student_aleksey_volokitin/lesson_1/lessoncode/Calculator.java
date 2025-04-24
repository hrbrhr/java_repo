package org.javaguru.student_aleksey_volokitin.lesson_1.lessoncode;

class Calculator {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 22;

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        int sub = num1 - num2;
        System.out.println("Subtraction: " + sub);

        int multiply = num1 * num2;
        System.out.println("Multiply: " + multiply);

        double divide = (double) num1 / num2;
        System.out.println("Divide: " + divide);
    }
}
