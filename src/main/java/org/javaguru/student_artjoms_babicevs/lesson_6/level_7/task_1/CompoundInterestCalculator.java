package org.javaguru.student_artjoms_babicevs.lesson_6.level_7.task_1;

class CompoundInterestCalculator {

    public double compoundInterest(double sum,
                                   double interest,
                                   double years){
        return sum * Math.pow((1 + interest / 100), years);
    }

}
