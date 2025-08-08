package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.homework.productvalidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductDescriptionValidationRuleTest {
    //- RULE-7: не должно быть длиннее 2000 символов
//- RULE-8: должно содержать только английские буквы и цифры, другие символы не допустимы
    @Test
    public void shouldNotThrow() {
        Product product = new Product("Car breaker", 1234, "Very needed thing");
        ProductDescriptionValidationRule rule = new ProductDescriptionValidationRule();
        assertTrue(rule.validate(product).isEmpty());
    }

    @Test
    public void shouldThrowWhenGreaterThan2000Symbols() {
        Product product = new Product("Car breaker", 1234, "a".repeat(20001));
        ProductDescriptionValidationRule rule = new ProductDescriptionValidationRule();
        ValidationException expected = new ValidationException("RULE-7", "should be less than 2000 symbols", "description");
        assertTrue(rule.validate(product).contains(expected));
    }
    @Test
    public void shouldThrowWhenNonAlphanumeric() {
        Product product = new Product("Car breaker", 1234, "car_breaker!");
        ProductDescriptionValidationRule rule = new ProductDescriptionValidationRule();
        ValidationException expected = new ValidationException("RULE-8", "should be alpha-numeric", "description");
        assertTrue(rule.validate(product).contains(expected));
    }
}