package org.javaguru.student_evgeniy_shendelev.lesson_5.level_5;

class CompoundInterest {

    double calculate(double principal, double percentPerYear, int numberOfYears) {
        return principal * Math.pow((1 + percentPerYear / 12), numberOfYears * 12);
    }
}
