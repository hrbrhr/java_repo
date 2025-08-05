package org.javaguru.student_grigoriy_emiliyanov.lesson_14_refactoring.homework;

class FraudDetector {

    boolean isFraud(Trader trader) {
        return hasBannedName(trader) || isFromBannedCity(trader);
    }

    boolean hasBannedName(Trader trader) {
        return trader.getName().equalsIgnoreCase("Pokemon");
    }

    boolean isFromBannedCity(Trader trader) {
        return trader.getCity().equalsIgnoreCase("Sydney");
    }

}
