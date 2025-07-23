package org.javaguru.student_vasilii_khvan.lesson_5.level_5.task_1;

class CompoundInterest {

    double computeFeatureValue(double deposit, double interestRate, int numberOfYears) {
        return deposit + Math.pow(1 + interestRate, numberOfYears);
    }
}
