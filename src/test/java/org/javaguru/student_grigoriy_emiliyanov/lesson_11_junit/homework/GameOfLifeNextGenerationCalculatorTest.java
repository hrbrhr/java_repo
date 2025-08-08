package org.javaguru.student_grigoriy_emiliyanov.lesson_11_junit.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameOfLifeNextGenerationCalculatorTest {
    @Test
    public void shouldDieWhenLessThan2Neighbours() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[][]{
                {false, false, false},
                {false, true, false},
                {true, false, false},
        };
        boolean[][] expectedNextGeneration = new boolean[][]{
                {false, false, false},
                {false, false, false},
                {false, false, false},
        };
        assertEquals(expectedNextGeneration, calculator.calculate(currentGeneration));
    }

}