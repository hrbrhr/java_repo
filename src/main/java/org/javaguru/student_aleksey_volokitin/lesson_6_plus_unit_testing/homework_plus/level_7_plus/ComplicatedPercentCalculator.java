package org.javaguru.student_aleksey_volokitin.lesson_6_plus_unit_testing.homework_plus.level_7_plus;

class ComplicatedPercentCalculator {
    // формула сложного процента: A = P * (1 + (r / n))^(n * t)
    //
    // A — будущая сумма (включая проценты);
    // P — первоначальная сумма (основной вклад или заём)
    // r — годовая процентная ставка (в процентах, например 5 (%))
    // n — количество периодов начисления процентов в году (ежемесячно = 12, ежегодно = 1)
    // t — срок в годах

    double calculate(double startSum,
                     double percentTax,
                     int periodAmount,
                     int yearAmount) {
        return startSum * Math.pow(1 + (percentTax / 100) / periodAmount, periodAmount * yearAmount);
    }
}
