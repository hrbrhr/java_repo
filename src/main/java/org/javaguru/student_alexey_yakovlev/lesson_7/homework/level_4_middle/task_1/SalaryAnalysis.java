package org.javaguru.student_alexey_yakovlev.lesson_7.homework.level_4_middle.task_1;

class SalaryAnalysis {

    public double  calculateTotalSalaryExpenses(double[] salary) {
        double totalSalaryExpenses = 0;
        for (int i = 0; i < salary.length; i++) {
            totalSalaryExpenses += salary[i];
        }
        return totalSalaryExpenses;
    }

    public double findMinSalary(double[] salary) {
        double minSalary = salary[0];
        for (int i = 1; i < salary.length; i++) {
            if (minSalary > salary[i]) {
                minSalary = salary[i];
            }
        }
        return minSalary;
    }

    public double findMaxSalary(double[] salary) {
        double maxSalary = salary[0];
        for (int i = 0; i < salary.length; i++) {
            if (maxSalary < salary[i]) {
                maxSalary = salary[i];
            }
        }
        return maxSalary;
    }

    public double findAverageSalary(double[] salary) {
        int count = 0;
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
            count++;
        }
        return sum / count;
    }
}
