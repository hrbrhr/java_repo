package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.homework.productvalidator;

import java.util.List;

interface FieldValidationRule {
    List<ValidationException> validate(Product product);
}
