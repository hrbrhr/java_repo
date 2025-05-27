package org.javaguru.student_elena_tiutiunnikova.lesson_5.homework.level_5_middle;

class CompoundInterestApp {
    public static void main(String[] args) {
        CompoundInterest compoundInterest = new CompoundInterest();
        double sum1 = 1500;
        double rate1 = 0.15;
        int termInYear1 = 5;
        int timesOfInterestPerYear1 = 12;
        System.out.println("Итоговая сумма через " + termInYear1 + " лет с учетом начислений " + timesOfInterestPerYear1 + " раз в год составит: " + compoundInterest.CompoundInrterest(sum1, rate1, termInYear1, timesOfInterestPerYear1));
    }
}
