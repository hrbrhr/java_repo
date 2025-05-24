package org.javaguru.student_aleksey_volokitin.lesson_6_unit_testing.homework_plus.level_7_plus;

class CompoundInterestCalculator {

    public double compoundInterest(double sum,
                                   double interest,
                                   double years){
        return sum * Math.pow((1 + interest / 100), years);
    }

}
