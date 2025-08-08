package org.javaguru.student_grigoriy_emiliyanov.lesson_14_refactoring.homework;

class TennisGameImpl implements TennisGame {
    private final String player1;
    private final String player2;

    private int score1 = 0;
    private int score2 = 0;

    public TennisGameImpl(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public void wonPoint(String playerName) {
    }

    @Override
    public String score() {
        return "";
    }
}
