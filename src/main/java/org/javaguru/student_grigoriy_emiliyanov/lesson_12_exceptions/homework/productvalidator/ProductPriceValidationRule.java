package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.homework.productvalidator;

import java.util.ArrayList;
import java.util.List;

class ProductPriceValidationRule implements FieldValidationRule {
    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> result = new ArrayList<>();
        if (product.getPrice() == 0) {
            result.add(new ValidationException("RULE-5", "should not be null", "price"));
        }
        if (product.getPrice() < 0.0) {
            result.add(new ValidationException("RULE-6", "should be greater than 0", "price"));
        }
        return result;
    }
}
