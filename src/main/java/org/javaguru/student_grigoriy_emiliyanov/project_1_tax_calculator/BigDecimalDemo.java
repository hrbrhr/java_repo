package org.javaguru.student_grigoriy_emiliyanov.project_1_tax_calculator;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal first = new BigDecimal("0.1");
        BigDecimal second = new BigDecimal("0.2");
        BigDecimal sum = new BigDecimal("0.3");
        System.out.println(first.add(second));
        System.out.println((first.add(second)).equals(sum));
        System.out.println(0.1 + 0.2);
        System.out.println((0.1 + 0.2) == 0.3);
    }
}
