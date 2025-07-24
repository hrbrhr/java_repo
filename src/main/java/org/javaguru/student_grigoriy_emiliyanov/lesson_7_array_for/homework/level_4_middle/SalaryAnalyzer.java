package org.javaguru.student_grigoriy_emiliyanov.lesson_7_array_for.homework.level_4_middle;

import java.util.Arrays;

class SalaryAnalyzer {
    public static void main(String[] args) {
        SalaryAnalyzer salaryAnalyzer = new SalaryAnalyzer();
        Double[] salaries = new Double[]{2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        System.out.println("Max: " + salaryAnalyzer.getMax(salaries));
        System.out.println("Min: " + salaryAnalyzer.getMin(salaries));
        System.out.println("Average: " + salaryAnalyzer.getAverage(salaries));
        System.out.println("Total: " + salaryAnalyzer.getTotal(salaries));
    }

    public double getTotal(Double[] salaries) {
        return Arrays.stream(salaries).reduce(0.0, Double::sum);
    }

    public double getMin(Double[] salaries) {
        if (salaries.length == 0) return 0.0;
        return Arrays.stream(salaries).reduce(Double.MAX_VALUE, Double::min);
    }

    public double getMax(Double[] salaries) {
        if (salaries.length == 0) return 0.0;
        return Arrays.stream(salaries).reduce(Double.MIN_VALUE, Double::max);
    }

    public double getAverage(Double[] salaries) {
        if (salaries.length == 0) return 0.0;
        return getTotal(salaries) / salaries.length;
    }

}
