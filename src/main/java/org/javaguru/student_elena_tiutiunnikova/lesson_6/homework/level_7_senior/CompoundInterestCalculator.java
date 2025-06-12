package org.javaguru.student_elena_tiutiunnikova.lesson_6.homework.level_7_senior;

class CompoundInterestCalculator {

    public double compoundInterest(double sum,
                                   double interest,
                                   double years){
        return sum * Math.pow((1 + interest / 100), years);
    }

}
