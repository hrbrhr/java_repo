package org.javaguru.student_vasilii_khvan.lesson_5.level_3.task_1;

class TaxCalculator {

    double calculateTax(int salary) {
        if (salary >= 10000 && salary < 50000) {
            return salary * 0.4;
        } else if (salary >= 50000) {
            return salary * 0.5;
        }
        return salary * 0.3;
    }
}
