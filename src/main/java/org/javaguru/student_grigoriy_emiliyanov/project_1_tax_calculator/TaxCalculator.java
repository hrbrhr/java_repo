package org.javaguru.student_grigoriy_emiliyanov.project_1_tax_calculator;

class TaxCalculator {
    private final double TAX_BELLOW_10K = 30;
    private final double TAX_10K_50K = 40;
    private final double TAX_ABOVE_50K = 50;

    double calculateTax(double income) {
        double tax = 0;
        if (income <= 10_000) {
            tax = getTaxBellow10k(income);
        } else if ((income > 10_000) && (income < 50_000)) {
            tax = getTaxFrom10kTo50k(income);
        } else if (income >= 50_000) {
            tax = getTaxOver50k(income);
        }
        return tax;
    }

    private double getTaxBellow10k(double income) {
        return (income / 100) * TAX_BELLOW_10K;
    }

    private double getTaxFrom10kTo50k(double income) {
        return getTaxBellow10k(10_000) + (((income - 10_000) / 100) * TAX_10K_50K);
    }

    private double getTaxOver50k(double income) {
        return getTaxFrom10kTo50k(50_000) + (((income - 50_000) / 100) * TAX_ABOVE_50K);
    }
}
