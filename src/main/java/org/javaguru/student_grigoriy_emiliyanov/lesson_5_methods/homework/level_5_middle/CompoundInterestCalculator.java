package org.javaguru.student_grigoriy_emiliyanov.lesson_5_methods.homework.level_5_middle;

class CompoundInterestCalculator {
    public double calculateAnnual(double principle, double interestRate, int interestPeriod) {
        double finalAmount = principle * Math.pow(1 + interestRate, interestPeriod);
        return finalAmount - principle;
    }
}
