package org.javaguru.student_elena_tiutiunnikova.lesson_5.homework.level_5_middle;

class CompoundInterest {

    double CompoundInrterest (double sum, double rateYear, int termInYear, int timesOfInterestPerYear) {
       return sum * Math.pow(( 1 + (rateYear / timesOfInterestPerYear)), (timesOfInterestPerYear * termInYear));
    }
}
