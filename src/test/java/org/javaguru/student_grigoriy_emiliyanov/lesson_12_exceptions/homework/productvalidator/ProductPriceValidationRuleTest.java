package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.homework.productvalidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductPriceValidationRuleTest {
//- RULE-5: не должна быть пустой
//- RULE-6: должна быть больше 0
    @Test
    public void shouldNotThrow() {
        Product product = new Product("Car breaker", 1234, "Very needed thing");
        ProductPriceValidationRule rule = new ProductPriceValidationRule();
        assertTrue(rule.validate(product).isEmpty());
    }

    @Test
    public void shouldThrowWhenZero() {
        Product product = new Product("Car breaker", 0, "its very handy");
        ProductPriceValidationRule rule = new ProductPriceValidationRule();
        ValidationException expected = new ValidationException("RULE-5", "should not be null", "price");
        assertTrue(rule.validate(product).contains(expected));
    }
    @Test
    public void shouldThrowWhenLessThanZero() {
        Product product = new Product("Car breaker", -12, "car_breaker!");
        ProductPriceValidationRule rule = new ProductPriceValidationRule();
        ValidationException expected = new ValidationException("RULE-6", "should be greater than 0", "price");
        assertTrue(rule.validate(product).contains(expected));
    }
}