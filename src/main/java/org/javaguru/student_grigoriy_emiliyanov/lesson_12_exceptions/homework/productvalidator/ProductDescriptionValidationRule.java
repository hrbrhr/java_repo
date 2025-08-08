package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.homework.productvalidator;

import java.util.ArrayList;
import java.util.List;

class ProductDescriptionValidationRule implements FieldValidationRule {
    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> result = new ArrayList<>();
        if (product.getDescription().length() > 2000) {
            result.add(new ValidationException("RULE-7", "should be less than 2000 symbols", "description"));
        }
        if (!product.getDescription().matches("[A-Za-z0-9 ]+")) {
            result.add(new ValidationException("RULE-8", "should be alpha-numeric", "description"));
        }
        return result;
    }
}
