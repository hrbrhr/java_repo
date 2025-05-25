package org.javaguru.student_alexey_yakovlev.lesson_5.homework.level_5_middle.task_1;

class CompoundInterestCalculate {

    double calculate (double principalAmount, double annualInterestRate, int numberOfYearsOfInvestment) {
        return principalAmount * Math.pow((1 + annualInterestRate), numberOfYearsOfInvestment);
    }


    /*
    A =    P×(1+r) в степени t

    A — будущая сумма (включая проценты)

    P — первоначальная сумма (основной капитал)
    r — годовая процентная ставка
    t — срок вклада/займа в годах

     */

}
