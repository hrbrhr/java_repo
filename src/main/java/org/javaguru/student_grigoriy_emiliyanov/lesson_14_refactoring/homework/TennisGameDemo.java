package org.javaguru.student_grigoriy_emiliyanov.lesson_14_refactoring.homework;

class TennisGameDemo {
    public static void main(String[] args) {
        TennisGame game = new TennisGameImpl("player1", "player2");

        game.score(); // -> "Love - Love"
        game.wonPoint("player1");
        game.score(); //-> "Fifteen - Love"
        game.wonPoint("player1");
        game.score(); //-> "Thirty - Love"
        game.wonPoint("player1");
        game.score(); //-> "Forty - Love"
        game.wonPoint("player2");
        game.score(); //-> "Forty - Fifteen"
        game.wonPoint("player2");
        game.score(); //-> "Forty - Thirty"
        game.wonPoint("player2");
        game.score(); //-> "Deuce"
        game.wonPoint("player2");
        game.score(); //-> "Advantage player2"
        game.wonPoint("player2");
        game.score(); //-> "Win player2"

    }
}
