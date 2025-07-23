package org.javaguru.student_grigorii_emelyanov.lesson_5_methods.homework.level_5_middle;

class CompoundInterestDemo {
    public static void main(String[] args) {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();

        System.out.println("Principal: " + 1000 + ", " +
                "interest rate: " + 0.02 + ", " +
                "number of years: " + 10 +
                " will give you compound interest of: " +
                compoundInterestCalculator.calculateAnnual(1000, 0.2, 10));
        System.out.println("Principal: " + 1000 + ", " +
                "interest rate: " + 0.05 + ", " +
                "number of years: " + 10 +
                " will give you compound interest of: " +
                compoundInterestCalculator.calculateAnnual(1000, 0.2, 10));
        System.out.println("Principal: " + 1000 + ", " +
                "interest rate: " + 0.10 + ", " +
                "number of years: " + 10 +
                " will give you compound interest of: " +
                compoundInterestCalculator.calculateAnnual(1000, 0.2, 10));


    }
}
