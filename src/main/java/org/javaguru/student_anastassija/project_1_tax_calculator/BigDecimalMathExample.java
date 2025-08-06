package org.javaguru.student_anastassija.project_1_tax_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

class BigDecimalMathExample{
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("10.00");
        BigDecimal b = new BigDecimal("3");

        BigDecimal sum = a.add(b);                      // 10.00 + 3
        BigDecimal diff = a.subtract(b);                // 10.00 - 3
        BigDecimal product = a.multiply(b);             // 10.00 * 3
        BigDecimal quotient = a.divide(b, 2, RoundingMode.HALF_UP); // 10.00 / 3 → округляем до 2 знаков

        System.out.println("Сумма: " + sum);            // 13.00
        System.out.println("Разность: " + diff);        // 7.00
        System.out.println("Произведение: " + product); // 30.00
        System.out.println("Частное: " + quotient);     // 3.33
    }
}