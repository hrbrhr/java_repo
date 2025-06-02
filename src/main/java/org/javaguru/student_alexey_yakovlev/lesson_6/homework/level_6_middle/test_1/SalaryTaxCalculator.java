package org.javaguru.student_alexey_yakovlev.lesson_6.homework.level_6_middle.test_1;

class SalaryTaxCalculator {

    public double calculate(double salary) {
        double tax = 0;
        if (salary < 0) {
            return salaryLessThanZero(salary);
        } else if (salary < 10000) {
            return salaryLessThan10K(salary);
        } else if ((salary >= 10000) && (salary < 50000)) {
            return salaryMoreThan10KAndLessThen50K(salary);
        } else if (salary >= 50000) {
            return salaryMoreThen50K(salary);
        } else {
            return tax;
        }
    }

    private double salaryLessThanZero(double salary) {
        return salary * 0;
    }

    private double salaryLessThan10K(double salary) {
        return (salary / 100) * 30;
    }

    private double salaryMoreThan10KAndLessThen50K(double salary) {
        return 3000 + (((salary - 10000) / 100) * 40);
    }

    private double salaryMoreThen50K(double salary) {
        return 19000 + (((salary - 50000) / 100) * 50);
    }

}
