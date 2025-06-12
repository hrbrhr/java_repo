package org.javaguru.student_alexey_yakovlev.lesson_7.homework.level_4_middle.task_1;

class SalaryAnalysisApp {

    public static void main(String[] args) {
        SalaryAnalysis salaryAnalysis = new SalaryAnalysis();
        double[] salary = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};

        System.out.println(salaryAnalysis.calculateTotalSalaryExpenses(salary));
        System.out.println(salaryAnalysis.findMinSalary(salary));
        System.out.println(salaryAnalysis.findMaxSalary(salary));
        System.out.println(salaryAnalysis.findAverageSalary(salary));
    }
}
