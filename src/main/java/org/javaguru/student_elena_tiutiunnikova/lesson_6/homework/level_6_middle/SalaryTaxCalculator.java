package org.javaguru.student_elena_tiutiunnikova.lesson_6.homework.level_6_middle;

class SalaryTaxCalculator {

    public double calculate(double salary) {
        double tax = 0;
        if (salary < 0) {
            tax = 0;
        } else if (salary < 10000) {
            tax = calculateTaxTo10k(salary);
        } else if ((salary >= 10000) && (salary < 50000)) {
            tax = calculateTaxFrom10kTo50k(salary);
        } else if (salary >= 50000) {
            tax = calculateTaxFrom50k(salary);
        } else {
            return tax;
        }
        return tax;
    }

    public double calculateTaxTo10k (double salary) {
        return (salary / 100.0) * 30;
    }

    public double calculateTaxFrom10kTo50k (double salary) {
        return 3000.0 + (((salary - 10000.0) / 100) * 40);
    }

   public double calculateTaxFrom50k (double salary) {
        return 19000.0 + (((salary - 50000.0) / 100) * 50);
    }

}
