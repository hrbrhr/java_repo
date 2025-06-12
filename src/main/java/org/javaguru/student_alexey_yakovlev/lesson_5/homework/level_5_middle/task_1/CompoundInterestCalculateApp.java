package org.javaguru.student_alexey_yakovlev.lesson_5.homework.level_5_middle.task_1;

class CompoundInterestCalculateApp {

    public static void main(String[] args) {
        CompoundInterestCalculate compoundInterestCalculate = new CompoundInterestCalculate();

        double principalAmount = 10_000;         // 10 000 руб.
        double annualInterestRate = 0.08;        // 8% годовых
        int numberOfYearsOfInvestment = 5;       // срок вклада — 5 лет

        System.out.println(compoundInterestCalculate.calculate(principalAmount,
                annualInterestRate,
                numberOfYearsOfInvestment)
        );

    }
}
