package org.javaguru.student_alexey_yakovlev.lesson_7.homework.level_4_middle.task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryAnalysisTest {

    @Test
    void calculateTotalSalaryExpenses() {
        SalaryAnalysis salaryAnalysis = new SalaryAnalysis();
        double realResult = salaryAnalysis.calculateTotalSalaryExpenses(new double[]{2500.0, 3200.0, 1800.0, 4000.0, 2900.0});
//        System.out.println(realResult);
        assertTrue((realResult - 14400) < 0.0001);
    }

    @Test
    void findMinSalary() {
        SalaryAnalysis salaryAnalysis = new SalaryAnalysis();
        double realResult = salaryAnalysis.findMinSalary(new double[]{2500.0, 3200.0, 1800.0, 4000.0, 2900.0});
//        System.out.println(realResult);
        assertTrue((realResult - 1800) < 0.0001);
    }

    @Test
    void findMaxSalary() {
        SalaryAnalysis salaryAnalysis = new SalaryAnalysis();
        double realResult = salaryAnalysis.findMaxSalary(new double[]{2500.0, 3200.0, 1800.0, 4000.0, 2900.0});
//        System.out.println(realResult);
        assertTrue((realResult - 4000) < 0.0001);
    }

    @Test
    void findAverageSalary() {
        SalaryAnalysis salaryAnalysis = new SalaryAnalysis();
        double realResult = salaryAnalysis.findAverageSalary(new double[]{2500.0, 3200.0, 1800.0, 4000.0, 2900.0});
//        System.out.println(realResult);
        assertTrue((realResult - 2880) < 0.0001);
    }
}