package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.homework.productvalidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductNameValidationRuleTest {
//- RULE-1: не должно быть пустым
//- RULE-2: не должно быть короче 3 символов
//- RULE-3: не должно быть длиннее 100 символов
//- RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы

    @Test
    public void shouldNotThrow() {
        Product product = new Product("Car breaker", 1234, "Very needed thing");
        ProductNameValidationRule rule = new ProductNameValidationRule();
        assertTrue(rule.validate(product).isEmpty());
    }

    @Test
    public void shouldThrowWhenEmpty() {
        Product product = new Product("", 1234, "Very handy thing");
        ProductNameValidationRule rule = new ProductNameValidationRule();
        ValidationException expected = new ValidationException("RULE-1", "should not be empty", "name");
        assertTrue(rule.validate(product).contains(expected));
    }
    @Test
    public void shouldThrowWhenShorterThan3Symbols() {
        Product product = new Product("ab", 1234, "Very handy thing");
        ProductNameValidationRule rule = new ProductNameValidationRule();
        ValidationException expected = new ValidationException("RULE-2", "should not be less than 3 symbols", "name");
        assertTrue(rule.validate(product).contains(expected));
    }
    @Test
    public void shouldThrowWhenLongerThan100Symbols() {
        Product product = new Product("a".repeat(101), 1234, "Very handy thing");
        ProductNameValidationRule rule = new ProductNameValidationRule();
        ValidationException expected = new ValidationException("RULE-3", "should not be longer than 100 symbols", "name");
        assertTrue(rule.validate(product).contains(expected));
    }
    @Test
    public void shouldThrowWhenNonAlphanumeric() {
        Product product = new Product("Car_breaker!", 1234, "very good thing");
        ProductNameValidationRule rule = new ProductNameValidationRule();
        ValidationException expected = new ValidationException("RULE-4", "should be alpha-numeric", "name");
        assertTrue(rule.validate(product).contains(expected));
    }
}