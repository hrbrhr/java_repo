package org.javaguru.student_vasilii_khvan.lesson_5.level_5.task_1;

class CompoundInterestApp {

    public static void main(String[] args) {
        CompoundInterest compoundInterest = new CompoundInterest();
        System.out.println(compoundInterest.computeFeatureValue(1000, 0.03, 3));
        System.out.println(compoundInterest.computeFeatureValue(1000, 0.05, 6));
        System.out.println(compoundInterest.computeFeatureValue(1000, 0.06, 4));
    }
}
