package org.javaguru.student_aleksey_volokitin.lesson_6_unit_testing.homework_plus.level_6_plus;

class SalaryTaxCalculator {

    public double calculate(double salary) {
        double tax = 0;
        if (salary < 0) {
            tax = 0;
        } else if (salaryUnder10k(salary)) {
            tax = calculateTaxWhenSalaryUnder10k(salary);
        } else if (salaryBetween10kAnd50k(salary)) {
            tax = calculateTaxWhenSalaryBetween10kAnd50K(salary);
        } else if (salaryOver50k(salary)) {
            tax = calculateTaxWhenSalaryOver50k(salary);
        } else {
            return tax;
        }
        return tax;
    }

    private static boolean salaryUnder10k (double salary) {
        if (salary < 10000) { return true; }
        else                { return false; }
    }

    private static boolean salaryBetween10kAnd50k (double salary) {
        if ((salary >= 10000) && (salary < 50000)) { return true; }
        else                                       { return false; }
    }

    private static boolean salaryOver50k (double salary) {
        if (salary >= 50000) { return true; }
        else                 { return false; }
    }

    private static double calculateTaxWhenSalaryUnder10k (double salary) {
        return (salary / 100) * 30;
    }

    private static double calculateTaxWhenSalaryBetween10kAnd50K (double salary) {
        return 3000 + (((salary - 10000) / 100) * 40);
    }

    private static double calculateTaxWhenSalaryOver50k (double salary) {
        return 19000 + (((salary - 50000) / 100) * 50);
    }
}
