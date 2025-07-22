package org.javaguru.student_grigorii_emelyanov.lesson_2_variables_and_data_types.lessoncode;

//Арифметические операции над целыми числами - калькулятор.
//        Напишите программу, которая выполняет все арифметические операции
//        (+/-/*/:) над целыми числами и выводит результаты на консоль.
class Calculator {
    public static void main(String[] args) {
        int firstNum = 100;
        int secondNum = 200;
        int addResult = firstNum + secondNum;
        int subResult = firstNum - secondNum;
        int multResult = firstNum * secondNum;
        int divResult = firstNum / secondNum;
        System.out.println(firstNum + " + " + secondNum + " = " + addResult);
        System.out.println(firstNum + " - " + secondNum + " = " + subResult);
        System.out.println(firstNum + " * " + secondNum + " = " + multResult);
        System.out.println(firstNum + " / " + secondNum + " = " + divResult);
    }
}
