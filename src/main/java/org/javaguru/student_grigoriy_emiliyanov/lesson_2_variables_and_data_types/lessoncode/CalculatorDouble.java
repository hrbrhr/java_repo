package org.javaguru.student_grigoriy_emiliyanov.lesson_2_variables_and_data_types.lessoncode;

//Арифметические операции над вещественными числами-калькулятор.
//Напишите программу,которая выполняет все арифметические операции
//(+/-/*/:) над вещественными числами и выводит результаты на консоль.
class CalculatorDouble {
    public static void main(String[] args) {
        double number1 = 1.5;
        double number2 = 2.7;
        double addResult = number1 + number2;
        double subResult = number1 - number2;
        double multResult = number1 * number2;
        double divResult = number1 / number2;
        System.out.println(number1 + " + " + number2 + " = " + addResult);
        System.out.println(number1 + " - " + number2 + " = " + subResult);
        System.out.println(number1 + " * " + number2 + " = " + multResult);
        System.out.println(number1 + " / " + number2 + " = " + divResult);
    }
}
