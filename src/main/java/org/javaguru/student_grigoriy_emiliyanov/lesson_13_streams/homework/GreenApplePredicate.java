package org.javaguru.student_grigoriy_emiliyanov.lesson_13_streams.homework;

class GreenApplePredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equalsIgnoreCase("green");
    }
}
