package org.javaguru.mentor.lesson_4_if_statement.lessoncode;

public class ScoreCalculatorApplication {

    public static void main(String[] args) {
        ScoreCalculator calculator = new ScoreCalculator();

        System.out.println(calculator.calculateScore(28));
        System.out.println(calculator.calculateScore(10));
        System.out.println(calculator.calculateScore(100));

        String score = calculator.calculateScore(23);
        // create document

    }

}
