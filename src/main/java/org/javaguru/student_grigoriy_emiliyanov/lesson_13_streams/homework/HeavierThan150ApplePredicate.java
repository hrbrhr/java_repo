package org.javaguru.student_grigoriy_emiliyanov.lesson_13_streams.homework;

class HeavierThan150ApplePredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
