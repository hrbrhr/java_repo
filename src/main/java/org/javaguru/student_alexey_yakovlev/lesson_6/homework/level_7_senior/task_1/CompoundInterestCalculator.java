package org.javaguru.student_alexey_yakovlev.lesson_6.homework.level_7_senior.task_1;

class CompoundInterestCalculator {

    public double compoundInterest(double sum,
                                   double interest,
                                   double years){
        return sum * Math.pow((1 + interest / 100), years);
    }

}
