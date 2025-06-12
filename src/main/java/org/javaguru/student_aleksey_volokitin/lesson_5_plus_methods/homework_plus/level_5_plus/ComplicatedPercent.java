package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.homework_plus.level_5_plus;

class ComplicatedPercent {
    // формула сложного процента: A = P * (1 + (r / n))^(n * t)
    //
    // A — будущая сумма (включая проценты);
    // P — первоначальная сумма (основной вклад или заём)
    // r — годовая процентная ставка (в десятичной форме, например, 5% = 0,05)
    // n — количество периодов начисления процентов в году (ежемесячно = 12, ежегодно = 1)
    // t — срок в годах

    double calculate(double startSum,
                     double percentTax,
                     int periodAmount,
                     int yearAmount) {
        return startSum * Math.pow(1 + percentTax / periodAmount, periodAmount * yearAmount);
    }
}
