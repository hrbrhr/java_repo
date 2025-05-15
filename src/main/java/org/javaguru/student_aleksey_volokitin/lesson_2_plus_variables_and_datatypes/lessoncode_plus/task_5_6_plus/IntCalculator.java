package org.javaguru.student_aleksey_volokitin.lesson_2_plus_variables_and_datatypes.lessoncode_plus.task_5_6_plus;

class IntCalculator {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;

        int additionResult = number1 + number2;
        int subtractionResult = number1 - number2;
        int multiplicationResult = number1 * number2;
        double divisionResult = number1 * 1.0d / number2;
        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);
    }
}
