package org.javaguru.student_grigoriy_emiliyanov.lesson_11_junit.homework;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @Test
    public void shouldReturn0WhenEmptyInput() {
        StringCalculator calculator = new StringCalculator();
        String input = "";
        int expected = 0;
        assertEquals(expected, calculator.add(input));
    }

    @Test
    public void shouldReturnInputWhenSingleArg() {
        StringCalculator calculator = new StringCalculator();
        String input = "1";
        int expected = 1;
        assertEquals(expected, calculator.add(input));
    }

    @Test
    public void shouldReturnSumWhenTwoArgs() {
        StringCalculator calculator = new StringCalculator();
        String input = "1,2";
        int expected = 3;
        assertEquals(expected, calculator.add(input));
    }

    @Test
    public void shouldReturnSumWhenMoreThanTwoArgs() {
        StringCalculator calculator = new StringCalculator();
        String input = "1,2,3,4,5,6";
        int expected = 21;
        assertEquals(expected, calculator.add(input));
    }

    //- “1\n23,4” (результат 10) - разрешённый ввод
    @Disabled
    public void shouldReturnSumWhenNewLineSeparatorNotFirst() {
        StringCalculator calculator = new StringCalculator();
        String input = "1\\n23,4";
        int expected = 28;
        assertEquals(expected, calculator.add(input));
    }
    @Test
    public void shouldReturnSumWhenNewLineSeparatorFirst() {
        StringCalculator calculator = new StringCalculator();
        String input = "\\n23,4";
        int expected = 27;
        assertEquals(expected, calculator.add(input));
    }
}