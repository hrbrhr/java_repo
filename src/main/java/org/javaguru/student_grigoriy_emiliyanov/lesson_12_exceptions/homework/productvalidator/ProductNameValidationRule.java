package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.homework.productvalidator;

import java.util.ArrayList;
import java.util.List;

class ProductNameValidationRule implements FieldValidationRule {
    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> result = new ArrayList<>();
        if (product.getName().isEmpty()) {
            result.add(new ValidationException("RULE-1", "should not be empty", "name"));
        }
        if (product.getName().length() < 3) {
            result.add(new ValidationException("RULE-2", "should not be less than 3 symbols", "name"));
        }
        if (product.getName().length() > 100) {
            result.add(new ValidationException("RULE-3", "should not be longer than 100 symbols", "name"));
        }
        if (!product.getName().matches("[A-Za-z0-9 ]+")) {
            result.add(new ValidationException("RULE-4", "should be alpha-numeric", "name"));
        }
        return result;
    }
}
